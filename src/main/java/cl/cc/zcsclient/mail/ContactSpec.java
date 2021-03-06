package cl.cc.zcsclient.mail;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlType;

/**
 * <p>
 * Java class for contactSpec complex type.
 *
 * <p>
 * The following schema fragment specifies the expected content contained within
 * this class.
 *
 * <pre>
 * &lt;complexType name="contactSpec">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="vcard" type="{urn:zimbraMail}vCardInfo" minOccurs="0"/>
 *         &lt;element name="a" type="{urn:zimbraMail}newContactAttr" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="m" type="{urn:zimbraMail}newContactGroupMember" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *       &lt;attribute name="id" type="{http://www.w3.org/2001/XMLSchema}int" />
 *       &lt;attribute name="l" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="t" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="tn" type="{http://www.w3.org/2001/XMLSchema}string" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 *
 *
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "contactSpec", propOrder = {
    "vcard",
    "a",
    "m"
})
public class ContactSpec {

    protected VCardInfo vcard;
    protected List<NewContactAttr> a;
    protected List<NewContactGroupMember> m;
    @XmlAttribute(name = "id")
    protected Integer id;
    @XmlAttribute(name = "l")
    protected String l;
    @XmlAttribute(name = "t")
    protected String t;
    @XmlAttribute(name = "tn")
    protected String tn;

    /**
     * Gets the value of the vcard property.
     *
     * @return possible object is {@link VCardInfo }
     *
     */
    public VCardInfo getVcard() {
        return vcard;
    }

    /**
     * Sets the value of the vcard property.
     *
     * @param value allowed object is {@link VCardInfo }
     *
     */
    public void setVcard(VCardInfo value) {
        this.vcard = value;
    }

    /**
     * Gets the value of the a property.
     *
     * <p>
     * This accessor method returns a reference to the live list, not a
     * snapshot. Therefore any modification you make to the returned list will
     * be present inside the JAXB object. This is why there is not a
     * <CODE>set</CODE> method for the a property.
     *
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getA().add(newItem);
     * </pre>
     *
     *
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link NewContactAttr }
     *
     *
     */
    public List<NewContactAttr> getA() {
        if (a == null) {
            a = new ArrayList<NewContactAttr>();
        }
        return this.a;
    }

    /**
     * Gets the value of the m property.
     *
     * <p>
     * This accessor method returns a reference to the live list, not a
     * snapshot. Therefore any modification you make to the returned list will
     * be present inside the JAXB object. This is why there is not a
     * <CODE>set</CODE> method for the m property.
     *
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getM().add(newItem);
     * </pre>
     *
     *
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link NewContactGroupMember }
     *
     *
     */
    public List<NewContactGroupMember> getM() {
        if (m == null) {
            m = new ArrayList<NewContactGroupMember>();
        }
        return this.m;
    }

    /**
     * Gets the value of the id property.
     *
     * @return possible object is {@link Integer }
     *
     */
    public Integer getId() {
        return id;
    }

    /**
     * Sets the value of the id property.
     *
     * @param value allowed object is {@link Integer }
     *
     */
    public void setId(Integer value) {
        this.id = value;
    }

    /**
     * Gets the value of the l property.
     *
     * @return possible object is {@link String }
     *
     */
    public String getL() {
        return l;
    }

    /**
     * Sets the value of the l property.
     *
     * @param value allowed object is {@link String }
     *
     */
    public void setL(String value) {
        this.l = value;
    }

    /**
     * Gets the value of the t property.
     *
     * @return possible object is {@link String }
     *
     */
    public String getT() {
        return t;
    }

    /**
     * Sets the value of the t property.
     *
     * @param value allowed object is {@link String }
     *
     */
    public void setT(String value) {
        this.t = value;
    }

    /**
     * Gets the value of the tn property.
     *
     * @return possible object is {@link String }
     *
     */
    public String getTn() {
        return tn;
    }

    /**
     * Sets the value of the tn property.
     *
     * @param value allowed object is {@link String }
     *
     */
    public void setTn(String value) {
        this.tn = value;
    }

}
