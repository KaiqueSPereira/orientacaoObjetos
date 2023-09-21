package br.com.exemplo.orientecaoObjetos.service;

import org.springframework.security.core.userdetails.UserDetailsService;

import br.com.exemplo.orientecaoObjetos.model.Role;
import br.com.exemplo.orientecaoObjetos.model.User;
import br.com.exemplo.orientecaoObjetos.wed.dto.UserDto;

public interface UserService extends UserDetailsService{
	
	User save(UserDto userDto);
	User findByEmail(String email);
	void addRoleToUser(String username, String roleName);
	Role saveRole(Role role);
	User getAuthenticatedUser();

}