
package domain;

public class Endorsement extends DomainEntity {

	private Endorser	endorser;


	public Endorser getEndorser() {
		return this.endorser;
	}

	public void setEndorser(final Endorser endorser) {
		this.endorser = endorser;
	}

}
