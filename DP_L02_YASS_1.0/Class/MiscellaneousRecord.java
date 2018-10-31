package domain;

import org.hibernate.validator.constraints.NotBlank;
import org.hibernate.validator.constraints.URL;

public class MiscellaneousRecord extends Curriculum {
	
	private String title;
	private String attachmentLink;
	private String comment;
	
	@NotBlank
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	@URL
	public String getAttachmentLink() {
		return attachmentLink;
	}
	public void setAttachmentLink(String attachmentLink) {
		this.attachmentLink = attachmentLink;
	}
	@NotBlank
	public String getComment() {
		return comment;
	}
	public void setComment(String comment) {
		this.comment = comment;
	}
}