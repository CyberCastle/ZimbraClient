package cl.cc.zcsclient.mail;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlType;

/**
 * <p>
 * Java class for emailInfo complex type.
 *
 * <p>
 * The following schema fragment specifies the expected content contained within
 * this class.
 *
 * <pre>
 * &lt;complexType name="emailInfo">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *       &lt;/sequence>
 *       &lt;attribute name="a" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="d" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="p" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="t" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="isGroup" type="{http://www.w3.org/2001/XMLSchema}boolean" />
 *       &lt;attribute name="exp" type="{http://www.w3.org/2001/XMLSchema}boolean" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 *
 *
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "emailInfo")
public class EmailInfo {

    @XmlAttribute(name = "a")
    protected String a;
    @XmlAttribute(name = "d")
    protected String d;
    @XmlAttribute(name = "p")
    protected String p;
    @XmlAttribute(name = "t")
    protected String t;
    @XmlAttribute(name = "isGroup")
    protected Boolean isGroup;
    @XmlAttribute(name = "exp")
    protected Boolean exp;

    /**
     * Gets the value of the a property.
     *
     * @return possible object is {@link String }
     *
     */
    public String getA() {
        return a;
    }

    /**
     * Sets the value of the a property.
     *
     * @param value allowed object is {@link String }
     *
     */
    public void setA(String value) {
        this.a = value;
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
     * Gets the value of the p property.
     *
     * @return possible object is {@link String }
     *
     */
    public String getP() {
        return p;
    }

    /**
     * Sets the value of the p property.
     *
     * @param value allowed object is {@link String }
     *
     */
    public void setP(String value) {
        this.p = value;
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
     * Gets the value of the isGroup property.
     *
     * @return possible object is {@link Boolean }
     *
     */
    public Boolean isIsGroup() {
        return isGroup;
    }

    /**
     * Sets the value of the isGroup property.
     *
     * @param value allowed object is {@link Boolean }
     *
     */
    public void setIsGroup(Boolean value) {
        this.isGroup = value;
    }

    /**
     * Gets the value of the exp property.
     *
     * @return possible object is {@link Boolean }
     *
     */
    public Boolean isExp() {
        return exp;
    }

    /**
     * Sets the value of the exp property.
     *
     * @param value allowed object is {@link Boolean }
     *
     */
    public void setExp(Boolean value) {
        this.exp = value;
    }

}
