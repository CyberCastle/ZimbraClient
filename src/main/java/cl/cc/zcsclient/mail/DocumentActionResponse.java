package cl.cc.zcsclient.mail;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

/**
 * <p>
 * Java class for documentActionResponse complex type.
 *
 * <p>
 * The following schema fragment specifies the expected content contained within
 * this class.
 *
 * <pre>
 * &lt;complexType name="documentActionResponse">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="action" type="{urn:zimbraMail}idAndOperation"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 *
 *
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "documentActionResponse", propOrder = {
    "action"
})
public class DocumentActionResponse {

    @XmlElement(required = true)
    protected IdAndOperation action;

    /**
     * Gets the value of the action property.
     *
     * @return possible object is {@link IdAndOperation }
     *
     */
    public IdAndOperation getAction() {
        return action;
    }

    /**
     * Sets the value of the action property.
     *
     * @param value allowed object is {@link IdAndOperation }
     *
     */
    public void setAction(IdAndOperation value) {
        this.action = value;
    }

}
