package co.jsa.Synimbus;

import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class SynimbusController {

	//@Autowired
	
	@RequestMapping("/")
	public ModelAndView index(){
		ModelAndView mav = new ModelAndView("index");
		
		return mav;
	}
}
