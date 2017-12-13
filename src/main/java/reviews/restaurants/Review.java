package reviews.restaurants;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.Lob;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;

@Entity
public class Review {

	@Id
	@GeneratedValue
	private long id;
	private String restaurant;
	@Lob
	private String image;
	@ManyToOne
	private Category category;
	@Lob
	private String content;
	private String phoneNumber;
	@Lob
	private String address;

	public Category getCategory() {
		return category;
	}
	@ManyToMany
	private Set<Tag> tags;

	public long getId() {
		return id;
	}
	
	public Set<Tag> getTags() {
		return tags;
	}
	private Review() {

	}

	public Review(Category category, String restaurant, String image, String content, String phoneNumber,
			String address, Tag...tags) {

		this.restaurant = restaurant;
		this.image = image;
		this.category = category;
		this.content = content;
		this.phoneNumber = phoneNumber;
		this.address = address;
		this.tags = new HashSet<>(Arrays.asList(tags));

	}

	public String getImage() {
		return image;
	}

	public String getContent() {
		return content;
	}

	public String getPhoneNumber() {
		return phoneNumber;
	}

	public String getAddress() {
		return address;
	}

	public String getRestaurant() {
		return restaurant;
	}

	@Override
	public String toString() {
		return String.format("A restaurant with id %s and name '%s'", id, restaurant);
	}

	public void add(Tag tag) {
		tags.add(tag);

	}
	public void remove(Tag tag) {
		tags.remove(tag);
	}
}
