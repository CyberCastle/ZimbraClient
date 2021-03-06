package cl.cc.zcsclient.mail;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;

/**
 * <p>
 * Java class for saveDraftRequest complex type.
 *
 * <p>
 * The following schema fragment specifies the expected content contained within
 * this class.
 *
 * <pre>
 * &lt;complexType name="saveDraftRequest">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="m" type="{urn:zimbraMail}saveDraftMsg" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 *
 *
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "saveDraftRequest", propOrder = {
    "m"
})
public class SaveDraftRequest {

    protected SaveDraftMsg m;

    /**
     * Gets the value of the m property.
     *
     * @return possible object is {@link SaveDraftMsg }
     *
     */
    public SaveDraftMsg getM() {
        return m;
    }

    /**
     * Sets the value of the m property.
     *
     * @param value allowed object is {@link SaveDraftMsg }
     *
     */
    public void setM(SaveDraftMsg value) {
        this.m = value;
    }

}
