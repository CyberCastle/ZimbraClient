package cl.cc.zcsclient.account;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlType;
import cl.cc.zcsclient.OpValue;

/**
 * <p>
 * Java class for modifyWhiteBlackListRequest complex type.
 *
 * <p>
 * The following schema fragment specifies the expected content contained within
 * this class.
 *
 * <pre>
 * &lt;complexType name="modifyWhiteBlackListRequest">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="whiteList" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="addr" type="{urn:zimbra}opValue" maxOccurs="unbounded" minOccurs="0"/>
 *                 &lt;/sequence>
 *                 &lt;attribute name="unusedCodeGenHelper" type="{http://www.w3.org/2001/XMLSchema}string" />
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="blackList" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="addr" type="{urn:zimbra}opValue" maxOccurs="unbounded" minOccurs="0"/>
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
@XmlType(name = "modifyWhiteBlackListRequest", propOrder = {
    "whiteList",
    "blackList"
})
public class ModifyWhiteBlackListRequest {

    protected ModifyWhiteBlackListRequest.WhiteList whiteList;
    protected ModifyWhiteBlackListRequest.BlackList blackList;

    /**
     * Gets the value of the whiteList property.
     *
     * @return possible object is {@link ModifyWhiteBlackListRequest.WhiteList }
     *
     */
    public ModifyWhiteBlackListRequest.WhiteList getWhiteList() {
        return whiteList;
    }

    /**
     * Sets the value of the whiteList property.
     *
     * @param value allowed object is
     *     {@link ModifyWhiteBlackListRequest.WhiteList }
     *
     */
    public void setWhiteList(ModifyWhiteBlackListRequest.WhiteList value) {
        this.whiteList = value;
    }

    /**
     * Gets the value of the blackList property.
     *
     * @return possible object is {@link ModifyWhiteBlackListRequest.BlackList }
     *
     */
    public ModifyWhiteBlackListRequest.BlackList getBlackList() {
        return blackList;
    }

    /**
     * Sets the value of the blackList property.
     *
     * @param value allowed object is
     *     {@link ModifyWhiteBlackListRequest.BlackList }
     *
     */
    public void setBlackList(ModifyWhiteBlackListRequest.BlackList value) {
        this.blackList = value;
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
     *         &lt;element name="addr" type="{urn:zimbra}opValue" maxOccurs="unbounded" minOccurs="0"/>
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
        "addr"
    })
    public static class BlackList {

        protected List<OpValue> addr;
        @XmlAttribute(name = "unusedCodeGenHelper")
        protected String unusedCodeGenHelper;

        /**
         * Gets the value of the addr property.
         *
         * <p>
         * This accessor method returns a reference to the live list, not a
         * snapshot. Therefore any modification you make to the returned list
         * will be present inside the JAXB object. This is why there is not a
         * <CODE>set</CODE> method for the addr property.
         *
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getAddr().add(newItem);
         * </pre>
         *
         *
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link OpValue }
         *
         *
         */
        public List<OpValue> getAddr() {
            if (addr == null) {
                addr = new ArrayList<OpValue>();
            }
            return this.addr;
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
     *         &lt;element name="addr" type="{urn:zimbra}opValue" maxOccurs="unbounded" minOccurs="0"/>
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
        "addr"
    })
    public static class WhiteList {

        protected List<OpValue> addr;
        @XmlAttribute(name = "unusedCodeGenHelper")
        protected String unusedCodeGenHelper;

        /**
         * Gets the value of the addr property.
         *
         * <p>
         * This accessor method returns a reference to the live list, not a
         * snapshot. Therefore any modification you make to the returned list
         * will be present inside the JAXB object. This is why there is not a
         * <CODE>set</CODE> method for the addr property.
         *
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getAddr().add(newItem);
         * </pre>
         *
         *
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link OpValue }
         *
         *
         */
        public List<OpValue> getAddr() {
            if (addr == null) {
                addr = new ArrayList<OpValue>();
            }
            return this.addr;
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
