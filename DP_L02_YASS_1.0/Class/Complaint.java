package domain;

import org.hibernate.validator.constraints.NotBlank;
import org.hibernate.validator.constraints.URL;

import java.util.Date;

import javax.validation.constraints.Past;

public class Complaint extends DomainEntity {
	
	private String ticker;
	private Date moment;
	private String description;
	private String attachments;
	
	
	public String getTicker() {
		return ticker;
	}
	public void setTicker(final String ticker) {
		this.ticker = ticker;
	}
	@Past
	public Date getMoment() {
		return moment;
	}
	public void setMoment(final Date moment) {
		this.moment = moment;
	}
	@NotBlank
	public String getDescription() {
		return description;
	}
	public void setDescription(final String description) {
		this.description = description;
	}
	@URL
	public String getAttachments() {
		return attachments;
	}
	public void setAttachments(final String attachments) {
		this.attachments = attachments;
	}

}