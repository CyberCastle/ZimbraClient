package cl.cc.zcsclient.mail;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

/**
 * <p>
 * Java class for getConvRequest complex type.
 *
 * <p>
 * The following schema fragment specifies the expected content contained within
 * this class.
 *
 * <pre>
 * &lt;complexType name="getConvRequest">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="c" type="{urn:zimbraMail}conversationSpec"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 *
 *
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "getConvRequest", propOrder = {
    "c"
})
public class GetConvRequest {

    @XmlElement(required = true)
    protected ConversationSpec c;

    /**
     * Gets the value of the c property.
     *
     * @return possible object is {@link ConversationSpec }
     *
     */
    public ConversationSpec getC() {
        return c;
    }

    /**
     * Sets the value of the c property.
     *
     * @param value allowed object is {@link ConversationSpec }
     *
     */
    public void setC(ConversationSpec value) {
        this.c = value;
    }

}
