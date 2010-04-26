#set( $symbol_pound = '#' )
#set( $symbol_dollar = '$' )
#set( $symbol_escape = '\' )
/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package ${package}.service;

import ${package}.v01.api.IServiceFacade;
import ${package}.v01.types.Type;
import ${package}.v01.exceptions.ServiceException;


import javax.jws.WebService;
import org.apache.log4j.Logger;

/**
 *
 * @author pgrund,rafsob
 */
@WebService ( targetNamespace = "http://service.${parentArtifactId}.service.schlund.de",
   name = "${package}.service.${parentArtifactId}.IService")
public class ServiceImpl implements IServiceFacade {

    private static Logger LOG  = Logger.getLogger(ServiceImpl.class);

    public String helloWorld(Type ourType) throws ServiceException {
        LOG.debug("calling for " + ourType);
        return "Hello " + ourType;
    }
}
