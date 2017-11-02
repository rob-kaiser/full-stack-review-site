package reviews.restaurants;

import java.util.Collection;

import javax.annotation.Resource;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class RestaurantController {

	@Resource
	private ReviewRepository reviews;

	@RequestMapping("/review")
	public String showReview(@RequestParam("id") long id, Model model) {

		model.addAttribute("reviewModel", reviews.findOne(id));
		return "reviewView";

	}

	@RequestMapping("/categories")
	public String showCategories(Model model) {

		Collection<Review> restaurants = reviews.findAll();

		model.addAttribute("categoriesModel", restaurants);
		return "categoriesView";
	}

	@RequestMapping("/category")
	public String showCategory(@RequestParam("id") long id, Model model) {

		model.addAttribute("singleCategoryModel", reviews.findOne(id));
		return "singleCategoryView";

	}

}