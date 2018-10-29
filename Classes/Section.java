
package domain;

import javax.validation.constraints.Min;

import org.hibernate.validator.constraints.NotBlank;
import org.hibernate.validator.constraints.URL;

public class Section extends DomainEntity {

	private String	title;
	private String	text;
	private String	photoURL;
	private int		number;


	@NotBlank
	public String getTitle() {
		return this.title;
	}
	public void setTitle(final String title) {
		this.title = title;
	}

	@NotBlank
	public String getText() {
		return this.text;
	}
	public void setText(final String text) {
		this.text = text;
	}

	@URL
	public String getPhotoURL() {
		return this.photoURL;
	}
	public void setPhotoURL(final String photoURL) {
		this.photoURL = photoURL;
	}

	@Min(1)
	public int getNumber() {
		return this.number;
	}
	public void setNumber(final int number) {
		this.number = number;
	}

}
