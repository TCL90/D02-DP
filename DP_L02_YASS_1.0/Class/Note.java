package domain;

import java.util.Date;
import javax.validation.constraints.Past;
import org.hibernate.validator.constraints.NotBlank;


public class Note extends Report {

	private Date	moment;
	private String	mandatoryComment;
	private String	refereeComment;
	private String handWorkerComment;
	
	@Past
	public Date getMoment() {
		return moment;
	}
	public void setMoment(final Date moment) {
		this.moment = moment;
	}
	@NotBlank
	public String getMandatoryComment() {
		return mandatoryComment;
	}
	public void setMandatoryComment(final String mandatoryComment) {
		this.mandatoryComment = mandatoryComment;
	}
	@NotBlank
	public String getRefereeComment() {
		return refereeComment;
	}
	public void setRefereeComment(final String refereeComment) {
		this.refereeComment = refereeComment;
	}
	
	@NotBlank
	public String getHandyWorkerComment() {
		return handWorkerComment;
	}
	public void setHandyWorkerComment(final String handWorkerComment) {
		this.handWorkerComment = handWorkerComment;
	}
}