package cl.cc.zcsclient.account;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

/**
 * <p>
 * Java class for modifySignatureRequest complex type.
 *
 * <p>
 * The following schema fragment specifies the expected content contained within
 * this class.
 *
 * <pre>
 * &lt;complexType name="modifySignatureRequest">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element ref="{urn:zimbraAccount}signature"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 *
 *
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "modifySignatureRequest", propOrder = {
    "signature"
})
public class ModifySignatureRequest {

    @XmlElement(required = true)
    protected Signature signature;

    /**
     * Gets the value of the signature property.
     *
     * @return possible object is {@link Signature }
     *
     */
    public Signature getSignature() {
        return signature;
    }

    /**
     * Sets the value of the signature property.
     *
     * @param value allowed object is {@link Signature }
     *
     */
    public void setSignature(Signature value) {
        this.signature = value;
    }

}
