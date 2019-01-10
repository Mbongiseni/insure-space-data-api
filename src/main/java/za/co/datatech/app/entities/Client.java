package za.co.datatech.app.entities;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name = "Clients")
public class Client implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "client_id")
	private int clientId;
	
	@OneToOne
	@JoinColumn(name = "lookup_title_id")
	private LookupTitle lookupTitle;
	
	@Column(name = "initials")
	private String initials;
	
	@Column(name = "first_name")
	private String firstName;
	
	@Column(name = "middle_name")
	private String middleName;
	
	@Column(name = "last_name")
	private String lastName;
	
	@Column(name = "date_of_birth")
	private Date dateOfBirth;
	
	@Column(name = "idNumber")
	private String idNumber;
	
	@OneToOne
	@JoinColumn(name = "lookup_race_id")
	private LookupRace lookupRace;
	
	@OneToOne
	@JoinColumn(name = "lookup_gender_id")
	private LookupGender lookupGender;
	
	@OneToOne
	@JoinColumn(name = "lookup_marital_status_id")
	private LookupMaritalStatus lookupMaritalStatus;
	
	@OneToOne
	@JoinColumn(name = "lookup_language_id")
	private LookupLanguage lookupLanguage;
	
	@OneToOne(cascade=CascadeType.ALL)
	@JoinColumn(name="contact_info_id")
	private ContactInfo contactInfo;
	
	@OneToOne(cascade=CascadeType.ALL)
	@JoinColumn(name="address_id")
	private AddressInfo addressInfo;

	public int getClientId() {
		return clientId;
	}

	public void setClientId(int clientId) {
		this.clientId = clientId;
	}

	public LookupTitle getLookupTitle() {
		return lookupTitle;
	}

	public void setLookupTitle(LookupTitle lookupTitle) {
		this.lookupTitle = lookupTitle;
	}

	public String getInitials() {
		return initials;
	}

	public void setInitials(String initials) {
		this.initials = initials;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getMiddleName() {
		return middleName;
	}

	public void setMiddleName(String middleName) {
		this.middleName = middleName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public Date getDateOfBirth() {
		return dateOfBirth;
	}

	public void setDateOfBirth(Date dateOfBirth) {
		this.dateOfBirth = dateOfBirth;
	}

	public String getIdNumber() {
		return idNumber;
	}

	public void setIdNumber(String idNumber) {
		this.idNumber = idNumber;
	}

	public LookupRace getLookupRace() {
		return lookupRace;
	}

	public void setLookupRace(LookupRace lookupRace) {
		this.lookupRace = lookupRace;
	}

	public LookupGender getLookupGender() {
		return lookupGender;
	}

	public void setLookupGender(LookupGender lookupGender) {
		this.lookupGender = lookupGender;
	}

	public LookupMaritalStatus getLookupMaritalStatus() {
		return lookupMaritalStatus;
	}

	public void setLookupMaritalStatus(LookupMaritalStatus lookupMaritalStatus) {
		this.lookupMaritalStatus = lookupMaritalStatus;
	}

	public LookupLanguage getLookupLanguage() {
		return lookupLanguage;
	}

	public void setLookupLanguage(LookupLanguage lookupLanguage) {
		this.lookupLanguage = lookupLanguage;
	}

	public ContactInfo getContactInfo() {
		return contactInfo;
	}

	public void setContactInfo(ContactInfo contactInfo) {
		this.contactInfo = contactInfo;
	}

	public AddressInfo getAddressInfo() {
		return addressInfo;
	}

	public void setAddressInfo(AddressInfo addressInfo) {
		this.addressInfo = addressInfo;
	}

	@Override
	public String toString() {
		return "Client [clientId=" + clientId + ", lookupTitle=" + lookupTitle + ", initials=" + initials
				+ ", firstName=" + firstName + ", middleName=" + middleName + ", lastName=" + lastName
				+ ", dateOfBirth=" + dateOfBirth + ", idNumber=" + idNumber + ", lookupRace=" + lookupRace
				+ ", lookupGender=" + lookupGender + ", lookupMaritalStatus=" + lookupMaritalStatus
				+ ", lookupLanguage=" + lookupLanguage + ", contactInfo=" + contactInfo + ", addressInfo=" + addressInfo
				+ "]";
	}
}
