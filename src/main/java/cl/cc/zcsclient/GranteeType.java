package cl.cc.zcsclient;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;

/**
 * <p>
 * Java class for granteeType.
 *
 * <p>
 * The following schema fragment specifies the expected content contained within
 * this class.
 * <p>
 * <
 * pre>
 * &lt;simpleType name="granteeType"> &lt;restriction
 * base="{http://www.w3.org/2001/XMLSchema}string"> &lt;enumeration
 * value="usr"/> &lt;enumeration value="grp"/> &lt;enumeration value="egp"/>
 * &lt;enumeration value="all"/> &lt;enumeration value="dom"/> &lt;enumeration
 * value="edom"/> &lt;enumeration value="gst"/> &lt;enumeration value="key"/>
 * &lt;enumeration value="pub"/> &lt;enumeration value="email"/>
 * &lt;/restriction> &lt;/simpleType>
 * </pre>
 *
 */
@XmlType(name = "granteeType")
@XmlEnum
public enum GranteeType {

    @XmlEnumValue("usr")
    USR("usr"),
    @XmlEnumValue("grp")
    GRP("grp"),
    @XmlEnumValue("egp")
    EGP("egp"),
    @XmlEnumValue("all")
    ALL("all"),
    @XmlEnumValue("dom")
    DOM("dom"),
    @XmlEnumValue("edom")
    EDOM("edom"),
    @XmlEnumValue("gst")
    GST("gst"),
    @XmlEnumValue("key")
    KEY("key"),
    @XmlEnumValue("pub")
    PUB("pub"),
    @XmlEnumValue("email")
    EMAIL("email");
    private final String value;

    GranteeType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static GranteeType fromValue(String v) {
        for (GranteeType c : GranteeType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
