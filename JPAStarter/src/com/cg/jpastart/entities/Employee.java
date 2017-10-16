package com.cg.jpastart.entities;
import java.io.Serializable;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;





@Entity
@Table(name="EmpDetails")
public class Employee implements Serializable {
	
	
	private static final long serialVersionUID = 1L;
	@Id
	//@GeneratedValue(strategy=GenerationType.AUTO)
	private int Id;
	private String FirstName;
	private String LastName;
	
	
	public int getId() {
		return Id;
	}
	public void setId(int id) {
		Id = id;
	}
	public String getFirstName() {
		return FirstName;
	}
	public void setFirstName(String firstName) {
		FirstName = firstName;
	}
	public String getLastName() {
		return LastName;
	}
	public void setLastName(String lastName) {
		LastName = lastName;
	}
	
	
	
	
	
}
