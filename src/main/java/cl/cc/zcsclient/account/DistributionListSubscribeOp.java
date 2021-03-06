package cl.cc.zcsclient.account;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;

/**
 * <p>
 * Java class for distributionListSubscribeOp.
 *
 * <p>
 * The following schema fragment specifies the expected content contained within
 * this class.
 * <p>
 * <
 * pre>
 * &lt;simpleType name="distributionListSubscribeOp"> &lt;restriction
 * base="{http://www.w3.org/2001/XMLSchema}string"> &lt;enumeration
 * value="subscribe"/> &lt;enumeration value="unsubscribe"/> &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 *
 */
@XmlType(name = "distributionListSubscribeOp")
@XmlEnum
public enum DistributionListSubscribeOp {

    @XmlEnumValue("subscribe")
    SUBSCRIBE("subscribe"),
    @XmlEnumValue("unsubscribe")
    UNSUBSCRIBE("unsubscribe");
    private final String value;

    DistributionListSubscribeOp(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static DistributionListSubscribeOp fromValue(String v) {
        for (DistributionListSubscribeOp c : DistributionListSubscribeOp.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
