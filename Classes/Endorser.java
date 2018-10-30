
package domain;

import java.util.Collection;

public class Endorser extends Actor {

	private Collection<Endorsement>	endorsements;


	public Collection<Endorsement> getEndorsements() {
		return this.endorsements;
	}

	public void setEndorsements(final Collection<Endorsement> endorsements) {
		this.endorsements = endorsements;
	}

}
