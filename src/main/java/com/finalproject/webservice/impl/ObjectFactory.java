
package com.finalproject.webservice.impl;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each
 * Java content interface and Java element interface
 * generated in the com.finalproject.webservice.impl package.
 * <p>An ObjectFactory allows you to programatically
 * construct new instances of the Java representation
 * for XML content. The Java representation of XML
 * content can consist of schema derived interfaces
 * and classes representing the binding of schema
 * type definitions, element declarations and model
 * groups.  Factory methods for each of these are
 * provided in this class.
 *
 */
@XmlRegistry
public class ObjectFactory {

    private final static QName _GetCostById_QNAME = new QName("http://impl.webservice.finalproject.com/", "getCostById");
    private final static QName _DeleteResponse_QNAME = new QName("http://impl.webservice.finalproject.com/", "deleteResponse");
    private final static QName _GetAllPrices_QNAME = new QName("http://impl.webservice.finalproject.com/", "getAllPrices");
    private final static QName _GetCostByIdResponse_QNAME = new QName("http://impl.webservice.finalproject.com/", "getCostByIdResponse");
    private final static QName _UpdateResponse_QNAME = new QName("http://impl.webservice.finalproject.com/", "updateResponse");
    private final static QName _Delete_QNAME = new QName("http://impl.webservice.finalproject.com/", "delete");
    private final static QName _GetAllPricesResponse_QNAME = new QName("http://impl.webservice.finalproject.com/", "getAllPricesResponse");
    private final static QName _Create_QNAME = new QName("http://impl.webservice.finalproject.com/", "create");
    private final static QName _CreateResponse_QNAME = new QName("http://impl.webservice.finalproject.com/", "createResponse");
    private final static QName _Update_QNAME = new QName("http://impl.webservice.finalproject.com/", "update");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: com.finalproject.webservice.impl
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link GetAllPrices }
     * 
     */
    public GetAllPrices createGetAllPrices() {
        return new GetAllPrices();
    }

    /**
     * Create an instance of {@link DeleteResponse }
     * 
     */
    public DeleteResponse createDeleteResponse() {
        return new DeleteResponse();
    }

    /**
     * Create an instance of {@link GetCostById }
     * 
     */
    public GetCostById createGetCostById() {
        return new GetCostById();
    }

    /**
     * Create an instance of {@link Create }
     * 
     */
    public Create createCreate() {
        return new Create();
    }

    /**
     * Create an instance of {@link CreateResponse }
     * 
     */
    public CreateResponse createCreateResponse() {
        return new CreateResponse();
    }

    /**
     * Create an instance of {@link Update }
     * 
     */
    public Update createUpdate() {
        return new Update();
    }

    /**
     * Create an instance of {@link GetAllPricesResponse }
     * 
     */
    public GetAllPricesResponse createGetAllPricesResponse() {
        return new GetAllPricesResponse();
    }

    /**
     * Create an instance of {@link Delete }
     * 
     */
    public Delete createDelete() {
        return new Delete();
    }

    /**
     * Create an instance of {@link GetCostByIdResponse }
     * 
     */
    public GetCostByIdResponse createGetCostByIdResponse() {
        return new GetCostByIdResponse();
    }

    /**
     * Create an instance of {@link UpdateResponse }
     * 
     */
    public UpdateResponse createUpdateResponse() {
        return new UpdateResponse();
    }

    /**
     * Create an instance of {@link PriceDto }
     * 
     */
    public PriceDto createPriceDto() {
        return new PriceDto();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetCostById }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://impl.webservice.finalproject.com/", name = "getCostById")
    public JAXBElement<GetCostById> createGetCostById(GetCostById value) {
        return new JAXBElement<GetCostById>(_GetCostById_QNAME, GetCostById.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DeleteResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://impl.webservice.finalproject.com/", name = "deleteResponse")
    public JAXBElement<DeleteResponse> createDeleteResponse(DeleteResponse value) {
        return new JAXBElement<DeleteResponse>(_DeleteResponse_QNAME, DeleteResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetAllPrices }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://impl.webservice.finalproject.com/", name = "getAllPrices")
    public JAXBElement<GetAllPrices> createGetAllPrices(GetAllPrices value) {
        return new JAXBElement<GetAllPrices>(_GetAllPrices_QNAME, GetAllPrices.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetCostByIdResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://impl.webservice.finalproject.com/", name = "getCostByIdResponse")
    public JAXBElement<GetCostByIdResponse> createGetCostByIdResponse(GetCostByIdResponse value) {
        return new JAXBElement<GetCostByIdResponse>(_GetCostByIdResponse_QNAME, GetCostByIdResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link UpdateResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://impl.webservice.finalproject.com/", name = "updateResponse")
    public JAXBElement<UpdateResponse> createUpdateResponse(UpdateResponse value) {
        return new JAXBElement<UpdateResponse>(_UpdateResponse_QNAME, UpdateResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Delete }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://impl.webservice.finalproject.com/", name = "delete")
    public JAXBElement<Delete> createDelete(Delete value) {
        return new JAXBElement<Delete>(_Delete_QNAME, Delete.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetAllPricesResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://impl.webservice.finalproject.com/", name = "getAllPricesResponse")
    public JAXBElement<GetAllPricesResponse> createGetAllPricesResponse(GetAllPricesResponse value) {
        return new JAXBElement<GetAllPricesResponse>(_GetAllPricesResponse_QNAME, GetAllPricesResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Create }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://impl.webservice.finalproject.com/", name = "create")
    public JAXBElement<Create> createCreate(Create value) {
        return new JAXBElement<Create>(_Create_QNAME, Create.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CreateResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://impl.webservice.finalproject.com/", name = "createResponse")
    public JAXBElement<CreateResponse> createCreateResponse(CreateResponse value) {
        return new JAXBElement<CreateResponse>(_CreateResponse_QNAME, CreateResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Update }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://impl.webservice.finalproject.com/", name = "update")
    public JAXBElement<Update> createUpdate(Update value) {
        return new JAXBElement<Update>(_Update_QNAME, Update.class, null, value);
    }

}
