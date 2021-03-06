package cl.cc.zcsclient.sync;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;

/**
 * <p>
 * Java class for suspendDeviceResponse complex type.
 *
 * <p>
 * The following schema fragment specifies the expected content contained within
 * this class.
 *
 * <pre>
 * &lt;complexType name="suspendDeviceResponse">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="device" type="{urn:zimbraSync}deviceStatusInfo" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 *
 *
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "suspendDeviceResponse", propOrder = {
    "device"
})
public class SuspendDeviceResponse {

    protected DeviceStatusInfo device;

    /**
     * Gets the value of the device property.
     *
     * @return possible object is {@link DeviceStatusInfo }
     *
     */
    public DeviceStatusInfo getDevice() {
        return device;
    }

    /**
     * Sets the value of the device property.
     *
     * @param value allowed object is {@link DeviceStatusInfo }
     *
     */
    public void setDevice(DeviceStatusInfo value) {
        this.device = value;
    }

}
