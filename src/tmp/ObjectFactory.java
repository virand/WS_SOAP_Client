
package tmp;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the tmp package. 
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

    private final static QName _ChangePlaceResponse_QNAME = new QName("http://tmp/", "changePlaceResponse");
    private final static QName _CreatePLace_QNAME = new QName("http://tmp/", "createPLace");
    private final static QName _DeletePlace_QNAME = new QName("http://tmp/", "deletePlace");
    private final static QName _GetPlaces_QNAME = new QName("http://tmp/", "getPlaces");
    private final static QName _CreatePLaceResponse_QNAME = new QName("http://tmp/", "createPLaceResponse");
    private final static QName _GetPlacesResponse_QNAME = new QName("http://tmp/", "getPlacesResponse");
    private final static QName _IllegalNameException_QNAME = new QName("http://tmp/", "IllegalNameException");
    private final static QName _ChangePlace_QNAME = new QName("http://tmp/", "changePlace");
    private final static QName _DeletePlaceResponse_QNAME = new QName("http://tmp/", "deletePlaceResponse");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: tmp
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link CreatePLaceResponse }
     * 
     */
    public CreatePLaceResponse createCreatePLaceResponse() {
        return new CreatePLaceResponse();
    }

    /**
     * Create an instance of {@link GetPlacesResponse }
     * 
     */
    public GetPlacesResponse createGetPlacesResponse() {
        return new GetPlacesResponse();
    }

    /**
     * Create an instance of {@link ChangePlaceResponse }
     * 
     */
    public ChangePlaceResponse createChangePlaceResponse() {
        return new ChangePlaceResponse();
    }

    /**
     * Create an instance of {@link CreatePLace }
     * 
     */
    public CreatePLace createCreatePLace() {
        return new CreatePLace();
    }

    /**
     * Create an instance of {@link DeletePlace }
     * 
     */
    public DeletePlace createDeletePlace() {
        return new DeletePlace();
    }

    /**
     * Create an instance of {@link GetPlaces }
     * 
     */
    public GetPlaces createGetPlaces() {
        return new GetPlaces();
    }

    /**
     * Create an instance of {@link ChangePlace }
     * 
     */
    public ChangePlace createChangePlace() {
        return new ChangePlace();
    }

    /**
     * Create an instance of {@link PlaceServiceFault }
     * 
     */
    public PlaceServiceFault createPlaceServiceFault() {
        return new PlaceServiceFault();
    }

    /**
     * Create an instance of {@link DeletePlaceResponse }
     * 
     */
    public DeletePlaceResponse createDeletePlaceResponse() {
        return new DeletePlaceResponse();
    }

    /**
     * Create an instance of {@link Place }
     * 
     */
    public Place createPlace() {
        return new Place();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ChangePlaceResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://tmp/", name = "changePlaceResponse")
    public JAXBElement<ChangePlaceResponse> createChangePlaceResponse(ChangePlaceResponse value) {
        return new JAXBElement<ChangePlaceResponse>(_ChangePlaceResponse_QNAME, ChangePlaceResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CreatePLace }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://tmp/", name = "createPLace")
    public JAXBElement<CreatePLace> createCreatePLace(CreatePLace value) {
        return new JAXBElement<CreatePLace>(_CreatePLace_QNAME, CreatePLace.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DeletePlace }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://tmp/", name = "deletePlace")
    public JAXBElement<DeletePlace> createDeletePlace(DeletePlace value) {
        return new JAXBElement<DeletePlace>(_DeletePlace_QNAME, DeletePlace.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetPlaces }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://tmp/", name = "getPlaces")
    public JAXBElement<GetPlaces> createGetPlaces(GetPlaces value) {
        return new JAXBElement<GetPlaces>(_GetPlaces_QNAME, GetPlaces.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CreatePLaceResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://tmp/", name = "createPLaceResponse")
    public JAXBElement<CreatePLaceResponse> createCreatePLaceResponse(CreatePLaceResponse value) {
        return new JAXBElement<CreatePLaceResponse>(_CreatePLaceResponse_QNAME, CreatePLaceResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetPlacesResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://tmp/", name = "getPlacesResponse")
    public JAXBElement<GetPlacesResponse> createGetPlacesResponse(GetPlacesResponse value) {
        return new JAXBElement<GetPlacesResponse>(_GetPlacesResponse_QNAME, GetPlacesResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link PlaceServiceFault }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://tmp/", name = "IllegalNameException")
    public JAXBElement<PlaceServiceFault> createIllegalNameException(PlaceServiceFault value) {
        return new JAXBElement<PlaceServiceFault>(_IllegalNameException_QNAME, PlaceServiceFault.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ChangePlace }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://tmp/", name = "changePlace")
    public JAXBElement<ChangePlace> createChangePlace(ChangePlace value) {
        return new JAXBElement<ChangePlace>(_ChangePlace_QNAME, ChangePlace.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DeletePlaceResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://tmp/", name = "deletePlaceResponse")
    public JAXBElement<DeletePlaceResponse> createDeletePlaceResponse(DeletePlaceResponse value) {
        return new JAXBElement<DeletePlaceResponse>(_DeletePlaceResponse_QNAME, DeletePlaceResponse.class, null, value);
    }

}
