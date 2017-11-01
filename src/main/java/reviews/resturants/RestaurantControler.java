package reviews.resturants;

import java.util.Collection;

import javax.annotation.Resource;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class RestaurantControler {

	@Resource
	private ReviewRepository reviews;

	@RequestMapping("/restaurant")
	public String showRestaurant(@RequestParam("id") long id, Model model) {

		model.addAttribute("modelRestaurant", reviews.findOne(id));
		return "restaurant-template";

	}

	@RequestMapping("/allRestaurant")
	public String showAll(Model model) {

		Collection<Review> restaurants = reviews.findAll();

		model.addAttribute("modelAllRestaurant", restaurants);
		return "restaurant-all-template";
	}

}