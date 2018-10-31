package domain;

import java.util.Date;

import org.hibernate.validator.constraints.NotBlank;
import org.hibernate.validator.constraints.URL;

public class ProfessionalRecord extends Curriculum {

	private String companyName;
	private String role;
	private String attachmentURL;
	private String comment;
	private Date startDate;
	private Date endDate;
	
	
	@NotBlank
	public String getCompanyName() {
		return companyName;
	}
	public void setCompanyName(final String companyName) {
		this.companyName = companyName;
	}
	@NotBlank
	public String getRole() {
		return role;
	}
	public void setRole(final String role) {
		this.role = role;
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