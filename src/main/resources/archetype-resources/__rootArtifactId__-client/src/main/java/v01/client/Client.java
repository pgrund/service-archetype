#set( $symbol_pound = '#' )
#set( $symbol_dollar = '$' )
#set( $symbol_escape = '\' )
package ${package}.v01.client;

import org.springframework.context.support.ClassPathXmlApplicationContext;
import ${package}.v01.api.IServiceFacade;
/**
 *
 * @author rafsob
 */
public class Client {
    public static IServiceFacade getClient(String environment) throws Exception {
        String clientPath = "classpath:${parentArtifactId}-client-" + environment + "-ctx.xml";

        ClassPathXmlApplicationContext appCtx =
            new ClassPathXmlApplicationContext(new String[]{
                    clientPath});
        
        return (IServiceFacade)appCtx.getBean("${parentArtifactId}ServiceClient");
    }
}
