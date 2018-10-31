package domain;

import java.util.Date;
import org.hibernate.validator.constraints.NotBlank;

public class Phase extends DomainEntity{

	private String	title;
	private String	description;
	private Date	startMoment;
	private Date	endMoment;
	private Integer	number;
	
	@NotBlank
	public String getTitle() {
		return title;
	}
	public void setTitle(final String title) {
		this.title = title;
	}
	@NotBlank
	public String getDescription() {
		return description;
	}
	public void setDescription(final String description) {
		this.description = description;
	}
	public Date getStartMoment() {
		return startMoment;
	}
	public void setStartMoment(final Date startMoment) {
		this.startMoment = startMoment;
	}
	public Date getEndMoment() {
		return endMoment;
	}
	public void setEndMoment(final Date endMoment) {
		this.endMoment = endMoment;
	}
	public Integer getNumber() {
		return number;
	}
	public void setNumber(final Integer number) {
		this.number = number;
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