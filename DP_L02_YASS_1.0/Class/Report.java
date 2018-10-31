package domain;

import java.util.Collection;
import java.util.Date;

import javax.validation.constraints.Past;

import org.hibernate.validator.constraints.NotBlank;
import org.hibernate.validator.constraints.URL;

public class Report extends DomainEntity {
	
	private Date	moment;
	private String	description;
	private String	attachments;
	private Collection<Note> notes;
	

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
	
	public Collection<Note> getNotes() {
		return notes;
	}
	public void setNotes(final Collection<Note> notes) {
		this.notes = notes;
	}
	
	//Relationships
	private Complaint complaint;


	public Complaint getComplaint() {
		return complaint;
	}
	public void setComplaint(final Complaint complaint) {
		this.complaint = complaint;
	}
	
	
	
}