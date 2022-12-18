import javax.xml.XMLConstants;
import javax.xml.transform.Transformer;
import javax.xml.transform.TransformerException;
import javax.xml.transform.TransformerFactory;
import javax.xml.transform.stream.StreamResult;
import javax.xml.transform.stream.StreamSource;
import java.io.File;

public class XSLTTransformer {
    public void transform(File xml, File xsl, File html) throws TransformerException {
        TransformerFactory factory = TransformerFactory.newInstance();
        factory.setAttribute(XMLConstants.ACCESS_EXTERNAL_DTD, "");
		factory.setAttribute(XMLConstants.ACCESS_EXTERNAL_STYLESHEET, "");

        Transformer t = factory.newTransformer(new StreamSource(xsl));
        t.transform(new StreamSource(xml), new StreamResult(html));

        System.out.println("Input  xml: " + xml.getAbsolutePath());
		System.out.println("Input  xsl: " + xsl.getAbsolutePath());
		System.out.println("Output html: " + html.getAbsolutePath());
    }
}
