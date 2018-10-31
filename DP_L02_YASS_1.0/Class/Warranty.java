package domain;

import org.hibernate.validator.constraints.NotBlank;

public class Warranty extends DomainEntity {
	
	private String	title;
	private String	terms;
	private String	applicableLaws;
	private boolean finalMode;
	
	@NotBlank
	public String getTitle() {
		return title;
	}
	public void setTitle(final String title) {
		this.title = title;
	}
	@NotBlank
	public String getTerms() {
		return terms;
	}
	public void setTerms(final String terms) {
		this.terms = terms;
	}
	@NotBlank
	public String getApplicableLaws() {
		return applicableLaws;
	}
	public void setApplicableLaws(final String applicableLaws) {
		this.applicableLaws = applicableLaws;
	}
	public boolean isFinalMode() {
		return finalMode;
	}
	public void setFinalMode(final boolean finalMode) {
		this.finalMode = finalMode;
	}
	
	

}
