package app.web;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import domain.service.ClientService;
import domain.service.UserService;
import domain.model.Application;
import domain.model.Client;
import domain.model.Review;

@Controller
@RequestMapping("/client")
public class ClientController {


	@Autowired
	private ClientService clientService;
		
	@Autowired
	private UserService userService;
	
	@PreAuthorize("isFullyAuthenticated()") 
	@RequestMapping(value = "/{id}/review", method = RequestMethod.GET)
	public String getReview(@PathVariable("id") Client client,
			HttpSession session, Model model){
		model.AddAttribute(UserService.getReview());
		return "client.reviews";
	};
	
	@PreAuthorize("isFullyAuthenticated()") 
	@RequestMapping(value = "/{id}/setOrder", method = RequestMethod.GET)
	public String setOrder(@PathVariable("id") Client client,
			HttpSession session, Model model){
		model.addAttribute(UserService.addOrUpdateApplication(Application application))
		return "client.order";
	};
	
	@PreAuthorize("isFullyAuthenticated()") 
	@RequestMapping(value = "/{id}/notice", method = RequestMethod.GET)
	public String notice(@PathVariable("id") Client client,
			HttpSession session, Model model){
		model.addAttribute(UserService.getMessageByClient(Client client));
		return "client.notice";
	};
	
	@PreAuthorize("isFullyAuthenticated()") 
	@RequestMapping(value = "/{id}/setreview", method = RequestMethod.GET)
	public String setReview(@PathVariable("id") Client client,
			HttpSession session, Model model){
		model.addAttribute(UserService.addReview(Review review));
		return "client.setreview";
	};
	
	@PreAuthorize("isFullyAuthenticated()") 
	@RequestMapping(value = "/{id}/listorder", method = RequestMethod.GET)
	public String listOrder(@PathVariable("id") Client client,
			HttpSession session, Model model){
		model.addAttribute(UserService. getApplication(Client client));
		return "client.listorder";
	};
	
	@PreAuthorize("isFullyAuthenticated()") 
	@RequestMapping(value = "/{id}/liststo", method = RequestMethod.GET)
	public String liststo(@PathVariable("id") Client client,
			HttpSession session, Model model){
		model.addAttribute(UserService.getAllSto());
		return "client.listorder";
	};
}
