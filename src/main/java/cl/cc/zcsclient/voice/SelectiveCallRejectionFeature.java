package cl.cc.zcsclient.voice;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;

/**
 * <p>
 * Java class for selectiveCallRejectionFeature complex type.
 *
 * <p>
 * The following schema fragment specifies the expected content contained within
 * this class.
 *
 * <pre>
 * &lt;complexType name="selectiveCallRejectionFeature">
 *   &lt;complexContent>
 *     &lt;extension base="{urn:zimbraVoice}featureWithCallerList">
 *       &lt;sequence>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 *
 *
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "selectiveCallRejectionFeature")
public class SelectiveCallRejectionFeature
        extends FeatureWithCallerList {

}
