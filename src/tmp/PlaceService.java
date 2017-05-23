
package tmp;

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
@WebServiceClient(name = "PlaceService", targetNamespace = "http://tmp/", wsdlLocation = "http://localhost:8080/PlaceService?wsdl")
public class PlaceService
    extends Service
{

    private final static URL PLACESERVICE_WSDL_LOCATION;
    private final static WebServiceException PLACESERVICE_EXCEPTION;
    private final static QName PLACESERVICE_QNAME = new QName("http://tmp/", "PlaceService");

    static {
        URL url = null;
        WebServiceException e = null;
        try {
            url = new URL("http://localhost:8080/PlaceService?wsdl");
        } catch (MalformedURLException ex) {
            e = new WebServiceException(ex);
        }
        PLACESERVICE_WSDL_LOCATION = url;
        PLACESERVICE_EXCEPTION = e;
    }

    public PlaceService() {
        super(__getWsdlLocation(), PLACESERVICE_QNAME);
    }

    public PlaceService(WebServiceFeature... features) {
        super(__getWsdlLocation(), PLACESERVICE_QNAME, features);
    }

    public PlaceService(URL wsdlLocation) {
        super(wsdlLocation, PLACESERVICE_QNAME);
    }

    public PlaceService(URL wsdlLocation, WebServiceFeature... features) {
        super(wsdlLocation, PLACESERVICE_QNAME, features);
    }

    public PlaceService(URL wsdlLocation, QName serviceName) {
        super(wsdlLocation, serviceName);
    }

    public PlaceService(URL wsdlLocation, QName serviceName, WebServiceFeature... features) {
        super(wsdlLocation, serviceName, features);
    }

    /**
     * 
     * @return
     *     returns PlaceWebService
     */
    @WebEndpoint(name = "PlaceWebServicePort")
    public PlaceWebService getPlaceWebServicePort() {
        return super.getPort(new QName("http://tmp/", "PlaceWebServicePort"), PlaceWebService.class);
    }

    /**
     * 
     * @param features
     *     A list of {@link WebServiceFeature} to configure on the proxy.  Supported features not in the <code>features</code> parameter will have their default values.
     * @return
     *     returns PlaceWebService
     */
    @WebEndpoint(name = "PlaceWebServicePort")
    public PlaceWebService getPlaceWebServicePort(WebServiceFeature... features) {
        return super.getPort(new QName("http://tmp/", "PlaceWebServicePort"), PlaceWebService.class, features);
    }

    private static URL __getWsdlLocation() {
        if (PLACESERVICE_EXCEPTION!= null) {
            throw PLACESERVICE_EXCEPTION;
        }
        return PLACESERVICE_WSDL_LOCATION;
    }

}