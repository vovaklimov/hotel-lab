import com.github.vovaklimov.hotel.hotel.Hotel;
import jakarta.xml.bind.JAXBContext;
import jakarta.xml.bind.JAXBException;
import jakarta.xml.bind.Unmarshaller;
import org.xml.sax.SAXException;

import javax.xml.XMLConstants;
import javax.xml.validation.Schema;
import javax.xml.validation.SchemaFactory;
import java.io.File;
import java.net.URISyntaxException;

public class JAXBMarshaller {

    public static void main(String[] args) throws URISyntaxException, SAXException, JAXBException {
        var sf = SchemaFactory.newInstance(XMLConstants.W3C_XML_SCHEMA_NS_URI);
        File schemaFile = new File(ClassLoader.getSystemResource("hotel.xsd").toURI());
        File xmlFile = new File(ClassLoader.getSystemResource("hotel.xml").toURI());
        File xmlOutputFile = new File("marshalled.xml");

        var schema = sf.newSchema(schemaFile);

        System.out.println("Unmarshalling XML file...");
        System.out.printf("Input file path: %s%n", xmlFile.getAbsolutePath());
        var hotel = unmarshall(Hotel.class, schema, xmlFile);
        System.out.println("Unmarshalled object: ");
        System.out.println(hotel.toString());

        System.out.println("Marshalling an object to XML file...");
        marshall(hotel, schema, xmlOutputFile);
        System.out.printf("Marshalled an object to XML file: %s%n", xmlOutputFile.getAbsolutePath());
    }
    public static <T> T unmarshall(Class<T> classToBeBound, Schema schema, File xmlFile) throws JAXBException {
        JAXBContext jaxbContext = JAXBContext.newInstance(classToBeBound);
        Unmarshaller unmarshaller = jaxbContext.createUnmarshaller();
        unmarshaller.setSchema(schema);

        unmarshaller.setEventHandler((event) -> {
            System.out.println(event);
            return false;
        });

        return classToBeBound.cast(unmarshaller.unmarshal(xmlFile));
    }

    public static <T> void marshall(T entity, Schema schema, File xmlFile) throws JAXBException {
        JAXBContext jaxbContext = JAXBContext.newInstance(entity.getClass());
        var marshaller = jaxbContext.createMarshaller();
        marshaller.setSchema(schema);

        marshaller.marshal(entity, xmlFile);
    }
}
