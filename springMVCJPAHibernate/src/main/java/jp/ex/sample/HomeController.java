package jp.ex.sample;

import java.util.Locale;

import jp.ex.sample.service.HomeService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 * Handles requests for the application home page.
 */
@Controller
public class HomeController {


	@Autowired
    @Qualifier("service")
    private HomeService homeService;

	@RequestMapping(value = "/", method = RequestMethod.GET)
	public String home(Locale locale, Model model) {

		String data =homeService.serviceMethod();
		model.addAttribute("data", data );

		return "home";
	}
}