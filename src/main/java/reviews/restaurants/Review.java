package reviews.restaurants;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.Lob;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;

@Entity
public class Review {

	@Id @GeneratedValue
	private long id;
	private String restaurant;
	private String image;
	private Category reviewCategory;
	@Lob
	private String content;
	private String phoneNumber;
	private String address;
	private String hoursOfOperationA;
	private String hoursOfOperationB;
	private String hoursOfOperationC;
	
	
	@ManyToOne
	private Category category;
	
	public Category getCategory() {
		return reviewCategory;
	}
	
	@JoinColumn(name="review")

	public long getId() {
		return id;
	}
	
	private Review() {
		
	}
	public Review(String restaurant) {
		this.restaurant=restaurant;
	}
	
	public Review(Category reviewCategory, String restaurant, String image, String content, String phoneNumber,
			String address, String hoursOfOperationA, String hoursOfOperationB, String hoursOfOperationC) {
	
		this.restaurant = restaurant;
		this.image = image;
		this.reviewCategory = reviewCategory;
		this.content = content;
		this.phoneNumber = phoneNumber;
		this.address = address;
		this.hoursOfOperationA = hoursOfOperationA;
		this.hoursOfOperationB = hoursOfOperationB;
		this.hoursOfOperationC = hoursOfOperationC;
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

	public String getHoursOfOperationA() {
		return hoursOfOperationA;
	}

	public String getHoursOfOperationB() {
		return hoursOfOperationB;
	}

	public String getHoursOfOperationC() {
		return hoursOfOperationC;
	}

	public String getRestaurant() {
		return restaurant;
	}

	public Category getReviewCategory() {
		return reviewCategory;
	}

	

}
