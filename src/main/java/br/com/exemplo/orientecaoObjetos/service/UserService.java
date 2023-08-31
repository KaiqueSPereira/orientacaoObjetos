package br.com.exemplo.orientecaoObjetos.service;

import br.com.exemplo.orientecaoObjetos.model.User;
import br.com.exemplo.orientecaoObjetos.wed.dto.UserDto;

public interface UserService {

	User save(UserDto userDto);
	User findByEmail(String email);
}
