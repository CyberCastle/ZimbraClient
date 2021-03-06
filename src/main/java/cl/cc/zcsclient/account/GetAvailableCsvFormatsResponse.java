package cl.cc.zcsclient.account;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlType;
import cl.cc.zcsclient.NamedElement;

/**
 * <p>
 * Java class for getAvailableCsvFormatsResponse complex type.
 *
 * <p>
 * The following schema fragment specifies the expected content contained within
 * this class.
 *
 * <pre>
 * &lt;complexType name="getAvailableCsvFormatsResponse">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="csv" type="{urn:zimbra}namedElement" maxOccurs="unbounded" minOccurs="0"/>
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
@XmlType(name = "getAvailableCsvFormatsResponse", propOrder = {
    "csv"
})
public class GetAvailableCsvFormatsResponse {

    protected List<NamedElement> csv;
    @XmlAttribute(name = "unusedCodeGenHelper")
    protected String unusedCodeGenHelper;

    /**
     * Gets the value of the csv property.
     *
     * <p>
     * This accessor method returns a reference to the live list, not a
     * snapshot. Therefore any modification you make to the returned list will
     * be present inside the JAXB object. This is why there is not a
     * <CODE>set</CODE> method for the csv property.
     *
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getCsv().add(newItem);
     * </pre>
     *
     *
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link NamedElement }
     *
     *
     */
    public List<NamedElement> getCsv() {
        if (csv == null) {
            csv = new ArrayList<NamedElement>();
        }
        return this.csv;
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
