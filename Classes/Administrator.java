
package domain;

import java.util.Collection;

public class Administrator extends Actor {

	private Collection<Actor>	bannedActors;


	public Collection<Actor> getBannedActors() {
		return this.bannedActors;
	}

	public void setBannedActors(final Collection<Actor> bannedActors) {
		this.bannedActors = bannedActors;
	}

}
