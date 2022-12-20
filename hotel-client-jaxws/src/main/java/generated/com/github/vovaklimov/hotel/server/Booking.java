
package generated.com.github.vovaklimov.hotel.server;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for booking complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="booking"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://jaxws.server.hotel.vovaklimov.github.com/}entityWithId"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="clientId" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/&gt;
 *         &lt;element name="roomId" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/&gt;
 *         &lt;element name="timeRange" type="{http://jaxws.server.hotel.vovaklimov.github.com/}timeRange" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "booking", propOrder = {
    "clientId",
    "roomId",
    "timeRange"
})
public class Booking
    extends EntityWithId
{

    protected Long clientId;
    protected Long roomId;
    protected TimeRange timeRange;

    /**
     * Gets the value of the clientId property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getClientId() {
        return clientId;
    }

    /**
     * Sets the value of the clientId property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setClientId(Long value) {
        this.clientId = value;
    }

    /**
     * Gets the value of the roomId property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getRoomId() {
        return roomId;
    }

    /**
     * Sets the value of the roomId property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setRoomId(Long value) {
        this.roomId = value;
    }

    /**
     * Gets the value of the timeRange property.
     * 
     * @return
     *     possible object is
     *     {@link TimeRange }
     *     
     */
    public TimeRange getTimeRange() {
        return timeRange;
    }

    /**
     * Sets the value of the timeRange property.
     * 
     * @param value
     *     allowed object is
     *     {@link TimeRange }
     *     
     */
    public void setTimeRange(TimeRange value) {
        this.timeRange = value;
    }

}
