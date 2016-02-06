package introsde.models;

import java.util.List;
import java.io.Serializable;
import javax.xml.bind.annotation.XmlSchemaType;
import com.fasterxml.jackson.annotation.*;
import javax.xml.datatype.XMLGregorianCalendar;
import introsde.client.dataBaseClient.Person;


@JsonPropertyOrder({ "idPerson", "firstname", "lastname", "birthday"})
public class SimplePerson implements Serializable {

  protected int idPerson;
  protected String firstname;
  protected String lastname;
  protected XMLGregorianCalendar birthday;

  public SimplePerson(Person p){
    this.idPerson  =  p.getIdPerson();
    this.firstname =  p.getFirstname();
    this.lastname  =  p.getLastname();
    this.birthday  =  p.getBirthday();
  }

	public int getIdPerson() {
		return idPerson;
	}

	public void setIdPerson(int idPerson) {
		this.idPerson = idPerson;
	}

	public String getFirstname() {
		return firstname;
	}

	public void setFirstname(String firstname) {
		this.firstname = firstname;
	}

	public String getLastname() {
		return lastname;
	}

	public void setLastname(String lastname) {
		this.lastname = lastname;
	}

	public XMLGregorianCalendar getBirthday() {
		return birthday;
	}

	public void setBirthday(XMLGregorianCalendar birthday) {
		this.birthday = birthday;
	}

	@Override
	public String toString() {
		return "SimplePerson [idPerson=" + idPerson + ", firstname=" + firstname + ", lastname=" + lastname + ", birthday=" + birthday + "]";
	}
}
