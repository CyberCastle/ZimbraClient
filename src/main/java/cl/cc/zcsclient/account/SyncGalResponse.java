package cl.cc.zcsclient.account;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElements;
import javax.xml.bind.annotation.XmlType;
import cl.cc.zcsclient.Id;

/**
 * <p>
 * Java class for syncGalResponse complex type.
 *
 * <p>
 * The following schema fragment specifies the expected content contained within
 * this class.
 *
 * <pre>
 * &lt;complexType name="syncGalResponse">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;choice maxOccurs="unbounded" minOccurs="0">
 *           &lt;element name="cn" type="{urn:zimbraAccount}contactInfo"/>
 *           &lt;element name="deleted" type="{urn:zimbra}id"/>
 *         &lt;/choice>
 *       &lt;/sequence>
 *       &lt;attribute name="more" type="{http://www.w3.org/2001/XMLSchema}boolean" />
 *       &lt;attribute name="token" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="galDefinitionLastModified" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="throttled" type="{http://www.w3.org/2001/XMLSchema}boolean" />
 *       &lt;attribute name="fullSyncRecommended" type="{http://www.w3.org/2001/XMLSchema}boolean" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 *
 *
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "syncGalResponse", propOrder = {
    "cnOrDeleted"
})
public class SyncGalResponse {

    @XmlElements({
        @XmlElement(name = "cn", type = ContactInfo.class)
        ,
        @XmlElement(name = "deleted", type = Id.class)
    })
    protected List<Object> cnOrDeleted;
    @XmlAttribute(name = "more")
    protected Boolean more;
    @XmlAttribute(name = "token")
    protected String token;
    @XmlAttribute(name = "galDefinitionLastModified")
    protected String galDefinitionLastModified;
    @XmlAttribute(name = "throttled")
    protected Boolean throttled;
    @XmlAttribute(name = "fullSyncRecommended")
    protected Boolean fullSyncRecommended;

    /**
     * Gets the value of the cnOrDeleted property.
     *
     * <p>
     * This accessor method returns a reference to the live list, not a
     * snapshot. Therefore any modification you make to the returned list will
     * be present inside the JAXB object. This is why there is not a
     * <CODE>set</CODE> method for the cnOrDeleted property.
     *
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getCnOrDeleted().add(newItem);
     * </pre>
     *
     *
     * <p>
     * Objects of the following type(s) are allowed in the list null     {@link ContactInfo }
     * {@link Id }
     *
     *
     */
    public List<Object> getCnOrDeleted() {
        if (cnOrDeleted == null) {
            cnOrDeleted = new ArrayList<Object>();
        }
        return this.cnOrDeleted;
    }

    /**
     * Gets the value of the more property.
     *
     * @return possible object is {@link Boolean }
     *
     */
    public Boolean isMore() {
        return more;
    }

    /**
     * Sets the value of the more property.
     *
     * @param value allowed object is {@link Boolean }
     *
     */
    public void setMore(Boolean value) {
        this.more = value;
    }

    /**
     * Gets the value of the token property.
     *
     * @return possible object is {@link String }
     *
     */
    public String getToken() {
        return token;
    }

    /**
     * Sets the value of the token property.
     *
     * @param value allowed object is {@link String }
     *
     */
    public void setToken(String value) {
        this.token = value;
    }

    /**
     * Gets the value of the galDefinitionLastModified property.
     *
     * @return possible object is {@link String }
     *
     */
    public String getGalDefinitionLastModified() {
        return galDefinitionLastModified;
    }

    /**
     * Sets the value of the galDefinitionLastModified property.
     *
     * @param value allowed object is {@link String }
     *
     */
    public void setGalDefinitionLastModified(String value) {
        this.galDefinitionLastModified = value;
    }

    /**
     * Gets the value of the throttled property.
     *
     * @return possible object is {@link Boolean }
     *
     */
    public Boolean isThrottled() {
        return throttled;
    }

    /**
     * Sets the value of the throttled property.
     *
     * @param value allowed object is {@link Boolean }
     *
     */
    public void setThrottled(Boolean value) {
        this.throttled = value;
    }

    /**
     * Gets the value of the fullSyncRecommended property.
     *
     * @return possible object is {@link Boolean }
     *
     */
    public Boolean isFullSyncRecommended() {
        return fullSyncRecommended;
    }

    /**
     * Sets the value of the fullSyncRecommended property.
     *
     * @param value allowed object is {@link Boolean }
     *
     */
    public void setFullSyncRecommended(Boolean value) {
        this.fullSyncRecommended = value;
    }

}
