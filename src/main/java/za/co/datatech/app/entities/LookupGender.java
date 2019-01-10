package za.co.datatech.app.entities;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="Lookup_Gender")
public class LookupGender implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="lookup_gender_id")
	private Integer lookupGenderId;
	
	@Column(name="name")
	private String name;
	
	@Column(name="description")
	private String description;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public Integer getLookupGenderId() {
		return lookupGenderId;
	}

	@Override
	public String toString() {
		return "LookupGender [lookupGenderId=" + lookupGenderId + ", name=" + name + ", description=" + description
				+ "]";
	}
}
