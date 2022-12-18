package DOM;

import com.github.vovaklimov.hotel.hotel.Hotel;
import common.Const;
import org.w3c.dom.Document;
import org.w3c.dom.Node;
import org.xml.sax.SAXException;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;
import javax.xml.validation.Schema;
import java.io.*;
import java.util.stream.IntStream;

public class DOMParser {
    private final ClientDOMParser clientDOMParser = new ClientDOMParser();
    private final BookingDOMParser bookingDomParser = new BookingDOMParser();
    private final RoomDOMParser roomDOMParser = new RoomDOMParser();

    private void parseNode(Node node, Hotel hotel) {
        var localName = node.getLocalName();
        if (localName == null) return;

        switch (localName) {
            case Const.ROOMS_TAG -> hotel.setRooms(parseHotelRooms(node));
            case Const.BOOKINGS_TAG -> hotel.setBookings(parseHotelBookings(node));
            case Const.CLIENTS_TAG -> hotel.setClients(parseHotelClients(node));
        }
    }

    private Hotel.Clients parseHotelClients(Node node) {
        var clientsContainer = new Hotel.Clients();
        IntStream.range(0, node.getChildNodes().getLength())
                .mapToObj(node.getChildNodes()::item)
                .filter(n -> n.getLocalName() != null)
                .map(clientDOMParser::parse)
                .forEach(clientsContainer.getClient()::add);

        return clientsContainer;
    }

    private Hotel.Bookings parseHotelBookings(Node node) {
        var bookingsContainer = new Hotel.Bookings();
        IntStream.range(0, node.getChildNodes().getLength())
                .mapToObj(node.getChildNodes()::item)
                .filter(n -> n.getLocalName() != null)
                .map(bookingDomParser::parse)
                .forEach(bookingsContainer.getBooking()::add);

        return bookingsContainer;
    }

    private Hotel.Rooms parseHotelRooms(Node node) {
        var roomsContainer = new Hotel.Rooms();
        IntStream.range(0, node.getChildNodes().getLength())
                .mapToObj(node.getChildNodes()::item)
                .filter(n -> n.getLocalName() != null)
                .map(roomDOMParser::parse)
                .forEach(roomsContainer.getRoom()::add);

        return roomsContainer;
    }

    public Hotel parse(InputStream in, Schema schema)
            throws ParserConfigurationException, SAXException, IOException {

        DocumentBuilderFactory dbf = DocumentBuilderFactory.newInstance();
        dbf.setNamespaceAware(true);
        dbf.setFeature("http://apache.org/xml/features/disallow-doctype-decl", true);
        dbf.setSchema(schema);

        DocumentBuilder db = dbf.newDocumentBuilder();
        Document document = db.parse(in);
        Node hotelNode = document.getFirstChild();

        Hotel hotel = new Hotel();
        var hotelNodes = hotelNode.getChildNodes();

        IntStream.range(0, hotelNodes.getLength())
                .forEach(idx ->
                        parseNode(hotelNodes.item(idx), hotel));

        return hotel;
    }

}
