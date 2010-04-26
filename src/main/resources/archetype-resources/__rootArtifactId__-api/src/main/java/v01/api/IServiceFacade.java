#set( $symbol_pound = '#' )
#set( $symbol_dollar = '$' )
#set( $symbol_escape = '\' )
package ${package}.v01.api;

import ${package}.v01.exceptions.ServiceException;
import ${package}.v01.types.Type;

public interface IServiceFacade {

    /**
     * 
     * @param name : name
     *      Pre: not empty
     */
    String helloWorld(Type ourType) throws ServiceException;
}
