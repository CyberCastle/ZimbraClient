package cl.cc.zcsclient.account;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlType;

/**
 * <p>
 * Java class for checkLicenseResponse complex type.
 *
 * <p>
 * The following schema fragment specifies the expected content contained within
 * this class.
 *
 * <pre>
 * &lt;complexType name="checkLicenseResponse">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *       &lt;/sequence>
 *       &lt;attribute name="status" use="required" type="{urn:zimbraAccount}checkLicenseStatus" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 *
 *
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "checkLicenseResponse")
public class CheckLicenseResponse {

    @XmlAttribute(name = "status", required = true)
    protected CheckLicenseStatus status;

    /**
     * Gets the value of the status property.
     *
     * @return possible object is {@link CheckLicenseStatus }
     *
     */
    public CheckLicenseStatus getStatus() {
        return status;
    }

    /**
     * Sets the value of the status property.
     *
     * @param value allowed object is {@link CheckLicenseStatus }
     *
     */
    public void setStatus(CheckLicenseStatus value) {
        this.status = value;
    }

}
