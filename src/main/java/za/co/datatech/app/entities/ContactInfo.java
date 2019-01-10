package za.co.datatech.app.entities;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "ContactInfo")
public class ContactInfo implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "contact_info_id")
	private Integer contactInfoId;
	
	@Column(name = "phone_number_home")
	private String homePhoneNumber;
	
	@Column(name = "phone_number_cell")
	private String cellPhoneNumber;
	
	@Column(name = "email_address")
	private String emallAddress;

	public String getHomePhoneNumber() {
		return homePhoneNumber;
	}

	public void setHomePhoneNumber(String homePhoneNumber) {
		this.homePhoneNumber = homePhoneNumber;
	}

	public String getCellPhoneNumber() {
		return cellPhoneNumber;
	}

	public void setCellPhoneNumber(String cellPhoneNumber) {
		this.cellPhoneNumber = cellPhoneNumber;
	}

	public String getEmallAddress() {
		return emallAddress;
	}

	public void setEmallAddress(String emallAddress) {
		this.emallAddress = emallAddress;
	}

	public Integer getContactInfoId() {
		return contactInfoId;
	}

	@Override
	public String toString() {
		return "ContactInfo [contactInfoId=" + contactInfoId + ", homePhoneNumber=" + homePhoneNumber
				+ ", cellPhoneNumber=" + cellPhoneNumber + ", emallAddress=" + emallAddress + "]";
	}
}
