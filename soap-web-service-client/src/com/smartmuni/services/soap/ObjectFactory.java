
package com.smartmuni.services.soap;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the com.smartmuni.services.soap package. 
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

    private final static QName _QueryResponse_QNAME = new QName("http://services.smartmuni.com/soap", "queryResponse");
    private final static QName _RetrieveResponse_QNAME = new QName("http://services.smartmuni.com/soap", "retrieveResponse");
    private final static QName _Create_QNAME = new QName("http://services.smartmuni.com/soap", "create");
    private final static QName _Update_QNAME = new QName("http://services.smartmuni.com/soap", "update");
    private final static QName _LoginResponse_QNAME = new QName("http://services.smartmuni.com/soap", "loginResponse");
    private final static QName _Query_QNAME = new QName("http://services.smartmuni.com/soap", "query");
    private final static QName _CreateResponse_QNAME = new QName("http://services.smartmuni.com/soap", "createResponse");
    private final static QName _Delete_QNAME = new QName("http://services.smartmuni.com/soap", "delete");
    private final static QName _Login_QNAME = new QName("http://services.smartmuni.com/soap", "login");
    private final static QName _LogoutResponse_QNAME = new QName("http://services.smartmuni.com/soap", "logoutResponse");
    private final static QName _DeleteResponse_QNAME = new QName("http://services.smartmuni.com/soap", "deleteResponse");
    private final static QName _Logout_QNAME = new QName("http://services.smartmuni.com/soap", "logout");
    private final static QName _UpdateResponse_QNAME = new QName("http://services.smartmuni.com/soap", "updateResponse");
    private final static QName _Retrieve_QNAME = new QName("http://services.smartmuni.com/soap", "retrieve");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: com.smartmuni.services.soap
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link Update }
     * 
     */
    public Update createUpdate() {
        return new Update();
    }

    /**
     * Create an instance of {@link LoginResponse }
     * 
     */
    public LoginResponse createLoginResponse() {
        return new LoginResponse();
    }

    /**
     * Create an instance of {@link Query }
     * 
     */
    public Query createQuery() {
        return new Query();
    }

    /**
     * Create an instance of {@link QueryResponse }
     * 
     */
    public QueryResponse createQueryResponse() {
        return new QueryResponse();
    }

    /**
     * Create an instance of {@link RetrieveResponse }
     * 
     */
    public RetrieveResponse createRetrieveResponse() {
        return new RetrieveResponse();
    }

    /**
     * Create an instance of {@link Create }
     * 
     */
    public Create createCreate() {
        return new Create();
    }

    /**
     * Create an instance of {@link DeleteResponse }
     * 
     */
    public DeleteResponse createDeleteResponse() {
        return new DeleteResponse();
    }

    /**
     * Create an instance of {@link Logout }
     * 
     */
    public Logout createLogout() {
        return new Logout();
    }

    /**
     * Create an instance of {@link UpdateResponse }
     * 
     */
    public UpdateResponse createUpdateResponse() {
        return new UpdateResponse();
    }

    /**
     * Create an instance of {@link Retrieve }
     * 
     */
    public Retrieve createRetrieve() {
        return new Retrieve();
    }

    /**
     * Create an instance of {@link CreateResponse }
     * 
     */
    public CreateResponse createCreateResponse() {
        return new CreateResponse();
    }

    /**
     * Create an instance of {@link Delete }
     * 
     */
    public Delete createDelete() {
        return new Delete();
    }

    /**
     * Create an instance of {@link Login }
     * 
     */
    public Login createLogin() {
        return new Login();
    }

    /**
     * Create an instance of {@link LogoutResponse }
     * 
     */
    public LogoutResponse createLogoutResponse() {
        return new LogoutResponse();
    }

    /**
     * Create an instance of {@link LoginResult }
     * 
     */
    public LoginResult createLoginResult() {
        return new LoginResult();
    }

    /**
     * Create an instance of {@link Error }
     * 
     */
    public Error createError() {
        return new Error();
    }

    /**
     * Create an instance of {@link SaveResult }
     * 
     */
    public SaveResult createSaveResult() {
        return new SaveResult();
    }

    /**
     * Create an instance of {@link DeleteResult }
     * 
     */
    public DeleteResult createDeleteResult() {
        return new DeleteResult();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link QueryResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://services.smartmuni.com/soap", name = "queryResponse")
    public JAXBElement<QueryResponse> createQueryResponse(QueryResponse value) {
        return new JAXBElement<QueryResponse>(_QueryResponse_QNAME, QueryResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link RetrieveResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://services.smartmuni.com/soap", name = "retrieveResponse")
    public JAXBElement<RetrieveResponse> createRetrieveResponse(RetrieveResponse value) {
        return new JAXBElement<RetrieveResponse>(_RetrieveResponse_QNAME, RetrieveResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Create }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://services.smartmuni.com/soap", name = "create")
    public JAXBElement<Create> createCreate(Create value) {
        return new JAXBElement<Create>(_Create_QNAME, Create.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Update }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://services.smartmuni.com/soap", name = "update")
    public JAXBElement<Update> createUpdate(Update value) {
        return new JAXBElement<Update>(_Update_QNAME, Update.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link LoginResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://services.smartmuni.com/soap", name = "loginResponse")
    public JAXBElement<LoginResponse> createLoginResponse(LoginResponse value) {
        return new JAXBElement<LoginResponse>(_LoginResponse_QNAME, LoginResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Query }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://services.smartmuni.com/soap", name = "query")
    public JAXBElement<Query> createQuery(Query value) {
        return new JAXBElement<Query>(_Query_QNAME, Query.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CreateResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://services.smartmuni.com/soap", name = "createResponse")
    public JAXBElement<CreateResponse> createCreateResponse(CreateResponse value) {
        return new JAXBElement<CreateResponse>(_CreateResponse_QNAME, CreateResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Delete }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://services.smartmuni.com/soap", name = "delete")
    public JAXBElement<Delete> createDelete(Delete value) {
        return new JAXBElement<Delete>(_Delete_QNAME, Delete.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Login }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://services.smartmuni.com/soap", name = "login")
    public JAXBElement<Login> createLogin(Login value) {
        return new JAXBElement<Login>(_Login_QNAME, Login.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link LogoutResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://services.smartmuni.com/soap", name = "logoutResponse")
    public JAXBElement<LogoutResponse> createLogoutResponse(LogoutResponse value) {
        return new JAXBElement<LogoutResponse>(_LogoutResponse_QNAME, LogoutResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DeleteResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://services.smartmuni.com/soap", name = "deleteResponse")
    public JAXBElement<DeleteResponse> createDeleteResponse(DeleteResponse value) {
        return new JAXBElement<DeleteResponse>(_DeleteResponse_QNAME, DeleteResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Logout }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://services.smartmuni.com/soap", name = "logout")
    public JAXBElement<Logout> createLogout(Logout value) {
        return new JAXBElement<Logout>(_Logout_QNAME, Logout.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link UpdateResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://services.smartmuni.com/soap", name = "updateResponse")
    public JAXBElement<UpdateResponse> createUpdateResponse(UpdateResponse value) {
        return new JAXBElement<UpdateResponse>(_UpdateResponse_QNAME, UpdateResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Retrieve }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://services.smartmuni.com/soap", name = "retrieve")
    public JAXBElement<Retrieve> createRetrieve(Retrieve value) {
        return new JAXBElement<Retrieve>(_Retrieve_QNAME, Retrieve.class, null, value);
    }

}
