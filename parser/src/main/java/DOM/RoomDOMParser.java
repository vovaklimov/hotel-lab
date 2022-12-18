package DOM;

import com.github.vovaklimov.hotel.common.Price;
import com.github.vovaklimov.hotel.room.Room;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;

import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.function.Consumer;
import java.util.stream.IntStream;

import static common.Const.*;

class RoomDOMParser {
    public Room parse(Node node) {
        var room = new Room();

        NodeList roomNodes = node.getChildNodes();
        IntStream.range(0, roomNodes.getLength())
                .mapToObj(roomNodes::item)
                .filter(n -> n.getLocalName() != null)
                .forEach(roomNode -> {
                    Consumer<String> setter = switch (roomNode.getLocalName()) {
                        case DESCRIPTION_TAG -> room::setDescription;
                        case SLEEPS_TAG -> s -> room.setSleeps(Integer.parseInt(s));
                        case NUMBER_TAG -> s -> room.setNumber(new BigInteger(s));
                        case SQUARE_TAG -> s -> room.setSquare(new BigDecimal(s));
                        case PRICE_TAG -> s -> {
                            var price = new Price();
                            price.setValue(new BigDecimal(s));
                            room.setPrice(price);
                        };
                        default -> null;
                    };
                    
                    if (setter != null) {
                        setter.accept(roomNode.getTextContent());
                    }
                });

        return room;
    }
}
