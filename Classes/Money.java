
package domain;

import javax.validation.constraints.Digits;
import javax.validation.constraints.Min;

import org.hibernate.validator.constraints.NotBlank;

public class Money extends DomainEntity {

	public Money(final double amount, final String currency) {
		super();
		this.amount = amount;
		this.currency = currency;
	}


	private double	amount;
	private String	currency;


	@Min(0)
	@Digits(integer = 9, fraction = 2)
	public double getAmount() {
		return this.amount;
	}
	public void setAmount(final double amount) {
		this.amount = amount;
	}

	@NotBlank
	public String getCurrency() {
		return this.currency;
	}
	public void setCurrency(final String currency) {
		this.currency = currency;
	}

	private Money newMoney(final double amount2, final String currency2) {
		return new Money(amount2, currency2);
	}

	public Money add(final Money money) {
		return this.newMoney(money.getAmount() + this.amount, this.currency);
	}

	public Money substract(final Money money) {
		return this.newMoney(this.amount - money.getAmount(), this.currency);
	}

}
