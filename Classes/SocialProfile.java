
package domain;

import javax.validation.constraints.Digits;

import org.hibernate.validator.constraints.NotBlank;
import org.hibernate.validator.constraints.URL;

public class SocialProfile extends DomainEntity {

	private String	nick;
	private String	socialNetwork;
	private String	link;
	private double	score;


	@NotBlank
	public String getNick() {
		return this.nick;
	}
	public void setNick(final String nick) {
		this.nick = nick;
	}

	@NotBlank
	public String getSocialNetwork() {
		return this.socialNetwork;
	}
	public void setSocialNetwork(final String socialNetwork) {
		this.socialNetwork = socialNetwork;
	}

	@URL
	public String getLink() {
		return this.link;
	}
	public void setLink(final String link) {
		this.link = link;
	}

	@Digits(integer = 3, fraction = 2)
	public double getScore() {
		return this.score;
	}
	public void setScore(final double score) {
		this.score = score;
	}

}
