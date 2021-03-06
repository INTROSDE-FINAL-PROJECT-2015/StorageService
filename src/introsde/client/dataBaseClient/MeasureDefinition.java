package introsde.client.dataBaseClient;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;

import com.fasterxml.jackson.annotation.*;
import java.io.Serializable;


/**
 * <p>Java class for measureDefinition complex type.
 *
 * <p>The following schema fragment specifies the expected content contained within this class.
 *
 * <pre>
 * &lt;complexType name="measureDefinition">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="idMeasureDefinition" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="measureType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="measureValueType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 *
 *
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "measureDefinition", propOrder = {
    "idMeasureDefinition",
    "measureType",
    "measureValueType"
})
@JsonPropertyOrder({"idMeasureDefinition","measureType","measureValueType"})
public class MeasureDefinition implements Serializable{

    protected int idMeasureDefinition;
    protected String measureType;
    protected String measureValueType;

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
     * Gets the value of the measureType property.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getMeasureType() {
        return measureType;
    }

    /**
     * Sets the value of the measureType property.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setMeasureType(String value) {
        this.measureType = value;
    }

    /**
     * Gets the value of the measureValueType property.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getMeasureValueType() {
        return measureValueType;
    }

    /**
     * Sets the value of the measureValueType property.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setMeasureValueType(String value) {
        this.measureValueType = value;
    }

}
