#set( $symbol_pound = '#' )
#set( $symbol_dollar = '$' )
#set( $symbol_escape = '\' )

package ${package}.db;

import ${package}.db.dto.ArticleDTO;
import ${package}.v01.types.Type;
import ${package}.v01.exceptions.ServiceException;

import org.apache.log4j.Logger;

import org.springframework.orm.hibernate3.support.HibernateDaoSupport;
import org.springframework.dao.DataAccessException;
/**
 *
 * @author <a href="mailto:me@1und1.de">me</a>
 */
public class DbService extends HibernateDaoSupport
        implements IDbService  {

    private static Logger LOG = Logger.getLogger(DbService.class);


    public Type getType(Long articleId) throws ServiceException {
        LOG.info("trying to get|" + articleId);
        if (articleId == null) {
            throw new ServiceException("missing param articleId");
        }
        
        ArticleDTO dto;
        try {
            dto = (ArticleDTO) getHibernateTemplate().get(
                    ArticleDTO.class, articleId);
        } catch (DataAccessException dae) {
             throw new ServiceException("no article found for " +
                     "id:" + articleId);
        }
        
        Type result = new Type();
        result.setId(dto.getArticleId());
        result.setArticleGroup(dto.getArticleGroupId());
        result.setArticleNumber(dto.getArticleNumber());
        result.setFeatureNumber(dto.getFeatureNumber());
        result.setQuantity(dto.getQuantity());
        result.setPaid(dto.getExtContractPos() != null);

        return result;
    }
}
