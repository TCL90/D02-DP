package domain;

import java.util.Collection;
import java.util.Date;
import javax.validation.constraints.Past;
import org.hibernate.validator.constraints.NotBlank;

public class FixUpTask extends DomainEntity {
	
	private String	ticker;
	private Date	moment;
	private String	description;
	private String	adress;
	private Money	maximumPrice;
	private Date	startDate;
	private Date	endDate;
	
	
	public String getTicker() {
		return ticker;
	}
	public void setTicker(final String ticker) {
		this.ticker = ticker;
	}
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
	@NotBlank
	public String getAdress() {
		return adress;
	}
	public void setAdress(final String adress) {
		this.adress = adress;
	}
	public Money getMaximumPrice() {
		return maximumPrice;
	}
	public void setMaximumPrice(final Money maximumPrice) {
		this.maximumPrice = maximumPrice;
	}
	@NotBlank
	public Date getStartDate() {
		return startDate;
	}
	public void setStartDate(final Date startDate) {
		this.startDate = startDate;
	}
	@NotBlank
	public Date getEndDate() {
		return endDate;
	}
	public void setEndDate(final Date endDate) {
		this.endDate = endDate;
	}
	
	//Relationships
	private Collection<Application> application;
	private Category category;
	private Collection<Warranty> warranty;


	public Collection<Application> getApplication() {
		return application;
	}
	public void setApplication(final Collection<Application> application) {
		this.application = application;
	}
	public Category getCategory() {
		return category;
	}
	public void setCategory(final Category category) {
		this.category = category;
	}
	public Collection<Warranty> getWarranty() {
		return warranty;
	}
	public void setWarranty(final Collection<Warranty> warranty) {
		this.warranty = warranty;
	}
	
	
}