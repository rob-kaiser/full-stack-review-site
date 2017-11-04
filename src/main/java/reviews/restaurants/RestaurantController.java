package reviews.restaurants;

import javax.annotation.Resource;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class RestaurantController {

	@Resource
	private ReviewRepository reviewRepo;

	@Resource
	private CategoryRepository categoryRepo;

	@RequestMapping("/home")
	public String showHomepage() {
		return "home";
	}

	@RequestMapping("/categories")
	public String showCategories(Model model) {

		model.addAttribute("categories", categoryRepo.findAll());
		return "categoriesList";
	}

	@RequestMapping("/category")
	public String showCategory(@RequestParam("id") Long id, Model model) {
		model.addAttribute(categoryRepo.findOne(id));
		return "singleCategory";
	}

	@RequestMapping("/restaurants")
	public String showRestaurants(Model model) {
		model.addAttribute("restaurants", reviewRepo.findAll());
		return "restaurantList";
	}

	@RequestMapping("/restaurant")
	public String showRestaurant(@RequestParam("id") long id, Model model) {
		Review selectedRestaurant = reviewRepo.findOne(id);
		model.addAttribute(selectedRestaurant);
		return "singleRestaurant";
	}
}