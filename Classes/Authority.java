
package domain;

import org.hibernate.validator.constraints.NotBlank;

public class Authority extends DomainEntity {

	private final String	ADMIN		= "ADMIN";
	private final String	CUSTOMER	= "CUSTOMER";
	private final String	REVIEWER	= "REVIEWER";
	private String			authority;


	public String getADMIN() {
		return this.ADMIN;
	}

	public String getCUSTOMER() {
		return this.CUSTOMER;
	}

	public String getREVIEWER() {
		return this.REVIEWER;
	}

	@NotBlank
	public String getAuthority() {
		return this.authority;
	}
	public void setAuthority(final String authority) {
		this.authority = authority;
	}

}
