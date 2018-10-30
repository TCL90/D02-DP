
package domain;

import java.util.Collection;

import javax.validation.constraints.Digits;
import javax.validation.constraints.Min;

public class Customer extends Endorser {

	private double					score;

	private Collection<FixUpTask>	fixuptasks;
	private Collection<Note>		notes;
	private Complaint				complaint;


	@Digits(integer = 1, fraction = 2)
	@Min(0)
	public double getScore() {
		return this.score;
	}

	public void setScore(final double score) {
		this.score = score;
	}

	public Collection<FixUpTask> getFixuptasks() {
		return this.fixuptasks;
	}

	public void setFixuptasks(final Collection<FixUpTask> fixuptasks) {
		this.fixuptasks = fixuptasks;
	}

	public Collection<Note> getNotes() {
		return this.notes;
	}

	public void setNotes(final Collection<Note> notes) {
		this.notes = notes;
	}

	public Complaint getComplaint() {
		return this.complaint;
	}

	public void setComplaint(final Complaint complaint) {
		this.complaint = complaint;
	}

}
