package br.com.exemplo.orientecaoObjetos.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import br.com.exemplo.orientecaoObjetos.model.Endereco;

@Repository
public interface EnderecoRepository extends JpaRepository<Endereco, Long> {
   
}