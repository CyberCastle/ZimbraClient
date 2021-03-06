package cl.cc.zcsclient.account;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlType;

/**
 * <p>
 * Java class for distributionListInfo complex type.
 *
 * <p>
 * The following schema fragment specifies the expected content contained within
 * this class.
 *
 * <pre>
 * &lt;complexType name="distributionListInfo">
 *   &lt;complexContent>
 *     &lt;extension base="{urn:zimbraAccount}objectInfo">
 *       &lt;sequence>
 *         &lt;element name="dlm" type="{http://www.w3.org/2001/XMLSchema}string" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="owners" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="owner" type="{urn:zimbraAccount}distributionListGranteeInfo" maxOccurs="unbounded" minOccurs="0"/>
 *                 &lt;/sequence>
 *                 &lt;attribute name="unusedCodeGenHelper" type="{http://www.w3.org/2001/XMLSchema}string" />
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="rights" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="right" type="{urn:zimbraAccount}distributionListRightInfo" maxOccurs="unbounded" minOccurs="0"/>
 *                 &lt;/sequence>
 *                 &lt;attribute name="unusedCodeGenHelper" type="{http://www.w3.org/2001/XMLSchema}string" />
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *       &lt;/sequence>
 *       &lt;attribute name="isOwner" type="{http://www.w3.org/2001/XMLSchema}boolean" />
 *       &lt;attribute name="isMember" type="{http://www.w3.org/2001/XMLSchema}boolean" />
 *       &lt;attribute name="dynamic" type="{http://www.w3.org/2001/XMLSchema}boolean" />
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 *
 *
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "distributionListInfo", propOrder = {
    "dlm",
    "owners",
    "rights"
})
public class DistributionListInfo
        extends ObjectInfo {

    protected List<String> dlm;
    protected DistributionListInfo.Owners owners;
    protected DistributionListInfo.Rights rights;
    @XmlAttribute(name = "isOwner")
    protected Boolean isOwner;
    @XmlAttribute(name = "isMember")
    protected Boolean isMember;
    @XmlAttribute(name = "dynamic")
    protected Boolean dynamic;

    /**
     * Gets the value of the dlm property.
     *
     * <p>
     * This accessor method returns a reference to the live list, not a
     * snapshot. Therefore any modification you make to the returned list will
     * be present inside the JAXB object. This is why there is not a
     * <CODE>set</CODE> method for the dlm property.
     *
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getDlm().add(newItem);
     * </pre>
     *
     *
     * <p>
     * Objects of the following type(s) are allowed in the list {@link String }
     *
     *
     */
    public List<String> getDlm() {
        if (dlm == null) {
            dlm = new ArrayList<String>();
        }
        return this.dlm;
    }

    /**
     * Gets the value of the owners property.
     *
     * @return possible object is {@link DistributionListInfo.Owners }
     *
     */
    public DistributionListInfo.Owners getOwners() {
        return owners;
    }

    /**
     * Sets the value of the owners property.
     *
     * @param value allowed object is {@link DistributionListInfo.Owners }
     *
     */
    public void setOwners(DistributionListInfo.Owners value) {
        this.owners = value;
    }

    /**
     * Gets the value of the rights property.
     *
     * @return possible object is {@link DistributionListInfo.Rights }
     *
     */
    public DistributionListInfo.Rights getRights() {
        return rights;
    }

    /**
     * Sets the value of the rights property.
     *
     * @param value allowed object is {@link DistributionListInfo.Rights }
     *
     */
    public void setRights(DistributionListInfo.Rights value) {
        this.rights = value;
    }

    /**
     * Gets the value of the isOwner property.
     *
     * @return possible object is {@link Boolean }
     *
     */
    public Boolean isIsOwner() {
        return isOwner;
    }

    /**
     * Sets the value of the isOwner property.
     *
     * @param value allowed object is {@link Boolean }
     *
     */
    public void setIsOwner(Boolean value) {
        this.isOwner = value;
    }

    /**
     * Gets the value of the isMember property.
     *
     * @return possible object is {@link Boolean }
     *
     */
    public Boolean isIsMember() {
        return isMember;
    }

    /**
     * Sets the value of the isMember property.
     *
     * @param value allowed object is {@link Boolean }
     *
     */
    public void setIsMember(Boolean value) {
        this.isMember = value;
    }

    /**
     * Gets the value of the dynamic property.
     *
     * @return possible object is {@link Boolean }
     *
     */
    public Boolean isDynamic() {
        return dynamic;
    }

    /**
     * Sets the value of the dynamic property.
     *
     * @param value allowed object is {@link Boolean }
     *
     */
    public void setDynamic(Boolean value) {
        this.dynamic = value;
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
     *         &lt;element name="owner" type="{urn:zimbraAccount}distributionListGranteeInfo" maxOccurs="unbounded" minOccurs="0"/>
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
        "owner"
    })
    public static class Owners {

        protected List<DistributionListGranteeInfo> owner;
        @XmlAttribute(name = "unusedCodeGenHelper")
        protected String unusedCodeGenHelper;

        /**
         * Gets the value of the owner property.
         *
         * <p>
         * This accessor method returns a reference to the live list, not a
         * snapshot. Therefore any modification you make to the returned list
         * will be present inside the JAXB object. This is why there is not a
         * <CODE>set</CODE> method for the owner property.
         *
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getOwner().add(newItem);
         * </pre>
         *
         *
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link DistributionListGranteeInfo }
         *
         *
         */
        public List<DistributionListGranteeInfo> getOwner() {
            if (owner == null) {
                owner = new ArrayList<DistributionListGranteeInfo>();
            }
            return this.owner;
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
     *         &lt;element name="right" type="{urn:zimbraAccount}distributionListRightInfo" maxOccurs="unbounded" minOccurs="0"/>
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
        "right"
    })
    public static class Rights {

        protected List<DistributionListRightInfo> right;
        @XmlAttribute(name = "unusedCodeGenHelper")
        protected String unusedCodeGenHelper;

        /**
         * Gets the value of the right property.
         *
         * <p>
         * This accessor method returns a reference to the live list, not a
         * snapshot. Therefore any modification you make to the returned list
         * will be present inside the JAXB object. This is why there is not a
         * <CODE>set</CODE> method for the right property.
         *
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getRight().add(newItem);
         * </pre>
         *
         *
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link DistributionListRightInfo }
         *
         *
         */
        public List<DistributionListRightInfo> getRight() {
            if (right == null) {
                right = new ArrayList<DistributionListRightInfo>();
            }
            return this.right;
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
