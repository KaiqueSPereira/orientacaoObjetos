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
@RequestMapping("/instructor")

public class InstructorController {
	
	@Autowired
	private UserService userService;
	
	@GetMapping("/home")
	public String homeInstructor (Model model) {
		
		String home = "index-professor";
		User user = userService.getAuthenticatedUser();
		String username = user.getEmail();
		model.addAttribute("username", username);
		return home;
		
	}

}
