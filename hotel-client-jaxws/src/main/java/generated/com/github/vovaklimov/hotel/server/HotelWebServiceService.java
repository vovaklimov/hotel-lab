
package generated.com.github.vovaklimov.hotel.server;

import java.net.MalformedURLException;
import java.net.URL;
import javax.xml.namespace.QName;
import jakarta.xml.ws.Service;
import jakarta.xml.ws.WebEndpoint;
import jakarta.xml.ws.WebServiceClient;
import jakarta.xml.ws.WebServiceException;
import jakarta.xml.ws.WebServiceFeature;


/**
 * This class was generated by the JAX-WS RI.
 * JAX-WS RI 4.0.0-M4
 * Generated source version: 3.0
 * 
 */
@WebServiceClient(name = "HotelWebServiceService", targetNamespace = "http://jaxws.server.hotel.vovaklimov.github.com/", wsdlLocation = "http://localhost:8080/hotel?wsdl")
public class HotelWebServiceService
    extends Service
{

    private final static URL HOTELWEBSERVICESERVICE_WSDL_LOCATION;
    private final static WebServiceException HOTELWEBSERVICESERVICE_EXCEPTION;
    private final static QName HOTELWEBSERVICESERVICE_QNAME = new QName("http://jaxws.server.hotel.vovaklimov.github.com/", "HotelWebServiceService");

    static {
        URL url = null;
        WebServiceException e = null;
        try {
            url = new URL("http://localhost:8080/hotel?wsdl");
        } catch (MalformedURLException ex) {
            e = new WebServiceException(ex);
        }
        HOTELWEBSERVICESERVICE_WSDL_LOCATION = url;
        HOTELWEBSERVICESERVICE_EXCEPTION = e;
    }

    public HotelWebServiceService() {
        super(__getWsdlLocation(), HOTELWEBSERVICESERVICE_QNAME);
    }

    public HotelWebServiceService(WebServiceFeature... features) {
        super(__getWsdlLocation(), HOTELWEBSERVICESERVICE_QNAME, features);
    }

    public HotelWebServiceService(URL wsdlLocation) {
        super(wsdlLocation, HOTELWEBSERVICESERVICE_QNAME);
    }

    public HotelWebServiceService(URL wsdlLocation, WebServiceFeature... features) {
        super(wsdlLocation, HOTELWEBSERVICESERVICE_QNAME, features);
    }

    public HotelWebServiceService(URL wsdlLocation, QName serviceName) {
        super(wsdlLocation, serviceName);
    }

    public HotelWebServiceService(URL wsdlLocation, QName serviceName, WebServiceFeature... features) {
        super(wsdlLocation, serviceName, features);
    }

    /**
     * 
     * @return
     *     returns HotelWebService
     */
    @WebEndpoint(name = "HotelWebServicePort")
    public HotelWebService getHotelWebServicePort() {
        return super.getPort(new QName("http://jaxws.server.hotel.vovaklimov.github.com/", "HotelWebServicePort"), HotelWebService.class);
    }

    /**
     * 
     * @param features
     *     A list of {@link jakarta.xml.ws.WebServiceFeature} to configure on the proxy.  Supported features not in the <code>features</code> parameter will have their default values.
     * @return
     *     returns HotelWebService
     */
    @WebEndpoint(name = "HotelWebServicePort")
    public HotelWebService getHotelWebServicePort(WebServiceFeature... features) {
        return super.getPort(new QName("http://jaxws.server.hotel.vovaklimov.github.com/", "HotelWebServicePort"), HotelWebService.class, features);
    }

    private static URL __getWsdlLocation() {
        if (HOTELWEBSERVICESERVICE_EXCEPTION!= null) {
            throw HOTELWEBSERVICESERVICE_EXCEPTION;
        }
        return HOTELWEBSERVICESERVICE_WSDL_LOCATION;
    }

}
