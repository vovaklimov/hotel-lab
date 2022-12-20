
package generated.com.github.vovaklimov.hotel.server;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for room complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="room"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://jaxws.server.hotel.vovaklimov.github.com/}entityWithId"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="description" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="number" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="price" type="{http://jaxws.server.hotel.vovaklimov.github.com/}money" minOccurs="0"/&gt;
 *         &lt;element name="sleeps" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="square" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "room", propOrder = {
    "description",
    "number",
    "price",
    "sleeps",
    "square"
})
public class Room
    extends EntityWithId
{

    protected String description;
    protected Integer number;
    protected Money price;
    protected Integer sleeps;
    protected int square;

    /**
     * Gets the value of the description property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDescription() {
        return description;
    }

    /**
     * Sets the value of the description property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDescription(String value) {
        this.description = value;
    }

    /**
     * Gets the value of the number property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getNumber() {
        return number;
    }

    /**
     * Sets the value of the number property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setNumber(Integer value) {
        this.number = value;
    }

    /**
     * Gets the value of the price property.
     * 
     * @return
     *     possible object is
     *     {@link Money }
     *     
     */
    public Money getPrice() {
        return price;
    }

    /**
     * Sets the value of the price property.
     * 
     * @param value
     *     allowed object is
     *     {@link Money }
     *     
     */
    public void setPrice(Money value) {
        this.price = value;
    }

    /**
     * Gets the value of the sleeps property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getSleeps() {
        return sleeps;
    }

    /**
     * Sets the value of the sleeps property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setSleeps(Integer value) {
        this.sleeps = value;
    }

    /**
     * Gets the value of the square property.
     * 
     */
    public int getSquare() {
        return square;
    }

    /**
     * Sets the value of the square property.
     * 
     */
    public void setSquare(int value) {
        this.square = value;
    }

}
