
package fr.ratp.wsiv;

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
 * JAX-WS RI 2.2.4-b01
 * Generated source version: 2.2
 * 
 */
@WebServiceClient(name = "Wsiv", targetNamespace = "http://wsiv.ratp.fr", 
wsdlLocation = "file:wsiv.wsdl")
public class Wsiv
    extends Service
{

    private final static URL WSIV_WSDL_LOCATION;
    private final static WebServiceException WSIV_EXCEPTION;
    private final static QName WSIV_QNAME = new QName("http://wsiv.ratp.fr", "Wsiv");

    static {
        URL url = null;
        WebServiceException e = null;
        try {
            url = new URL("file:wsiv.wsdl");
        } catch (MalformedURLException ex) {
            e = new WebServiceException(ex);
        }
        WSIV_WSDL_LOCATION = url;
        WSIV_EXCEPTION = e;
    }

    public Wsiv() {
        super(__getWsdlLocation(), WSIV_QNAME);
    }

    public Wsiv(WebServiceFeature... features) {
        super(__getWsdlLocation(), WSIV_QNAME, features);
    }

    public Wsiv(URL wsdlLocation) {
        super(wsdlLocation, WSIV_QNAME);
    }

    public Wsiv(URL wsdlLocation, WebServiceFeature... features) {
        super(wsdlLocation, WSIV_QNAME, features);
    }

    public Wsiv(URL wsdlLocation, QName serviceName) {
        super(wsdlLocation, serviceName);
    }

    public Wsiv(URL wsdlLocation, QName serviceName, WebServiceFeature... features) {
        super(wsdlLocation, serviceName, features);
    }

    /**
     * 
     * @return
     *     returns WsivPortType
     */
    @WebEndpoint(name = "WsivSOAP11port_http")
    public WsivPortType getWsivSOAP11PortHttp() {
        return super.getPort(new QName("http://wsiv.ratp.fr", "WsivSOAP11port_http"), WsivPortType.class);
    }

    /**
     * 
     * @param features
     *     A list of {@link javax.xml.ws.WebServiceFeature} to configure on the proxy.  Supported features not in the <code>features</code> parameter will have their default values.
     * @return
     *     returns WsivPortType
     */
    @WebEndpoint(name = "WsivSOAP11port_http")
    public WsivPortType getWsivSOAP11PortHttp(WebServiceFeature... features) {
        return super.getPort(new QName("http://wsiv.ratp.fr", "WsivSOAP11port_http"), WsivPortType.class, features);
    }

    private static URL __getWsdlLocation() {
        if (WSIV_EXCEPTION!= null) {
            throw WSIV_EXCEPTION;
        }
        return WSIV_WSDL_LOCATION;
    }

}
