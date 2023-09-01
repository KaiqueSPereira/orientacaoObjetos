 package br.com.exemplo.orientecaoObjetos.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import br.com.exemplo.orientecaoObjetos.model.User;
import br.com.exemplo.orientecaoObjetos.repository.UserRepository;
import br.com.exemplo.orientecaoObjetos.wed.dto.UserDto;


@Service
public class UserServiceImpl implements UserService {
	
	
	@Autowired
	private UserRepository userRepository;

	@Override
	public User findByEmail(String email) {
		
		return null;
	}

	@Override
	public User save(UserDto userDto) {
		
		User user = new User(userDto.getFirstName(), userDto.getLastName(), userDto.getEmail(), userDto.getPassword());
		
		
		return userRepository.save(user);
	}

	@Override
	public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
		// TODO Auto-generated method stub
		return null;
	}

}
