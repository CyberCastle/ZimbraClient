package cl.cc.zcsclient.mail;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlType;
import cl.cc.zcsclient.GrantGranteeType;

/**
 * <p>
 * Java class for grant complex type.
 *
 * <p>
 * The following schema fragment specifies the expected content contained within
 * this class.
 *
 * <pre>
 * &lt;complexType name="grant">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *       &lt;/sequence>
 *       &lt;attribute name="perm" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="gt" use="required" type="{urn:zimbra}grantGranteeType" />
 *       &lt;attribute name="zid" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="expiry" type="{http://www.w3.org/2001/XMLSchema}long" />
 *       &lt;attribute name="d" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="pw" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="key" type="{http://www.w3.org/2001/XMLSchema}string" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 *
 *
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "grant")
public class Grant {

    @XmlAttribute(name = "perm", required = true)
    protected String perm;
    @XmlAttribute(name = "gt", required = true)
    protected GrantGranteeType gt;
    @XmlAttribute(name = "zid", required = true)
    protected String zid;
    @XmlAttribute(name = "expiry")
    protected Long expiry;
    @XmlAttribute(name = "d")
    protected String d;
    @XmlAttribute(name = "pw")
    protected String pw;
    @XmlAttribute(name = "key")
    protected String key;

    /**
     * Gets the value of the perm property.
     *
     * @return possible object is {@link String }
     *
     */
    public String getPerm() {
        return perm;
    }

    /**
     * Sets the value of the perm property.
     *
     * @param value allowed object is {@link String }
     *
     */
    public void setPerm(String value) {
        this.perm = value;
    }

    /**
     * Gets the value of the gt property.
     *
     * @return possible object is {@link GrantGranteeType }
     *
     */
    public GrantGranteeType getGt() {
        return gt;
    }

    /**
     * Sets the value of the gt property.
     *
     * @param value allowed object is {@link GrantGranteeType }
     *
     */
    public void setGt(GrantGranteeType value) {
        this.gt = value;
    }

    /**
     * Gets the value of the zid property.
     *
     * @return possible object is {@link String }
     *
     */
    public String getZid() {
        return zid;
    }

    /**
     * Sets the value of the zid property.
     *
     * @param value allowed object is {@link String }
     *
     */
    public void setZid(String value) {
        this.zid = value;
    }

    /**
     * Gets the value of the expiry property.
     *
     * @return possible object is {@link Long }
     *
     */
    public Long getExpiry() {
        return expiry;
    }

    /**
     * Sets the value of the expiry property.
     *
     * @param value allowed object is {@link Long }
     *
     */
    public void setExpiry(Long value) {
        this.expiry = value;
    }

    /**
     * Gets the value of the d property.
     *
     * @return possible object is {@link String }
     *
     */
    public String getD() {
        return d;
    }

    /**
     * Sets the value of the d property.
     *
     * @param value allowed object is {@link String }
     *
     */
    public void setD(String value) {
        this.d = value;
    }

    /**
     * Gets the value of the pw property.
     *
     * @return possible object is {@link String }
     *
     */
    public String getPw() {
        return pw;
    }

    /**
     * Sets the value of the pw property.
     *
     * @param value allowed object is {@link String }
     *
     */
    public void setPw(String value) {
        this.pw = value;
    }

    /**
     * Gets the value of the key property.
     *
     * @return possible object is {@link String }
     *
     */
    public String getKey() {
        return key;
    }

    /**
     * Sets the value of the key property.
     *
     * @param value allowed object is {@link String }
     *
     */
    public void setKey(String value) {
        this.key = value;
    }

}
