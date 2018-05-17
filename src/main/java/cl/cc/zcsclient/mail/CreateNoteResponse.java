package cl.cc.zcsclient.mail;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;

/**
 * <p>
 * Java class for createNoteResponse complex type.
 *
 * <p>
 * The following schema fragment specifies the expected content contained within
 * this class.
 *
 * <pre>
 * &lt;complexType name="createNoteResponse">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="note" type="{urn:zimbraMail}noteInfo" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 *
 *
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "createNoteResponse", propOrder = {
    "note"
})
public class CreateNoteResponse {

    protected NoteInfo note;

    /**
     * Gets the value of the note property.
     *
     * @return possible object is {@link NoteInfo }
     *
     */
    public NoteInfo getNote() {
        return note;
    }

    /**
     * Sets the value of the note property.
     *
     * @param value allowed object is {@link NoteInfo }
     *
     */
    public void setNote(NoteInfo value) {
        this.note = value;
    }

}