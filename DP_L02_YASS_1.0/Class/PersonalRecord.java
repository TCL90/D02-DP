package domain;

import org.hibernate.validator.constraints.Email;
import org.hibernate.validator.constraints.NotBlank;
import org.hibernate.validator.constraints.URL;

public class PersonalRecord extends Curriculum {

	private String fullName;
	private String photoURL;
	private String email;
	private String phoneNumber;
	private String linkedInURL;
	
	@NotBlank
	public String getFullName() {
		return fullName;
	}
	public void setFullName(final String fullName) {
		this.fullName = fullName;
	}
	@URL
	public String getPhotoURL() {
		return photoURL;
	}
	public void setPhotoURL(final String photoURL) {
		this.photoURL = photoURL;
	}
	@Email
	public String getEmail() {
		return email;
	}
	public void setEmail(final String email) {
		this.email = email;
	}
	public String getPhoneNumber() {
		return phoneNumber;
	}
	public void setPhoneNumber(final String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}
	@URL
	public String getLinkedInURL() {
		return linkedInURL;
	}
	public void setLinkedInURL(final String linkedInURL) {
		this.linkedInURL = linkedInURL;
	}
	
}
