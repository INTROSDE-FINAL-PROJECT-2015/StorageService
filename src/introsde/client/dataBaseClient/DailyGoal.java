
package introsde.client.dataBaseClient;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;

import com.fasterxml.jackson.annotation.*;
import java.io.Serializable;


/**
 * <p>Java class for dailyGoal complex type.
 *
 * <p>The following schema fragment specifies the expected content contained within this class.
 *
 * <pre>
 * &lt;complexType name="dailyGoal">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="idGoal" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="idPerson" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="question" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
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
@XmlType(name = "dailyGoal", propOrder = {
    "idGoal",
    "idPerson",
    "question",
    "value"
})
@JsonPropertyOrder({ "idGoal", "idPerson", "question", "value"})
public class DailyGoal implements Serializable{

    protected int idGoal;
    protected int idPerson;
    protected String question;
    protected String value;

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
     * Gets the value of the question property.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getQuestion() {
        return question;
    }

    /**
     * Sets the value of the question property.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setQuestion(String value) {
        this.question = value;
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
