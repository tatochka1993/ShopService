package by.epamproject.service.impl;

import by.epamproject.service.HelperSoapService;
import com.finalproject.webservice.impl.PriceDatabase;
import org.springframework.stereotype.Service;

import javax.xml.namespace.QName;
import java.net.URL;

@Service("helperSoapService")
public class HelperSoapServiceImpl implements HelperSoapService {

    @Override
    public double getCostByIdSoap(int productId) throws Exception {
        javax.xml.ws.Service service = connectToSoap();
        PriceDatabase productServer = service.getPort(PriceDatabase.class);
        return productServer.getCostById(productId);
    }

    @Override
    public void update(int productId, double cost) throws Exception {
        javax.xml.ws.Service service = connectToSoap();
        PriceDatabase productServer = service.getPort(PriceDatabase.class);
        productServer.update(productId, cost);
    }

    @Override
    public void delete(int productId) throws Exception {
        javax.xml.ws.Service service = connectToSoap();
        PriceDatabase productServer = service.getPort(PriceDatabase.class);
        productServer.delete(productId);
    }

    @Override
    public void create(int productId, double cost) throws Exception {
        javax.xml.ws.Service service = connectToSoap();
        PriceDatabase productServer = service.getPort(PriceDatabase.class);
        productServer.create(productId, cost);
    }

    private javax.xml.ws.Service connectToSoap() throws Exception {
        URL url = new URL("http://localhost:9999/ws/priceService?wsdl");
        QName qname = new QName("http://impl.webservice.finalproject.com/", "PriceDatabaseService");
        return javax.xml.ws.Service.create(url, qname);
    }


}
