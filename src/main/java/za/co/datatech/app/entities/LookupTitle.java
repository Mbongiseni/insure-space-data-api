package za.co.datatech.app.entities;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "Lookup_Title")
public class LookupTitle implements Serializable{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "lookup_title_id")
	private int lookupTitleId;
	
	@Column(name = "name")
	private String name;
	
	@Column(name = "description")
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

	public int getLookupTitleId() {
		return lookupTitleId;
	}

	@Override
	public String toString() {
		return "LookupTitle [lookupTitleId=" + lookupTitleId + ", name=" + name + ", description=" + description + "]";
	}
}
