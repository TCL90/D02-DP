package domain;

import java.util.Collection;
import java.util.Date;

import javax.validation.constraints.Digits;

import org.hibernate.validator.constraints.NotBlank;

public class Finder extends DomainEntity {

	private String	keyWord;
	private String category;
	private Money	minPrice;
	private Money	maxPrice;
	private Date	startDate;
	private Date	endDate;
	private double 	warranty;
	
	@NotBlank
	public String getKeyWord() {
		return keyWord;
	}
	public void setKeyWord(final String keyWord) {
		this.keyWord = keyWord;
	}
	@NotBlank
	public String getCategory() {
		return category;
	}
	public void setCategory(final String category) {
		this.category = category;
	}
	public Money getMinPrice() {
		return minPrice;
	}
	public void setMinPrice(final Money minPrice) {
		this.minPrice = minPrice;
	}
	public Money getMaxPrice() {
		return maxPrice;
	}
	public void setMaxPrice(final Money maxPrice) {
		this.maxPrice = maxPrice;
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
	@Digits(integer = 6, fraction = 2)
	public double getWarranty() {
		return warranty;
	}
	public void setWarranty(final double warranty) {
		this.warranty = warranty;
	}	
	
	//Relationships
	Collection<Finder> finders;

	public Collection<Finder> getFinders() {
		return finders;
	}
	public void setFinders(final Collection<Finder> finders) {
		this.finders = finders;
	}
	
}