package cl.cc.zcsclient.util;

import cl.cc.zcsclient.HeaderContext;
import com.sun.xml.bind.api.JAXBRIContext;
import com.sun.xml.ws.api.message.Header;
import com.sun.xml.ws.api.message.Headers;
import com.sun.xml.ws.developer.WSBindingProvider;
import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBElement;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Marshaller;
import javax.xml.namespace.QName;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;
import org.w3c.dom.Document;

/**
 *
 * @author CyberCastle
 */
public class ZimbraSoapHeaderContextUtil {

    private final static QName _Context_QNAME = new QName("urn:zimbra", "context");

    public static void addSoapAuthHeader(WSBindingProvider bp, String authToken) throws JAXBException, ParserConfigurationException {
        JAXBRIContext.newInstance(HeaderContext.class);
        HeaderContext zimbraSoapHeaderContext = new HeaderContext();
        zimbraSoapHeaderContext.setAuthToken(authToken);

        DocumentBuilderFactory dbf = DocumentBuilderFactory.newInstance();
        dbf.setNamespaceAware(true);
        Document doc = dbf.newDocumentBuilder().newDocument();

        JAXBContext jaxb = JAXBContext.newInstance(HeaderContext.class);
        Marshaller marshaller = jaxb.createMarshaller();

        // HeaderContext doesn't have an @XmlRootElement annotation for some reason, however the JAXBElement
        // created using fact.createContext knows what the element name should be called, so use that.
        JAXBElement<HeaderContext> headerContextElement = new JAXBElement<>(_Context_QNAME, HeaderContext.class, null, zimbraSoapHeaderContext);
        marshaller.marshal(headerContextElement, doc);

        Header soapHeader = Headers.create(doc.getDocumentElement());
        bp.setOutboundHeaders(soapHeader);
    }
}
