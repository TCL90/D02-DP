package domain;

import java.util.Date;

import org.hibernate.validator.constraints.NotBlank;
import org.hibernate.validator.constraints.URL;

public class EducationRecord extends Curriculum {
	
	private String title;
	private String period;
	private String institution;
	private String attachmentURL;
	private String comment;
	private Date startDate;
	private Date endDate;
	

	@NotBlank
	public String getTitle() {
		return title;
	}
	public void setTitle(final String title) {
		this.title = title;
	}
	public String getPeriod() {
		return period;
	}
	public void setPeriod(final String period) {
		this.period = period;
	}
	@NotBlank
	public String getInstitution() {
		return institution;
	}
	public void setInstitution(final String institution) {
		this.institution = institution;
	}
	@URL
	public String getAttachmentURL() {
		return attachmentURL;
	}
	public void setAttachmentURL(final String attachmentURL) {
		this.attachmentURL = attachmentURL;
	}
	@NotBlank
	public String getComment() {
		return comment;
	}
	public void setComment(final String comment) {
		this.comment = comment;
	}
	
	public Date getStartDate() {
		return startDate;
	}
	public void setStartDate(final Date startDate) {
		this.startDate = startDate;
	}
	public Date getEndDate() {
		return endDate;
	}
	public void setEndDate(final Date endDate) {
		this.endDate = endDate;
	}
	

}
