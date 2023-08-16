package br.com.exemplo.orientecaoObjetos.model;

import java.util.Collection;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.Table;
import javax.persistence.UniqueConstraint;

@Entity
@Table(name="users", uniqueConstraints = @UniqueConstraint(columnNames ="email"))
public class User {

	//private : Acesso dentro da propria classe
	//public : Acesso livre á todas as classes 
	//protected : Acesso liberado dentro para classes filhas (Herança)
	
	//GenrationType.AUTO
	//valor padrão (deixa para o desenvolvedor escolher a estratégia mais adequada)
	//GenerationTyape.SEQUENCE
	//Informamos ao provedor a sequncia a ser seguida, caso não o provedor escolhera a sequencia
	//GenerationType.TABLE
	@Id // PK 
	@GeneratedValue(strategy = GenerationType.IDENTITY) //Auto-Incremento
	private Long id;
	private String firstname;
	private String lastname;
	private String email;
	private String password;
	
	@ManyToMany(fetch = FetchType.EAGER, cascade = CascadeType.ALL)
	@JoinTable(
			name="users_roles",
			joinColumns = @JoinColumn(name="user_id",referencedColumnName = "id"),
			inverseJoinColumns = @JoinColumn(name="role_id", referencedColumnName = "id"))
			private Collection<Role> roles;	
	//Construtor padrão: Não possui parâmetros
	
	public User() {
		
	}
	
	
	public User(String firstname, String lastname) {
		
		this.firstname = firstname;
		this.lastname = lastname;
	}


	public void setId(Long id) {
		this.id = id;
	}
	public Long getId() {
		return id;
	}
	public String getFirstname() {
		return firstname;
	}
	public void setFirstname(String firstname) {
		this.firstname = firstname;
	}
	public String getLastname() {
		return lastname;
	}
	public void setLastname(String lastname) {
		this.lastname = lastname;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	
	
	
}
