
package services;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the services package. 
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

    private final static QName _NewRecoveredResponse_QNAME = new QName("http://services/", "NewRecoveredResponse");
    private final static QName _TotalDeathsResponse_QNAME = new QName("http://services/", "TotalDeathsResponse");
    private final static QName _NewConfirmed_QNAME = new QName("http://services/", "NewConfirmed");
    private final static QName _NewDeathsResponse_QNAME = new QName("http://services/", "NewDeathsResponse");
    private final static QName _TotalDeaths_QNAME = new QName("http://services/", "TotalDeaths");
    private final static QName _NewConfirmedResponse_QNAME = new QName("http://services/", "NewConfirmedResponse");
    private final static QName _NewDeaths_QNAME = new QName("http://services/", "NewDeaths");
    private final static QName _NewRecovered_QNAME = new QName("http://services/", "NewRecovered");
    private final static QName _TotalConfirmedResponse_QNAME = new QName("http://services/", "TotalConfirmedResponse");
    private final static QName _TotalRecoveredResponse_QNAME = new QName("http://services/", "TotalRecoveredResponse");
    private final static QName _TotalConfirmed_QNAME = new QName("http://services/", "TotalConfirmed");
    private final static QName _TotalRecovered_QNAME = new QName("http://services/", "TotalRecovered");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: services
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link NewRecovered }
     * 
     */
    public NewRecovered createNewRecovered() {
        return new NewRecovered();
    }

    /**
     * Create an instance of {@link TotalConfirmedResponse }
     * 
     */
    public TotalConfirmedResponse createTotalConfirmedResponse() {
        return new TotalConfirmedResponse();
    }

    /**
     * Create an instance of {@link NewConfirmedResponse }
     * 
     */
    public NewConfirmedResponse createNewConfirmedResponse() {
        return new NewConfirmedResponse();
    }

    /**
     * Create an instance of {@link NewDeaths }
     * 
     */
    public NewDeaths createNewDeaths() {
        return new NewDeaths();
    }

    /**
     * Create an instance of {@link TotalRecovered }
     * 
     */
    public TotalRecovered createTotalRecovered() {
        return new TotalRecovered();
    }

    /**
     * Create an instance of {@link TotalRecoveredResponse }
     * 
     */
    public TotalRecoveredResponse createTotalRecoveredResponse() {
        return new TotalRecoveredResponse();
    }

    /**
     * Create an instance of {@link TotalConfirmed }
     * 
     */
    public TotalConfirmed createTotalConfirmed() {
        return new TotalConfirmed();
    }

    /**
     * Create an instance of {@link TotalDeathsResponse }
     * 
     */
    public TotalDeathsResponse createTotalDeathsResponse() {
        return new TotalDeathsResponse();
    }

    /**
     * Create an instance of {@link NewConfirmed }
     * 
     */
    public NewConfirmed createNewConfirmed() {
        return new NewConfirmed();
    }

    /**
     * Create an instance of {@link NewDeathsResponse }
     * 
     */
    public NewDeathsResponse createNewDeathsResponse() {
        return new NewDeathsResponse();
    }

    /**
     * Create an instance of {@link TotalDeaths }
     * 
     */
    public TotalDeaths createTotalDeaths() {
        return new TotalDeaths();
    }

    /**
     * Create an instance of {@link NewRecoveredResponse }
     * 
     */
    public NewRecoveredResponse createNewRecoveredResponse() {
        return new NewRecoveredResponse();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link NewRecoveredResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://services/", name = "NewRecoveredResponse")
    public JAXBElement<NewRecoveredResponse> createNewRecoveredResponse(NewRecoveredResponse value) {
        return new JAXBElement<NewRecoveredResponse>(_NewRecoveredResponse_QNAME, NewRecoveredResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link TotalDeathsResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://services/", name = "TotalDeathsResponse")
    public JAXBElement<TotalDeathsResponse> createTotalDeathsResponse(TotalDeathsResponse value) {
        return new JAXBElement<TotalDeathsResponse>(_TotalDeathsResponse_QNAME, TotalDeathsResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link NewConfirmed }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://services/", name = "NewConfirmed")
    public JAXBElement<NewConfirmed> createNewConfirmed(NewConfirmed value) {
        return new JAXBElement<NewConfirmed>(_NewConfirmed_QNAME, NewConfirmed.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link NewDeathsResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://services/", name = "NewDeathsResponse")
    public JAXBElement<NewDeathsResponse> createNewDeathsResponse(NewDeathsResponse value) {
        return new JAXBElement<NewDeathsResponse>(_NewDeathsResponse_QNAME, NewDeathsResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link TotalDeaths }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://services/", name = "TotalDeaths")
    public JAXBElement<TotalDeaths> createTotalDeaths(TotalDeaths value) {
        return new JAXBElement<TotalDeaths>(_TotalDeaths_QNAME, TotalDeaths.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link NewConfirmedResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://services/", name = "NewConfirmedResponse")
    public JAXBElement<NewConfirmedResponse> createNewConfirmedResponse(NewConfirmedResponse value) {
        return new JAXBElement<NewConfirmedResponse>(_NewConfirmedResponse_QNAME, NewConfirmedResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link NewDeaths }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://services/", name = "NewDeaths")
    public JAXBElement<NewDeaths> createNewDeaths(NewDeaths value) {
        return new JAXBElement<NewDeaths>(_NewDeaths_QNAME, NewDeaths.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link NewRecovered }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://services/", name = "NewRecovered")
    public JAXBElement<NewRecovered> createNewRecovered(NewRecovered value) {
        return new JAXBElement<NewRecovered>(_NewRecovered_QNAME, NewRecovered.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link TotalConfirmedResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://services/", name = "TotalConfirmedResponse")
    public JAXBElement<TotalConfirmedResponse> createTotalConfirmedResponse(TotalConfirmedResponse value) {
        return new JAXBElement<TotalConfirmedResponse>(_TotalConfirmedResponse_QNAME, TotalConfirmedResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link TotalRecoveredResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://services/", name = "TotalRecoveredResponse")
    public JAXBElement<TotalRecoveredResponse> createTotalRecoveredResponse(TotalRecoveredResponse value) {
        return new JAXBElement<TotalRecoveredResponse>(_TotalRecoveredResponse_QNAME, TotalRecoveredResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link TotalConfirmed }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://services/", name = "TotalConfirmed")
    public JAXBElement<TotalConfirmed> createTotalConfirmed(TotalConfirmed value) {
        return new JAXBElement<TotalConfirmed>(_TotalConfirmed_QNAME, TotalConfirmed.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link TotalRecovered }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://services/", name = "TotalRecovered")
    public JAXBElement<TotalRecovered> createTotalRecovered(TotalRecovered value) {
        return new JAXBElement<TotalRecovered>(_TotalRecovered_QNAME, TotalRecovered.class, null, value);
    }

}
