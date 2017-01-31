
package com.finalproject.webservice.impl;

import javax.xml.namespace.QName;
import javax.xml.ws.*;
import java.net.MalformedURLException;
import java.net.URL;


/**
 * This class was generated by the JAX-WS RI.
 * JAX-WS RI 2.2.9-b130926.1035
 * Generated source version: 2.2
 * 
 */
@WebServiceClient(name = "PriceDatabaseService", targetNamespace = "http://impl.webservice.finalproject.com/", wsdlLocation = "http://localhost:9999/ws/priceService?WSDL")
public class PriceDatabaseService
    extends Service
{

    private final static URL PRICEDATABASESERVICE_WSDL_LOCATION;
    private final static WebServiceException PRICEDATABASESERVICE_EXCEPTION;
    private final static QName PRICEDATABASESERVICE_QNAME = new QName("http://impl.webservice.finalproject.com/", "PriceDatabaseService");

    static {
        URL url = null;
        WebServiceException e = null;
        try {
            url = new URL("http://localhost:9999/ws/priceService?WSDL");
        } catch (MalformedURLException ex) {
            e = new WebServiceException(ex);
        }
        PRICEDATABASESERVICE_WSDL_LOCATION = url;
        PRICEDATABASESERVICE_EXCEPTION = e;
    }

    public PriceDatabaseService() {
        super(__getWsdlLocation(), PRICEDATABASESERVICE_QNAME);
    }

    public PriceDatabaseService(WebServiceFeature... features) {
        super(__getWsdlLocation(), PRICEDATABASESERVICE_QNAME, features);
    }

    public PriceDatabaseService(URL wsdlLocation) {
        super(wsdlLocation, PRICEDATABASESERVICE_QNAME);
    }

    public PriceDatabaseService(URL wsdlLocation, WebServiceFeature... features) {
        super(wsdlLocation, PRICEDATABASESERVICE_QNAME, features);
    }

    public PriceDatabaseService(URL wsdlLocation, QName serviceName) {
        super(wsdlLocation, serviceName);
    }

    public PriceDatabaseService(URL wsdlLocation, QName serviceName, WebServiceFeature... features) {
        super(wsdlLocation, serviceName, features);
    }

    /**
     * 
     * @return
     *     returns PriceDatabase
     */
    @WebEndpoint(name = "PriceDatabasePort")
    public PriceDatabase getPriceDatabasePort() {
        return super.getPort(new QName("http://impl.webservice.finalproject.com/", "PriceDatabasePort"), PriceDatabase.class);
    }

    /**
     * 
     * @param features
     *     A list of {@link WebServiceFeature} to configure on the proxy.  Supported features not in the <code>features</code> parameter will have their default values.
     * @return
     *     returns PriceDatabase
     */
    @WebEndpoint(name = "PriceDatabasePort")
    public PriceDatabase getPriceDatabasePort(WebServiceFeature... features) {
        return super.getPort(new QName("http://impl.webservice.finalproject.com/", "PriceDatabasePort"), PriceDatabase.class, features);
    }

    private static URL __getWsdlLocation() {
        if (PRICEDATABASESERVICE_EXCEPTION!= null) {
            throw PRICEDATABASESERVICE_EXCEPTION;
        }
        return PRICEDATABASESERVICE_WSDL_LOCATION;
    }

}
