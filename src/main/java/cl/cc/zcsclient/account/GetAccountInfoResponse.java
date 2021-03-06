package cl.cc.zcsclient.account;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import cl.cc.zcsclient.NamedValue;

/**
 * <p>
 * Java class for getAccountInfoResponse complex type.
 *
 * <p>
 * The following schema fragment specifies the expected content contained within
 * this class.
 *
 * <pre>
 * &lt;complexType name="getAccountInfoResponse">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="name" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="attr" type="{urn:zimbra}namedValue" maxOccurs="unbounded"/>
 *         &lt;element name="soapURL" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="publicURL" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="changePasswordURL" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="communityURL" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 *
 *
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "getAccountInfoResponse", propOrder = {
    "name",
    "attr",
    "soapURL",
    "publicURL",
    "changePasswordURL",
    "communityURL"
})
public class GetAccountInfoResponse {

    @XmlElement(required = true)
    protected String name;
    @XmlElement(required = true)
    protected List<NamedValue> attr;
    protected String soapURL;
    protected String publicURL;
    protected String changePasswordURL;
    protected String communityURL;

    /**
     * Gets the value of the name property.
     *
     * @return possible object is {@link String }
     *
     */
    public String getName() {
        return name;
    }

    /**
     * Sets the value of the name property.
     *
     * @param value allowed object is {@link String }
     *
     */
    public void setName(String value) {
        this.name = value;
    }

    /**
     * Gets the value of the attr property.
     *
     * <p>
     * This accessor method returns a reference to the live list, not a
     * snapshot. Therefore any modification you make to the returned list will
     * be present inside the JAXB object. This is why there is not a
     * <CODE>set</CODE> method for the attr property.
     *
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getAttr().add(newItem);
     * </pre>
     *
     *
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link NamedValue }
     *
     *
     */
    public List<NamedValue> getAttr() {
        if (attr == null) {
            attr = new ArrayList<NamedValue>();
        }
        return this.attr;
    }

    /**
     * Gets the value of the soapURL property.
     *
     * @return possible object is {@link String }
     *
     */
    public String getSoapURL() {
        return soapURL;
    }

    /**
     * Sets the value of the soapURL property.
     *
     * @param value allowed object is {@link String }
     *
     */
    public void setSoapURL(String value) {
        this.soapURL = value;
    }

    /**
     * Gets the value of the publicURL property.
     *
     * @return possible object is {@link String }
     *
     */
    public String getPublicURL() {
        return publicURL;
    }

    /**
     * Sets the value of the publicURL property.
     *
     * @param value allowed object is {@link String }
     *
     */
    public void setPublicURL(String value) {
        this.publicURL = value;
    }

    /**
     * Gets the value of the changePasswordURL property.
     *
     * @return possible object is {@link String }
     *
     */
    public String getChangePasswordURL() {
        return changePasswordURL;
    }

    /**
     * Sets the value of the changePasswordURL property.
     *
     * @param value allowed object is {@link String }
     *
     */
    public void setChangePasswordURL(String value) {
        this.changePasswordURL = value;
    }

    /**
     * Gets the value of the communityURL property.
     *
     * @return possible object is {@link String }
     *
     */
    public String getCommunityURL() {
        return communityURL;
    }

    /**
     * Sets the value of the communityURL property.
     *
     * @param value allowed object is {@link String }
     *
     */
    public void setCommunityURL(String value) {
        this.communityURL = value;
    }

}
