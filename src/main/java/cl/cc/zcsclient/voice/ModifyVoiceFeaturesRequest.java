package cl.cc.zcsclient.voice;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;

/**
 * <p>
 * Java class for modifyVoiceFeaturesRequest complex type.
 *
 * <p>
 * The following schema fragment specifies the expected content contained within
 * this class.
 *
 * <pre>
 * &lt;complexType name="modifyVoiceFeaturesRequest">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="storeprincipal" type="{urn:zimbraVoice}storePrincipalSpec" minOccurs="0"/>
 *         &lt;element name="phone" type="{urn:zimbraVoice}modifyVoiceFeaturesSpec" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 *
 *
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "modifyVoiceFeaturesRequest", propOrder = {
    "storeprincipal",
    "phone"
})
public class ModifyVoiceFeaturesRequest {

    protected StorePrincipalSpec storeprincipal;
    protected ModifyVoiceFeaturesSpec phone;

    /**
     * Gets the value of the storeprincipal property.
     *
     * @return possible object is {@link StorePrincipalSpec }
     *
     */
    public StorePrincipalSpec getStoreprincipal() {
        return storeprincipal;
    }

    /**
     * Sets the value of the storeprincipal property.
     *
     * @param value allowed object is {@link StorePrincipalSpec }
     *
     */
    public void setStoreprincipal(StorePrincipalSpec value) {
        this.storeprincipal = value;
    }

    /**
     * Gets the value of the phone property.
     *
     * @return possible object is {@link ModifyVoiceFeaturesSpec }
     *
     */
    public ModifyVoiceFeaturesSpec getPhone() {
        return phone;
    }

    /**
     * Sets the value of the phone property.
     *
     * @param value allowed object is {@link ModifyVoiceFeaturesSpec }
     *
     */
    public void setPhone(ModifyVoiceFeaturesSpec value) {
        this.phone = value;
    }

}
