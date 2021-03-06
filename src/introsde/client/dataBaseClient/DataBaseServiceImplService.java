
package introsde.client.dataBaseClient;

import java.net.MalformedURLException;
import java.net.URL;
import javax.xml.namespace.QName;
import javax.xml.ws.Service;
import javax.xml.ws.WebEndpoint;
import javax.xml.ws.WebServiceClient;
import javax.xml.ws.WebServiceException;
import javax.xml.ws.WebServiceFeature;


/**
 * This class was generated by the JAX-WS RI.
 * JAX-WS RI 2.2.9-b130926.1035
 * Generated source version: 2.2
 *
 */
@WebServiceClient(name = "DataBaseServiceImplService", targetNamespace = "http://ws.introsde/", wsdlLocation = "https://quiet-sierra-93495.herokuapp.com/ws/database?wsdl")
public class DataBaseServiceImplService
    extends Service
{

    private final static URL DATABASESERVICEIMPLSERVICE_WSDL_LOCATION;
    private final static WebServiceException DATABASESERVICEIMPLSERVICE_EXCEPTION;
    private final static QName DATABASESERVICEIMPLSERVICE_QNAME = new QName("http://ws.introsde/", "DataBaseServiceImplService");

    static {
        URL url = null;
        WebServiceException e = null;
        try {
            url = new URL("https://quiet-sierra-93495.herokuapp.com/ws/database?wsdl");
        } catch (MalformedURLException ex) {
            e = new WebServiceException(ex);
        }
        DATABASESERVICEIMPLSERVICE_WSDL_LOCATION = url;
        DATABASESERVICEIMPLSERVICE_EXCEPTION = e;
    }

    public DataBaseServiceImplService() {
        super(__getWsdlLocation(), DATABASESERVICEIMPLSERVICE_QNAME);
    }

    public DataBaseServiceImplService(WebServiceFeature... features) {
        super(__getWsdlLocation(), DATABASESERVICEIMPLSERVICE_QNAME, features);
    }

    public DataBaseServiceImplService(URL wsdlLocation) {
        super(wsdlLocation, DATABASESERVICEIMPLSERVICE_QNAME);
    }

    public DataBaseServiceImplService(URL wsdlLocation, WebServiceFeature... features) {
        super(wsdlLocation, DATABASESERVICEIMPLSERVICE_QNAME, features);
    }

    public DataBaseServiceImplService(URL wsdlLocation, QName serviceName) {
        super(wsdlLocation, serviceName);
    }

    public DataBaseServiceImplService(URL wsdlLocation, QName serviceName, WebServiceFeature... features) {
        super(wsdlLocation, serviceName, features);
    }

    /**
     *
     * @return
     *     returns DataBaseService
     */
    @WebEndpoint(name = "DataBaseServiceImplPort")
    public DataBaseService getDataBaseServiceImplPort() {
        return super.getPort(new QName("http://ws.introsde/", "DataBaseServiceImplPort"), DataBaseService.class);
    }

    /**
     *
     * @param features
     *     A list of {@link javax.xml.ws.WebServiceFeature} to configure on the proxy.  Supported features not in the <code>features</code> parameter will have their default values.
     * @return
     *     returns DataBaseService
     */
    @WebEndpoint(name = "DataBaseServiceImplPort")
    public DataBaseService getDataBaseServiceImplPort(WebServiceFeature... features) {
        return super.getPort(new QName("http://ws.introsde/", "DataBaseServiceImplPort"), DataBaseService.class, features);
    }

    private static URL __getWsdlLocation() {
        if (DATABASESERVICEIMPLSERVICE_EXCEPTION!= null) {
            throw DATABASESERVICEIMPLSERVICE_EXCEPTION;
        }
        return DATABASESERVICEIMPLSERVICE_WSDL_LOCATION;
    }

}
