#set( $symbol_pound = '#' )
#set( $symbol_dollar = '$' )
#set( $symbol_escape = '\' )

package ${package}.db;

import org.junit.Test;
import org.junit.Before;
import org.junit.runner.RunWith;
import static org.junit.Assert.*;

import org.hibernate.SessionFactory;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import ${package}.v01.types.Type;

/**
 *
 * @author <a href="mailto:mwe">me</a>
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = {"/hsqldb-inmemory-ctx.xml"})
public class DBServiceTest {


    private DbService sut;

    @Autowired
    private SessionFactory sessionFactory;

    /**
     * setup system under test, assign session factory.
     * @throws Exception should not happen
     */
    @Before
    public void setup() throws Exception {
        sut = new DbService();
        sut.setSessionFactory(sessionFactory);
    }

     /**
     * sucessfull get type.
     *
     * values are inserted into hsqldb via 'import.sql'.
     * @throws Exception should not happen
     */
    @Test
    public void testSuccessfullGetType() throws Exception {
        Type t = sut.getType(148432296L);
        assertEquals(84L, t.getArticleGroup());
        assertEquals(2L, t.getArticleNumber());
        assertEquals(3L, t.getFeatureNumber());
        assertEquals(1L, t.getQuantity());
        assertFalse(t.isPaid());
    }
}
