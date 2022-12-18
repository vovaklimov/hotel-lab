import javax.xml.transform.TransformerException;
import java.io.File;

public class Main {
    public static void main(String[] args) throws TransformerException {
        XSLTTransformer transformer = new XSLTTransformer();

        System.out.println("Transforming XML to HTML 🔁");
        var xsl = new File(ClassLoader.getSystemResource("hotel.xsl").getPath());
        var html = new File("hotel-output.html");
        var xml = new File(ClassLoader.getSystemResource("hotel.xml").getPath());

        transformer.transform(xml, xsl, html);
        System.out.println("Done XML to HTML transformation 🍻");
    }
}
