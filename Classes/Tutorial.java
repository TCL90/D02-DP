
package domain;

import java.util.Collection;
import java.util.Date;

import javax.validation.constraints.Past;

import org.hibernate.validator.constraints.NotBlank;
import org.hibernate.validator.constraints.URL;

public class Tutorial extends DomainEntity {

	private String				title;
	private Date				lastUpdate;
	private String				summary;
	private String				photoURL;
	private Collection<Section>	sections;


	@NotBlank
	public String getTitle() {
		return this.title;
	}
	public void setTitle(final String title) {
		this.title = title;
	}

	@Past
	public Date getLastUpdate() {
		return this.lastUpdate;
	}
	public void setLastUpdate(final Date lastUpdate) {
		this.lastUpdate = lastUpdate;
	}

	@NotBlank
	public String getSummary() {
		return this.summary;
	}
	public void setSummary(final String summary) {
		this.summary = summary;
	}

	@URL
	public String getPhotoURL() {
		return this.photoURL;
	}
	public void setPhotoURL(final String photoURL) {
		this.photoURL = photoURL;
	}

	public Collection<Section> getSections() {
		return this.sections;
	}
	public void setSections(final Collection<Section> sections) {
		this.sections = sections;
	}

}
