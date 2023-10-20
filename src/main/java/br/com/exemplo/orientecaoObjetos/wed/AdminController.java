package br.com.exemplo.orientecaoObjetos.wed;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import br.com.exemplo.orientecaoObjetos.model.User;
import br.com.exemplo.orientecaoObjetos.service.UserService;

@Controller
//@RequestMapping("/user/admin") (nome-do-projeto / model do papel manipulado)
@RequestMapping("/admin")

public class AdminController {
	
	@Autowired
	private UserService userService;
	
	@GetMapping("/home")
	public String homeAdimin (Model model) {
		
		String home = "index-admin";
		User user = userService.getAuthenticatedUser();
		String username = user.getEmail();
		model.addAttribute("username", username);
		return home;
		
	}

}
