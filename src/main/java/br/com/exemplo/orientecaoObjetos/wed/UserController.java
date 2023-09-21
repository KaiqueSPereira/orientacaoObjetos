package br.com.exemplo.orientecaoObjetos.wed;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import br.com.exemplo.orientecaoObjetos.model.User;
import br.com.exemplo.orientecaoObjetos.service.UserService;

@Controller
public class UserController {
	
	@Autowired
	private UserService userService;
	
	@GetMapping("/login")
	public String login() {
		return "login";
	}
	@GetMapping("/users/home")
	public String homeUser(Model model) {
		
		String home = "index";
		User user = userService.getAuthenticatedUser();
		String username = user.getEmail();
		model.addAttribute("username",username);
		
		return "home";
	}
}

