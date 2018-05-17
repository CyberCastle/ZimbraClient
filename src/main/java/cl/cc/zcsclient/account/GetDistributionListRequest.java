package cl.cc.zcsclient.account;

import cl.cc.zcsclient.account.AttrsImpl;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import cl.cc.zcsclient.DistributionListSelector;

/**
 * <p>
 * Java class for getDistributionListRequest complex type.
 *
 * <p>
 * The following schema fragment specifies the expected content contained within
 * this class.
 *
 * <pre>
 * &lt;complexType name="getDistributionListRequest">
 *   &lt;complexContent>
 *     &lt;extension base="{urn:zimbraAccount}attrsImpl">
 *       &lt;sequence>
 *         &lt;element name="dl" type="{urn:zimbra}distributionListSelector"/>
 *       &lt;/sequence>
 *       &lt;attribute name="needOwners" type="{http://www.w3.org/2001/XMLSchema}boolean" />
 *       &lt;attribute name="needRights" type="{http://www.w3.org/2001/XMLSchema}string" />
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 *
 *
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "getDistributionListRequest", propOrder = {
    "dl"
})
public class GetDistributionListRequest
        extends AttrsImpl {

    @XmlElement(required = true)
    protected DistributionListSelector dl;
    @XmlAttribute(name = "needOwners")
    protected Boolean needOwners;
    @XmlAttribute(name = "needRights")
    protected String needRights;

    /**
     * Gets the value of the dl property.
     *
     * @return possible object is {@link DistributionListSelector }
     *
     */
    public DistributionListSelector getDl() {
        return dl;
    }

    /**
     * Sets the value of the dl property.
     *
     * @param value allowed object is {@link DistributionListSelector }
     *
     */
    public void setDl(DistributionListSelector value) {
        this.dl = value;
    }

    /**
     * Gets the value of the needOwners property.
     *
     * @return possible object is {@link Boolean }
     *
     */
    public Boolean isNeedOwners() {
        return needOwners;
    }

    /**
     * Sets the value of the needOwners property.
     *
     * @param value allowed object is {@link Boolean }
     *
     */
    public void setNeedOwners(Boolean value) {
        this.needOwners = value;
    }

    /**
     * Gets the value of the needRights property.
     *
     * @return possible object is {@link String }
     *
     */
    public String getNeedRights() {
        return needRights;
    }

    /**
     * Sets the value of the needRights property.
     *
     * @param value allowed object is {@link String }
     *
     */
    public void setNeedRights(String value) {
        this.needRights = value;
    }

}
