
package domain;

import org.hibernate.validator.constraints.NotBlank;

public class Box extends DomainEntity {

	private String	name;
	private boolean	predefined;


	@NotBlank
	public String getName() {
		return this.name;
	}
	public void setName(final String name) {
		this.name = name;
	}

	public boolean getPredefined() {
		return this.predefined;
	}
	public void setPredefined(final boolean predefined) {
		this.predefined = predefined;
	}

}
