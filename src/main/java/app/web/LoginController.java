package app.web;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import domain.service.UserService;



@Controller
@RequestMapping("")
public class LoginController {

	@Autowired
	private UserService userService;
	
	@RequestMapping(value = { "", "/", "/login" }, method = { RequestMethod.GET })
	public String login() {
		return "login";
	}
	
}