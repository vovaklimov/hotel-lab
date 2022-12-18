package DOM;

import com.github.vovaklimov.hotel.booking.Booking;
import com.github.vovaklimov.hotel.common.TimeRange;
import common.Const;
import org.w3c.dom.Node;

import javax.xml.datatype.DatatypeFactory;
import java.math.BigInteger;
import java.util.stream.IntStream;

public class BookingDOMParser {
    public Booking parse(Node node) {
        var booking = new Booking();
        var bookingNodes = node.getChildNodes();

        IntStream.range(0, bookingNodes.getLength())
                .mapToObj(bookingNodes::item)
                .filter(n -> n.getLocalName() != null)
                .forEach(currentNode -> {
                    switch (currentNode.getLocalName()) {
                        case Const.ID_TAG -> {
                            var bookingId = new BigInteger(currentNode.getTextContent());
                            booking.setId(bookingId);
                        }
                        case Const.BOOKING_CLIENT_ID_TAG -> {
                            booking.setClientId(new BigInteger(currentNode.getTextContent()));
                        }
                        case Const.BOOKING_ROOM_ID_TAG -> {
                            booking.setRoomId(new BigInteger(currentNode.getTextContent()));
                        }
                        case Const.TIME_RANGE_TAG -> {
                            booking.setTimeRange(parseTimeRange(currentNode));
                        }
                    }
                });

        return booking;
    }

    public TimeRange parseTimeRange(Node node) {
        var timeRange = new TimeRange();
        var dtf = DatatypeFactory.newDefaultInstance();
        IntStream.range(0, node.getChildNodes().getLength())
                .mapToObj(node.getChildNodes()::item)
                .filter(n -> n.getLocalName() != null)
                .forEach(timeRangeNode -> {
                    switch (timeRangeNode.getLocalName()) {
                        case Const.TIME_RANGE_FROM_TAG -> {
                            timeRange.setFrom(dtf.newXMLGregorianCalendar(timeRangeNode.getTextContent()));
                        }
                        case Const.TIME_RANGE_TO_TAG -> {
                            timeRange.setTo(dtf.newXMLGregorianCalendar(timeRangeNode.getTextContent()));
                        }
                    }
                });

        return timeRange;
    }
}
