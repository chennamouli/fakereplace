package a.org.fakereplace.integration.jbossas.clientproxy;

import javax.ejb.Remote;

/**
 * @author Stuart Douglas
 */
@Remote
public interface RemoteInterface {

    String getValue();

    void setValue(String value);
}
