package domain;

import org.hibernate.validator.constraints.Email;
import org.hibernate.validator.constraints.NotBlank;
import org.hibernate.validator.constraints.URL;

public class EndorserRecord extends Curriculum {
	
	private String fullName;
	private String email;
	private String phoneNumer;
	private String linkedInURL;
	private String comment;
	
	
	@NotBlank
	public String getFullName() {
		return fullName;
	}
	public void setFullName(final String fullName) {
		this.fullName = fullName;
	}
	@Email
	public String getEmail() {
		return email;
	}
	public void setEmail(final String email) {
		this.email = email;
	}
	public String getPhoneNumer() {
		return phoneNumer;
	}
	public void setPhoneNumer(final String phoneNumer) {
		this.phoneNumer = phoneNumer;
	}
	@URL
	public String getLinkeIndURL() {
		return linkedInURL;
	}
	public void setLinkedInURL(final String linkedInURL) {
		this.linkedInURL = linkedInURL;
	}
	@NotBlank
	public String getComment() {
		return comment;
	}
	public void setComment(final String comment) {
		this.comment = comment;
	}
}