
package domain;

import java.util.Collection;

import org.hibernate.validator.constraints.Email;
import org.hibernate.validator.constraints.NotBlank;

public abstract class Actor extends DomainEntity {

	private String					name;
	private String					email;
	private String					phoneNumber;
	private String					address;
	private boolean					ban;
	private Collection<UserAccount>	userAcounts;


	@NotBlank
	public String getName() {
		return this.name;
	}
	public void setName(final String name) {
		this.name = name;
	}

	@Email
	public String getEmail() {
		return this.email;
	}
	public void setEmail(final String email) {
		this.email = email;
	}

	public String getPhoneNumber() {
		return this.phoneNumber;
	}
	public void setPhoneNumber(final String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}

	@NotBlank
	public String getAddress() {
		return this.address;
	}
	public void setAddress(final String address) {
		this.address = address;
	}

	public boolean getBan() {
		return this.ban;
	}
	public void setBan(final boolean ban) {
		this.ban = ban;
	}

	public Collection<UserAccount> getUserAcounts() {
		return this.userAcounts;
	}
	public void setUserAcounts(final Collection<UserAccount> userAcounts) {
		this.userAcounts = userAcounts;
	}

}
