
package domain;

import org.hibernate.validator.constraints.NotBlank;
import org.hibernate.validator.constraints.URL;

public class Customisation extends DomainEntity {

	private String	systemName;
	private String	bannerURL;
	private String	welcomeMessage;
	private String	spamWords;
	private int		VATpercentage;
	//no es opcional, si lo fuera -> Integer
	private String	phoneNumberCountryCode;
	private String	creditCard;
	private String	positiveWords;
	private String	negativeWords;


	@NotBlank
	public String getSystemName() {
		return this.systemName;
	}
	public void setSystemName(final String systemName) {
		this.systemName = systemName;
	}

	@URL
	public String getBannerURL() {
		return this.bannerURL;
	}
	public void setBannerURL(final String bannerURL) {
		this.bannerURL = bannerURL;
	}

	@NotBlank
	public String getWelcomeMessage() {
		return this.welcomeMessage;
	}
	public void setWelcomeMessage(final String welcomeMessage) {
		this.welcomeMessage = welcomeMessage;
	}

	@NotBlank
	public String getSpamWords() {
		return this.spamWords;
	}
	public void setSpamWords(final String spamWords) {
		this.spamWords = spamWords;
	}

	public int getVATpercentage() {
		return this.VATpercentage;
	}
	public void setVATpercentage(final int vATpercentage) {
		this.VATpercentage = vATpercentage;
	}

	@NotBlank
	public String getPhoneNumberCountryCode() {
		return this.phoneNumberCountryCode;
	}
	public void setPhoneNumberCountryCode(final String phoneNumberCountryCode) {
		this.phoneNumberCountryCode = phoneNumberCountryCode;
	}

	@NotBlank
	public String getCreditCard() {
		return this.creditCard;
	}
	public void setCreditCard(final String creditCard) {
		this.creditCard = creditCard;
	}

	@NotBlank
	public String getPositiveWords() {
		return this.positiveWords;
	}
	public void setPositiveWords(final String positiveWords) {
		this.positiveWords = positiveWords;
	}

	@NotBlank
	public String getNegativeWords() {
		return this.negativeWords;
	}
	public void setNegativeWords(final String negativeWords) {
		this.negativeWords = negativeWords;
	}

}
