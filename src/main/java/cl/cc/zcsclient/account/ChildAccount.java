package cl.cc.zcsclient.account;

import cl.cc.zcsclient.account.Attr;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlType;

/**
 * <p>
 * Java class for childAccount complex type.
 *
 * <p>
 * The following schema fragment specifies the expected content contained within
 * this class.
 *
 * <pre>
 * &lt;complexType name="childAccount">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="attrs" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="attr" type="{urn:zimbraAccount}attr" maxOccurs="unbounded" minOccurs="0"/>
 *                 &lt;/sequence>
 *                 &lt;attribute name="unusedCodeGenHelper" type="{http://www.w3.org/2001/XMLSchema}string" />
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *       &lt;/sequence>
 *       &lt;attribute name="id" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="name" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="visible" use="required" type="{http://www.w3.org/2001/XMLSchema}boolean" />
 *       &lt;attribute name="active" use="required" type="{http://www.w3.org/2001/XMLSchema}boolean" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 *
 *
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "childAccount", propOrder = {
    "attrs"
})
public class ChildAccount {

    protected ChildAccount.Attrs attrs;
    @XmlAttribute(name = "id", required = true)
    protected String id;
    @XmlAttribute(name = "name", required = true)
    protected String name;
    @XmlAttribute(name = "visible", required = true)
    protected boolean visible;
    @XmlAttribute(name = "active", required = true)
    protected boolean active;

    /**
     * Gets the value of the attrs property.
     *
     * @return possible object is {@link ChildAccount.Attrs }
     *
     */
    public ChildAccount.Attrs getAttrs() {
        return attrs;
    }

    /**
     * Sets the value of the attrs property.
     *
     * @param value allowed object is {@link ChildAccount.Attrs }
     *
     */
    public void setAttrs(ChildAccount.Attrs value) {
        this.attrs = value;
    }

    /**
     * Gets the value of the id property.
     *
     * @return possible object is {@link String }
     *
     */
    public String getId() {
        return id;
    }

    /**
     * Sets the value of the id property.
     *
     * @param value allowed object is {@link String }
     *
     */
    public void setId(String value) {
        this.id = value;
    }

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
     * Gets the value of the visible property.
     *
     */
    public boolean isVisible() {
        return visible;
    }

    /**
     * Sets the value of the visible property.
     *
     */
    public void setVisible(boolean value) {
        this.visible = value;
    }

    /**
     * Gets the value of the active property.
     *
     */
    public boolean isActive() {
        return active;
    }

    /**
     * Sets the value of the active property.
     *
     */
    public void setActive(boolean value) {
        this.active = value;
    }

    /**
     * <p>
     * Java class for anonymous complex type.
     *
     * <p>
     * The following schema fragment specifies the expected content contained
     * within this class.
     *
     * <pre>
     * &lt;complexType>
     *   &lt;complexContent>
     *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *       &lt;sequence>
     *         &lt;element name="attr" type="{urn:zimbraAccount}attr" maxOccurs="unbounded" minOccurs="0"/>
     *       &lt;/sequence>
     *       &lt;attribute name="unusedCodeGenHelper" type="{http://www.w3.org/2001/XMLSchema}string" />
     *     &lt;/restriction>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     *
     *
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "attr"
    })
    public static class Attrs {

        protected List<Attr> attr;
        @XmlAttribute(name = "unusedCodeGenHelper")
        protected String unusedCodeGenHelper;

        /**
         * Gets the value of the attr property.
         *
         * <p>
         * This accessor method returns a reference to the live list, not a
         * snapshot. Therefore any modification you make to the returned list
         * will be present inside the JAXB object. This is why there is not a
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
         * {@link Attr }
         *
         *
         */
        public List<Attr> getAttr() {
            if (attr == null) {
                attr = new ArrayList<Attr>();
            }
            return this.attr;
        }

        /**
         * Gets the value of the unusedCodeGenHelper property.
         *
         * @return possible object is {@link String }
         *
         */
        public String getUnusedCodeGenHelper() {
            return unusedCodeGenHelper;
        }

        /**
         * Sets the value of the unusedCodeGenHelper property.
         *
         * @param value allowed object is {@link String }
         *
         */
        public void setUnusedCodeGenHelper(String value) {
            this.unusedCodeGenHelper = value;
        }

    }

}
