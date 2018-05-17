package cl.cc.zcsclient;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;
import cl.cc.zcsclient.mail.CalDataSourceId;
import cl.cc.zcsclient.mail.CaldavDataSourceId;
import cl.cc.zcsclient.mail.GalDataSourceId;
import cl.cc.zcsclient.mail.ImapDataSourceId;
import cl.cc.zcsclient.mail.Pop3DataSourceId;
import cl.cc.zcsclient.mail.RssDataSourceId;
import cl.cc.zcsclient.mail.UnknownDataSourceId;
import cl.cc.zcsclient.mail.YabDataSourceId;

/**
 * <p>
 * Java class for id complex type.
 *
 * <p>
 * The following schema fragment specifies the expected content contained within
 * this class.
 *
 * <pre>
 * &lt;complexType name="id">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *       &lt;/sequence>
 *       &lt;attribute name="id" type="{http://www.w3.org/2001/XMLSchema}string" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 *
 *
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "id")
@XmlSeeAlso({
    GalDataSourceId.class,
    Pop3DataSourceId.class,
    CalDataSourceId.class,
    ImapDataSourceId.class,
    UnknownDataSourceId.class,
    YabDataSourceId.class,
    CaldavDataSourceId.class,
    RssDataSourceId.class
})
public class Id {

    @XmlAttribute(name = "id")
    protected String id;

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

}
