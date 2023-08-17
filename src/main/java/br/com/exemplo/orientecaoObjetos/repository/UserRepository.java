package br.com.exemplo.orientecaoObjetos.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import br.com.exemplo.orientecaoObjetos.model.User;

@Repository
public interface UserRepository extends JpaRepository<User , Long> {

	
	User findByEmail(String email);
}
