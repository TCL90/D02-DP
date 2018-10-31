package domain;

import java.util.Date;
import javax.validation.constraints.Pattern;

import org.hibernate.validator.constraints.NotBlank;


public class Application extends DomainEntity {

	private Date	moment;
	private String	status;
	private int		offeredPrice;
	private String	comment;
	private String	rejectedCause;
	private CreditCard creditCard;
	

	@NotBlank
	public Date getMoment() {
		return moment;
	}
	public void setMoment(final Date moment) {
		this.moment = moment;
	}
	@Pattern(regexp = "^pending|accepted|rejected$")
	public String getStatus() {
		return status;
	}
	public void setStatus(final String status) {
		this.status = status;
	}
	public int getOfferedPrice() {
		return offeredPrice;
	}
	public void setOfferedPrice(final int offeredPrice) {
		this.offeredPrice = offeredPrice;
	}
	@NotBlank
	public String getComment() {
		return comment;
	}
	public void setComment(final String comment) {
		this.comment = comment;
	}
	@NotBlank
	public String getRejectedCause() {
		return rejectedCause;
	}
	public void setRejectedCause(final String rejectedCause) {
		this.rejectedCause = rejectedCause;
	}
	
	public CreditCard getCreditCard() {
		return creditCard;
	}
	public void setCreditCard(final CreditCard creditCard) {
		this.creditCard = creditCard;
	}
	
	//Relationships
	private FixUpTask fixUpTask;

	public FixUpTask getFixUpTask() {
		return fixUpTask;
	}
	public void setFixUpTask(final FixUpTask fixUpTask) {
		this.fixUpTask = fixUpTask;
	}
	
	
	
}