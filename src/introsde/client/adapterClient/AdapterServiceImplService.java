
package introsde.client.adapterClient;

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
@WebServiceClient(name = "AdapterServiceImplService", targetNamespace = "http://ws.adapter.introsde/", wsdlLocation = "https://quiet-gorge-90409.herokuapp.com/ws/adapter?wsdl")
public class AdapterServiceImplService
    extends Service
{

    private final static URL ADAPTERSERVICEIMPLSERVICE_WSDL_LOCATION;
    private final static WebServiceException ADAPTERSERVICEIMPLSERVICE_EXCEPTION;
    private final static QName ADAPTERSERVICEIMPLSERVICE_QNAME = new QName("http://ws.adapter.introsde/", "AdapterServiceImplService");

    static {
        URL url = null;
        WebServiceException e = null;
        try {
            url = new URL("https://quiet-gorge-90409.herokuapp.com/ws/adapter?wsdl");
        } catch (MalformedURLException ex) {
            e = new WebServiceException(ex);
        }
        ADAPTERSERVICEIMPLSERVICE_WSDL_LOCATION = url;
        ADAPTERSERVICEIMPLSERVICE_EXCEPTION = e;
    }

    public AdapterServiceImplService() {
        super(__getWsdlLocation(), ADAPTERSERVICEIMPLSERVICE_QNAME);
    }

    public AdapterServiceImplService(WebServiceFeature... features) {
        super(__getWsdlLocation(), ADAPTERSERVICEIMPLSERVICE_QNAME, features);
    }

    public AdapterServiceImplService(URL wsdlLocation) {
        super(wsdlLocation, ADAPTERSERVICEIMPLSERVICE_QNAME);
    }

    public AdapterServiceImplService(URL wsdlLocation, WebServiceFeature... features) {
        super(wsdlLocation, ADAPTERSERVICEIMPLSERVICE_QNAME, features);
    }

    public AdapterServiceImplService(URL wsdlLocation, QName serviceName) {
        super(wsdlLocation, serviceName);
    }

    public AdapterServiceImplService(URL wsdlLocation, QName serviceName, WebServiceFeature... features) {
        super(wsdlLocation, serviceName, features);
    }

    /**
     *
     * @return
     *     returns AdapterService
     */
    @WebEndpoint(name = "AdapterServiceImplPort")
    public AdapterService getAdapterServiceImplPort() {
        return super.getPort(new QName("http://ws.adapter.introsde/", "AdapterServiceImplPort"), AdapterService.class);
    }

    /**
     *
     * @param features
     *     A list of {@link javax.xml.ws.WebServiceFeature} to configure on the proxy.  Supported features not in the <code>features</code> parameter will have their default values.
     * @return
     *     returns AdapterService
     */
    @WebEndpoint(name = "AdapterServiceImplPort")
    public AdapterService getAdapterServiceImplPort(WebServiceFeature... features) {
        return super.getPort(new QName("http://ws.adapter.introsde/", "AdapterServiceImplPort"), AdapterService.class, features);
    }

    private static URL __getWsdlLocation() {
        if (ADAPTERSERVICEIMPLSERVICE_EXCEPTION!= null) {
            throw ADAPTERSERVICEIMPLSERVICE_EXCEPTION;
        }
        return ADAPTERSERVICEIMPLSERVICE_WSDL_LOCATION;
    }

}
