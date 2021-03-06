package cl.cc.zcsclient.voice;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;

/**
 * <p>
 * Java class for uploadVoiceMailResponse complex type.
 *
 * <p>
 * The following schema fragment specifies the expected content contained within
 * this class.
 *
 * <pre>
 * &lt;complexType name="uploadVoiceMailResponse">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="upload" type="{urn:zimbraVoice}voiceMsgUploadInfo" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 *
 *
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "uploadVoiceMailResponse", propOrder = {
    "upload"
})
public class UploadVoiceMailResponse {

    protected VoiceMsgUploadInfo upload;

    /**
     * Gets the value of the upload property.
     *
     * @return possible object is {@link VoiceMsgUploadInfo }
     *
     */
    public VoiceMsgUploadInfo getUpload() {
        return upload;
    }

    /**
     * Sets the value of the upload property.
     *
     * @param value allowed object is {@link VoiceMsgUploadInfo }
     *
     */
    public void setUpload(VoiceMsgUploadInfo value) {
        this.upload = value;
    }

}
