
package introsde.client.dataBaseClient;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;

import com.fasterxml.jackson.annotation.*;
import java.io.Serializable;

/**
 * <p>Java class for goal complex type.
 *
 * <p>The following schema fragment specifies the expected content contained within this class.
 *
 * <pre>
 * &lt;complexType name="goal">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="idGoal" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="idMeasureDefinition" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="idPerson" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="measureDefinition" type="{http://ws.introsde/}measureDefinition" minOccurs="0"/>
 *         &lt;element name="operator" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="reachDate" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="value" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 *
 *
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "goal", propOrder = {
    "idGoal",
    "idMeasureDefinition",
    "idPerson",
    "measureDefinition",
    "operator",
    "reachDate",
    "value"
})

@JsonPropertyOrder({"idPerson","idGoal","operator","value","reachDate","idMeasureDefinition","measureDefinition"})
public class Goal implements Serializable {

    protected int idGoal;
    protected int idPerson;
    protected String operator;
    protected String value;
    protected String reachDate;
    protected int idMeasureDefinition;
    protected MeasureDefinition measureDefinition;

    /**
     * Gets the value of the idGoal property.
     *
     */
    public int getIdGoal() {
        return idGoal;
    }

    /**
     * Sets the value of the idGoal property.
     *
     */
    public void setIdGoal(int value) {
        this.idGoal = value;
    }

    /**
     * Gets the value of the idMeasureDefinition property.
     *
     */
    public int getIdMeasureDefinition() {
        return idMeasureDefinition;
    }

    /**
     * Sets the value of the idMeasureDefinition property.
     *
     */
    public void setIdMeasureDefinition(int value) {
        this.idMeasureDefinition = value;
    }

    /**
     * Gets the value of the idPerson property.
     *
     */
    public int getIdPerson() {
        return idPerson;
    }

    /**
     * Sets the value of the idPerson property.
     *
     */
    public void setIdPerson(int value) {
        this.idPerson = value;
    }

    /**
     * Gets the value of the measureDefinition property.
     *
     * @return
     *     possible object is
     *     {@link MeasureDefinition }
     *
     */
    public MeasureDefinition getMeasureDefinition() {
        return measureDefinition;
    }

    /**
     * Sets the value of the measureDefinition property.
     *
     * @param value
     *     allowed object is
     *     {@link MeasureDefinition }
     *
     */
    public void setMeasureDefinition(MeasureDefinition value) {
        this.measureDefinition = value;
    }

    /**
     * Gets the value of the operator property.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getOperator() {
        return operator;
    }

    /**
     * Sets the value of the operator property.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setOperator(String value) {
        this.operator = value;
    }

    /**
     * Gets the value of the reachDate property.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getReachDate() {
        return reachDate;
    }

    /**
     * Sets the value of the reachDate property.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setReachDate(String value) {
        this.reachDate = value;
    }

    /**
     * Gets the value of the value property.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getValue() {
        return value;
    }

    /**
     * Sets the value of the value property.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setValue(String value) {
        this.value = value;
    }

}
