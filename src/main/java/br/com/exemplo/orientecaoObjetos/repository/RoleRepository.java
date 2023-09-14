package br.com.exemplo.orientecaoObjetos.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import br.com.exemplo.orientecaoObjetos.model.Role;

@Repository
public interface RoleRepository extends JpaRepository<Role, Long>{
	
	Role findByName(String nameRole);

}