package za.co.datatech.app.entities;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="Lookup_Language")
public class LookupLanguage implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="lookup_language_id")
	private Integer lookupLanguageId;
	
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

	public Integer getLookupLanguageId() {
		return lookupLanguageId;
	}

	@Override
	public String toString() {
		return "LookupLanguage [lookupLanguageId=" + lookupLanguageId + ", name=" + name + ", description="
				+ description + "]";
	}
}
