
package generated.com.github.vovaklimov.hotel.server;

import javax.xml.namespace.QName;
import jakarta.xml.bind.JAXBElement;
import jakarta.xml.bind.annotation.XmlElementDecl;
import jakarta.xml.bind.annotation.XmlRegistry;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the generated.com.github.vovaklimov.hotel.server package. 
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

    private final static QName _CreateBooking_QNAME = new QName("http://jaxws.server.hotel.vovaklimov.github.com/", "createBooking");
    private final static QName _CreateBookingResponse_QNAME = new QName("http://jaxws.server.hotel.vovaklimov.github.com/", "createBookingResponse");
    private final static QName _CreateClient_QNAME = new QName("http://jaxws.server.hotel.vovaklimov.github.com/", "createClient");
    private final static QName _CreateClientResponse_QNAME = new QName("http://jaxws.server.hotel.vovaklimov.github.com/", "createClientResponse");
    private final static QName _CreateRoom_QNAME = new QName("http://jaxws.server.hotel.vovaklimov.github.com/", "createRoom");
    private final static QName _CreateRoomResponse_QNAME = new QName("http://jaxws.server.hotel.vovaklimov.github.com/", "createRoomResponse");
    private final static QName _GetBookings_QNAME = new QName("http://jaxws.server.hotel.vovaklimov.github.com/", "getBookings");
    private final static QName _GetBookingsResponse_QNAME = new QName("http://jaxws.server.hotel.vovaklimov.github.com/", "getBookingsResponse");
    private final static QName _GetRooms_QNAME = new QName("http://jaxws.server.hotel.vovaklimov.github.com/", "getRooms");
    private final static QName _GetRoomsResponse_QNAME = new QName("http://jaxws.server.hotel.vovaklimov.github.com/", "getRoomsResponse");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: generated.com.github.vovaklimov.hotel.server
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link CreateBooking }
     * 
     */
    public CreateBooking createCreateBooking() {
        return new CreateBooking();
    }

    /**
     * Create an instance of {@link CreateBookingResponse }
     * 
     */
    public CreateBookingResponse createCreateBookingResponse() {
        return new CreateBookingResponse();
    }

    /**
     * Create an instance of {@link CreateClient }
     * 
     */
    public CreateClient createCreateClient() {
        return new CreateClient();
    }

    /**
     * Create an instance of {@link CreateClientResponse }
     * 
     */
    public CreateClientResponse createCreateClientResponse() {
        return new CreateClientResponse();
    }

    /**
     * Create an instance of {@link CreateRoom }
     * 
     */
    public CreateRoom createCreateRoom() {
        return new CreateRoom();
    }

    /**
     * Create an instance of {@link CreateRoomResponse }
     * 
     */
    public CreateRoomResponse createCreateRoomResponse() {
        return new CreateRoomResponse();
    }

    /**
     * Create an instance of {@link GetBookings }
     * 
     */
    public GetBookings createGetBookings() {
        return new GetBookings();
    }

    /**
     * Create an instance of {@link GetBookingsResponse }
     * 
     */
    public GetBookingsResponse createGetBookingsResponse() {
        return new GetBookingsResponse();
    }

    /**
     * Create an instance of {@link GetRooms }
     * 
     */
    public GetRooms createGetRooms() {
        return new GetRooms();
    }

    /**
     * Create an instance of {@link GetRoomsResponse }
     * 
     */
    public GetRoomsResponse createGetRoomsResponse() {
        return new GetRoomsResponse();
    }

    /**
     * Create an instance of {@link Room }
     * 
     */
    public Room createRoom() {
        return new Room();
    }

    /**
     * Create an instance of {@link Money }
     * 
     */
    public Money createMoney() {
        return new Money();
    }

    /**
     * Create an instance of {@link CreateBookingDTO }
     * 
     */
    public CreateBookingDTO createCreateBookingDTO() {
        return new CreateBookingDTO();
    }

    /**
     * Create an instance of {@link Booking }
     * 
     */
    public Booking createBooking() {
        return new Booking();
    }

    /**
     * Create an instance of {@link TimeRange }
     * 
     */
    public TimeRange createTimeRange() {
        return new TimeRange();
    }

    /**
     * Create an instance of {@link CreateRoomDTO }
     * 
     */
    public CreateRoomDTO createCreateRoomDTO() {
        return new CreateRoomDTO();
    }

    /**
     * Create an instance of {@link CreateClientDTO }
     * 
     */
    public CreateClientDTO createCreateClientDTO() {
        return new CreateClientDTO();
    }

    /**
     * Create an instance of {@link Address }
     * 
     */
    public Address createAddress() {
        return new Address();
    }

    /**
     * Create an instance of {@link Contact }
     * 
     */
    public Contact createContact() {
        return new Contact();
    }

    /**
     * Create an instance of {@link Client }
     * 
     */
    public Client createClient() {
        return new Client();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CreateBooking }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link CreateBooking }{@code >}
     */
    @XmlElementDecl(namespace = "http://jaxws.server.hotel.vovaklimov.github.com/", name = "createBooking")
    public JAXBElement<CreateBooking> createCreateBooking(CreateBooking value) {
        return new JAXBElement<CreateBooking>(_CreateBooking_QNAME, CreateBooking.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CreateBookingResponse }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link CreateBookingResponse }{@code >}
     */
    @XmlElementDecl(namespace = "http://jaxws.server.hotel.vovaklimov.github.com/", name = "createBookingResponse")
    public JAXBElement<CreateBookingResponse> createCreateBookingResponse(CreateBookingResponse value) {
        return new JAXBElement<CreateBookingResponse>(_CreateBookingResponse_QNAME, CreateBookingResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CreateClient }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link CreateClient }{@code >}
     */
    @XmlElementDecl(namespace = "http://jaxws.server.hotel.vovaklimov.github.com/", name = "createClient")
    public JAXBElement<CreateClient> createCreateClient(CreateClient value) {
        return new JAXBElement<CreateClient>(_CreateClient_QNAME, CreateClient.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CreateClientResponse }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link CreateClientResponse }{@code >}
     */
    @XmlElementDecl(namespace = "http://jaxws.server.hotel.vovaklimov.github.com/", name = "createClientResponse")
    public JAXBElement<CreateClientResponse> createCreateClientResponse(CreateClientResponse value) {
        return new JAXBElement<CreateClientResponse>(_CreateClientResponse_QNAME, CreateClientResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CreateRoom }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link CreateRoom }{@code >}
     */
    @XmlElementDecl(namespace = "http://jaxws.server.hotel.vovaklimov.github.com/", name = "createRoom")
    public JAXBElement<CreateRoom> createCreateRoom(CreateRoom value) {
        return new JAXBElement<CreateRoom>(_CreateRoom_QNAME, CreateRoom.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CreateRoomResponse }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link CreateRoomResponse }{@code >}
     */
    @XmlElementDecl(namespace = "http://jaxws.server.hotel.vovaklimov.github.com/", name = "createRoomResponse")
    public JAXBElement<CreateRoomResponse> createCreateRoomResponse(CreateRoomResponse value) {
        return new JAXBElement<CreateRoomResponse>(_CreateRoomResponse_QNAME, CreateRoomResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetBookings }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link GetBookings }{@code >}
     */
    @XmlElementDecl(namespace = "http://jaxws.server.hotel.vovaklimov.github.com/", name = "getBookings")
    public JAXBElement<GetBookings> createGetBookings(GetBookings value) {
        return new JAXBElement<GetBookings>(_GetBookings_QNAME, GetBookings.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetBookingsResponse }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link GetBookingsResponse }{@code >}
     */
    @XmlElementDecl(namespace = "http://jaxws.server.hotel.vovaklimov.github.com/", name = "getBookingsResponse")
    public JAXBElement<GetBookingsResponse> createGetBookingsResponse(GetBookingsResponse value) {
        return new JAXBElement<GetBookingsResponse>(_GetBookingsResponse_QNAME, GetBookingsResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetRooms }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link GetRooms }{@code >}
     */
    @XmlElementDecl(namespace = "http://jaxws.server.hotel.vovaklimov.github.com/", name = "getRooms")
    public JAXBElement<GetRooms> createGetRooms(GetRooms value) {
        return new JAXBElement<GetRooms>(_GetRooms_QNAME, GetRooms.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetRoomsResponse }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link GetRoomsResponse }{@code >}
     */
    @XmlElementDecl(namespace = "http://jaxws.server.hotel.vovaklimov.github.com/", name = "getRoomsResponse")
    public JAXBElement<GetRoomsResponse> createGetRoomsResponse(GetRoomsResponse value) {
        return new JAXBElement<GetRoomsResponse>(_GetRoomsResponse_QNAME, GetRoomsResponse.class, null, value);
    }

}
