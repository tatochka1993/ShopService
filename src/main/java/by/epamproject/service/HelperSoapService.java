package by.epamproject.service;

public interface HelperSoapService {

    double getCostByIdSoap(int productId) throws Exception;

    void update(int productId, double cost) throws Exception;

    void delete(int productId) throws Exception;

    void create(int productId, double cost) throws Exception;

}
