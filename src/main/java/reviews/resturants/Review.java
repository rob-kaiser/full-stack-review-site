package reviews.resturants;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Lob;
import javax.persistence.ManyToOne;

@Entity
public class Review {

	private String restaurant;
	private String image;
	private String reviewCategory;
	@Lob
	private String content;
	private String phoneNumber;
	private String address;
	@Id
	@GeneratedValue
	long id;

	@ManyToOne
	public long getId() {
		return id;
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

	public String getReviewCategory() {
		return reviewCategory;
	}

	public Review(long id, String restaurant, String image, String reviewCategory, String content, String phoneNumber,
			String address) {
		this.id = id;
		this.restaurant = restaurant;
		this.image = image;
		this.reviewCategory = reviewCategory;
		this.content = content;
		this.phoneNumber = phoneNumber;
		this.address = address;
	}

}
