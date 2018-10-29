
package domain;

import org.hibernate.validator.constraints.URL;

public class Sponsorship extends DomainEntity {

	private String	bannerURL;
	private String	pageURL;
	private String	creditCard;


	@URL
	public String getBannerURL() {
		return this.bannerURL;
	}
	public void setBannerURL(final String bannerURL) {
		this.bannerURL = bannerURL;
	}

	@URL
	public String getPageURL() {
		return this.pageURL;
	}
	public void setPageURL(final String pageURL) {
		this.pageURL = pageURL;
	}

	public String getCreditCard() {
		return this.creditCard;
	}
	public void setCreditCard(final String creditCard) {
		this.creditCard = creditCard;
	}

}
