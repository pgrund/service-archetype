#set( $symbol_pound = '#' )
#set( $symbol_dollar = '$' )
#set( $symbol_escape = '\' )
package ${package}.db;

import ${package}.v01.types.Type;
import ${package}.v01.exceptions.ServiceException;

/**
 * interface for db service.
 * @author <a href="peter.grund@1und1.de">Peter Grund</a>
 */
public interface IDbService {

    /**
     * get type.
     * @param articleId id of matching article
     * @return {@link Type}
     * @throws ServiceException exception for db error
     */
     Type getType(Long articleId)
             throws ServiceException;

}
