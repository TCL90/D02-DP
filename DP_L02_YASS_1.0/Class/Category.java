package domain;

import java.util.Collection;

import org.hibernate.validator.constraints.NotBlank;

public class Category extends DomainEntity {
	
	private String	name;

	
	@NotBlank
	public String getName() {
		return name;
	}

	public void setName(final String name) {
		this.name = name;
	}
	
	//Relationships
	private Collection<Category> categories;

	public Collection<Category> getCategories() {
		return this.categories;
	}

	public void setCategories(final Collection<Category> categories) {
		this.categories = categories;
	}
	
}
