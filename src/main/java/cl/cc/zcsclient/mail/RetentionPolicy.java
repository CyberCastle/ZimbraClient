package cl.cc.zcsclient.mail;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlType;

/**
 * <p>
 * Java class for retentionPolicy complex type.
 *
 * <p>
 * The following schema fragment specifies the expected content contained within
 * this class.
 *
 * <pre>
 * &lt;complexType name="retentionPolicy">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="keep" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="policy" type="{urn:zimbraMail}policy" maxOccurs="unbounded" minOccurs="0"/>
 *                 &lt;/sequence>
 *                 &lt;attribute name="unusedCodeGenHelper" type="{http://www.w3.org/2001/XMLSchema}string" />
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="purge" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="policy" type="{urn:zimbraMail}policy" maxOccurs="unbounded" minOccurs="0"/>
 *                 &lt;/sequence>
 *                 &lt;attribute name="unusedCodeGenHelper" type="{http://www.w3.org/2001/XMLSchema}string" />
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 *
 *
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "retentionPolicy", propOrder = {
    "keep",
    "purge"
})
public class RetentionPolicy {

    protected RetentionPolicy.Keep keep;
    protected RetentionPolicy.Purge purge;

    /**
     * Gets the value of the keep property.
     *
     * @return possible object is {@link RetentionPolicy.Keep }
     *
     */
    public RetentionPolicy.Keep getKeep() {
        return keep;
    }

    /**
     * Sets the value of the keep property.
     *
     * @param value allowed object is {@link RetentionPolicy.Keep }
     *
     */
    public void setKeep(RetentionPolicy.Keep value) {
        this.keep = value;
    }

    /**
     * Gets the value of the purge property.
     *
     * @return possible object is {@link RetentionPolicy.Purge }
     *
     */
    public RetentionPolicy.Purge getPurge() {
        return purge;
    }

    /**
     * Sets the value of the purge property.
     *
     * @param value allowed object is {@link RetentionPolicy.Purge }
     *
     */
    public void setPurge(RetentionPolicy.Purge value) {
        this.purge = value;
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
     *         &lt;element name="policy" type="{urn:zimbraMail}policy" maxOccurs="unbounded" minOccurs="0"/>
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
        "policy"
    })
    public static class Keep {

        protected List<Policy> policy;
        @XmlAttribute(name = "unusedCodeGenHelper")
        protected String unusedCodeGenHelper;

        /**
         * Gets the value of the policy property.
         *
         * <p>
         * This accessor method returns a reference to the live list, not a
         * snapshot. Therefore any modification you make to the returned list
         * will be present inside the JAXB object. This is why there is not a
         * <CODE>set</CODE> method for the policy property.
         *
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getPolicy().add(newItem);
         * </pre>
         *
         *
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link Policy }
         *
         *
         */
        public List<Policy> getPolicy() {
            if (policy == null) {
                policy = new ArrayList<Policy>();
            }
            return this.policy;
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
     *         &lt;element name="policy" type="{urn:zimbraMail}policy" maxOccurs="unbounded" minOccurs="0"/>
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
        "policy"
    })
    public static class Purge {

        protected List<Policy> policy;
        @XmlAttribute(name = "unusedCodeGenHelper")
        protected String unusedCodeGenHelper;

        /**
         * Gets the value of the policy property.
         *
         * <p>
         * This accessor method returns a reference to the live list, not a
         * snapshot. Therefore any modification you make to the returned list
         * will be present inside the JAXB object. This is why there is not a
         * <CODE>set</CODE> method for the policy property.
         *
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getPolicy().add(newItem);
         * </pre>
         *
         *
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link Policy }
         *
         *
         */
        public List<Policy> getPolicy() {
            if (policy == null) {
                policy = new ArrayList<Policy>();
            }
            return this.policy;
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
