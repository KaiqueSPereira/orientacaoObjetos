package br.com.exemplo.orientecaoObjetos;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import br.com.exemplo.orientecaoObjetos.model.Role;
import br.com.exemplo.orientecaoObjetos.repository.RoleRepository;
import br.com.exemplo.orientecaoObjetos.service.UserService;

	@SpringBootApplication
	public class OrientecaoObjetosApplication{
			public static void main(String[] args) {
				SpringApplication.run(OrientecaoObjetosApplication.class, args);
				
				// Utilizamos o construtor para criar nossos objetos
				
				  //User user = new User();
				 // User user2 = new User("rogerio");
				 // User user3 = new User("rogerio", "Caetano");
				   
				}
				
				// Rotina que será executada no momento do start da aplicação!
				
				@Bean
				CommandLineRunner run(UserService userService, RoleRepository roleRepository) {
					return args -> {
						
					if(roleRepository.findAll().size()  == 0) {
						
						userService.saveRole(new Role("ROLE_USER"));
						userService.saveRole(new Role("ROLE_ADMIN"));
						userService.saveRole(new Role("ROLE_INSTRUCTOR"));
						userService.saveRole(new Role("ROLE_STUDENT"));
						
					}
						
						
					};
				}

			}

