package cl.cc.zcsclient.account;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

/**
 * <p>
 * Java class for createIdentityResponse complex type.
 *
 * <p>
 * The following schema fragment specifies the expected content contained within
 * this class.
 *
 * <pre>
 * &lt;complexType name="createIdentityResponse">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="identity" type="{urn:zimbraAccount}identity"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 *
 *
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "createIdentityResponse", propOrder = {
    "identity"
})
public class CreateIdentityResponse {

    @XmlElement(required = true)
    protected Identity identity;

    /**
     * Gets the value of the identity property.
     *
     * @return possible object is {@link Identity }
     *
     */
    public Identity getIdentity() {
        return identity;
    }

    /**
     * Sets the value of the identity property.
     *
     * @param value allowed object is {@link Identity }
     *
     */
    public void setIdentity(Identity value) {
        this.identity = value;
    }

}
