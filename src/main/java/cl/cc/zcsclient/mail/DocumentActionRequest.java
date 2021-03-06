package cl.cc.zcsclient.mail;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

/**
 * <p>
 * Java class for documentActionRequest complex type.
 *
 * <p>
 * The following schema fragment specifies the expected content contained within
 * this class.
 *
 * <pre>
 * &lt;complexType name="documentActionRequest">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="action" type="{urn:zimbraMail}documentActionSelector"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 *
 *
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "documentActionRequest", propOrder = {
    "action"
})
public class DocumentActionRequest {

    @XmlElement(required = true)
    protected DocumentActionSelector action;

    /**
     * Gets the value of the action property.
     *
     * @return possible object is {@link DocumentActionSelector }
     *
     */
    public DocumentActionSelector getAction() {
        return action;
    }

    /**
     * Sets the value of the action property.
     *
     * @param value allowed object is {@link DocumentActionSelector }
     *
     */
    public void setAction(DocumentActionSelector value) {
        this.action = value;
    }

}
