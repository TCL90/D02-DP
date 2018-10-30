
package domain;

import java.util.Date;

import javax.validation.constraints.Past;
import javax.validation.constraints.Pattern;

import org.hibernate.validator.constraints.NotBlank;

public class Message extends DomainEntity {

	private Date	moment;
	private String	priority;
	private String	tag;
	private String	body;
	private String	subject;
	private boolean	flagSpam;

	private Actor	sender;
	private Actor	recipient;


	@Past
	public Date getMoment() {
		return this.moment;
	}
	public void setMoment(final Date moment) {
		this.moment = moment;
	}

	@Pattern(regexp = "^HIGH|NEUTRAL|LOW$")
	public String getPriority() {
		return this.priority;
	}
	public void setPriority(final String priority) {
		this.priority = priority;
	}

	@NotBlank
	public String getTag() {
		return this.tag;
	}
	public void setTag(final String tag) {
		this.tag = tag;
	}

	@NotBlank
	public String getBody() {
		return this.body;
	}
	public void setBody(final String body) {
		this.body = body;
	}

	@NotBlank
	public String getSubject() {
		return this.subject;
	}
	public void setSubject(final String subject) {
		this.subject = subject;
	}

	public boolean getFlagSpam() {
		return this.flagSpam;
	}
	public void setFlagSpam(final boolean flagSpam) {
		this.flagSpam = flagSpam;
	}
	public Actor getSender() {
		return sender;
	}
	public void setSender(Actor sender) {
		this.sender = sender;
	}
	public Actor getRecipient() {
		return recipient;
	}
	public void setRecipient(Actor recipient) {
		this.recipient = recipient;
	}

}
