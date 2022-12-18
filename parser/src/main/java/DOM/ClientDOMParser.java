package DOM;

import com.github.vovaklimov.hotel.client.Client;
import com.github.vovaklimov.hotel.client.Contact;
import com.github.vovaklimov.hotel.common.Address;
import common.Const;
import jakarta.xml.bind.JAXBElement;
import org.w3c.dom.Node;

import javax.xml.namespace.QName;
import java.math.BigInteger;
import java.util.function.Consumer;
import java.util.stream.IntStream;

public class ClientDOMParser {
    public Client parse(Node node) {
        var client = new Client();
        var clientNodes = node.getChildNodes();

        IntStream.range(0, clientNodes.getLength())
                .mapToObj(clientNodes::item)
                .filter(n -> n.getLocalName() != null)
                .forEach(clientProperty -> {
                    switch (clientProperty.getLocalName()) {
                        case Const.ID_TAG -> {
                            var clientId = new BigInteger(clientProperty.getTextContent());
                            client.setId(clientId);
                        }
                        case Const.CLIENT_NAME_TAG -> client.setName(clientProperty.getTextContent());
                        case Const.ADDRESS_TAG -> {
                            var clientAddress = parseAddress(clientProperty);
                            var jaxbAddress = new JAXBElement<>(QName.valueOf(Const.ADDRESS_TAG), Address.class, clientAddress);
                            client.setAddress(jaxbAddress);
                        }
                        case Const.CONTACTS_TAG -> {
                            var contacts = new Client.Contacts();
                            IntStream.range(0, clientProperty.getChildNodes().getLength())
                                    .mapToObj(clientProperty.getChildNodes()::item)
                                    .filter(n -> n.getLocalName() != null)
                                    .map(this::parseContact)
                                    .forEach(contacts.getContact()::add);

                            client.setContacts(contacts);
                        }
                    }
                });

        return client;
    }

    private Address parseAddress(Node node) {
        var address = new Address();
        IntStream.range(0, node.getChildNodes().getLength())
                .mapToObj(node.getChildNodes()::item)
                .filter(n -> n.getLocalName() != null)
                .forEach(addressProperty -> {
                    Consumer<String> setter = null;
                    switch (addressProperty.getLocalName()) {
                        case Const.POSTAL_CODE_TAG -> address.setPostalCode(new BigInteger(addressProperty.getTextContent()));
                        case Const.CITY_TAG -> setter = address::setCity;
                        case Const.STREET_TAG -> setter = address::setStreet;
                        case Const.REGION_TAG -> setter = address::setRegion;
                    }

                    if (setter != null) {
                        setter.accept(addressProperty.getTextContent());
                    }
                });

        return address;
    }

    private Contact parseContact(Node node) {
        var contact = new Contact();
        IntStream.range(0, node.getChildNodes().getLength())
                .mapToObj(node.getChildNodes()::item)
                .filter(n -> n.getLocalName() != null)
                .forEach(contactNode -> {
                    Consumer<String> setter = switch (contactNode.getLocalName()) {
                        case Const.PHONE_TAG -> contact::setPhone;
                        case Const.EMAIL_TAG -> contact::setEmail;
                        default -> null;
                    };

                    if (setter != null) setter.accept(contactNode.getTextContent());
                });

        return contact;
    }
}