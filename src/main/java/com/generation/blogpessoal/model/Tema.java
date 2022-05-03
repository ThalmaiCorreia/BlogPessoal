package com.generation.blogpessoal.model;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Size;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@Entity    //Create Table
@Table(name = "tb_tema")      //Nomeando a tabela
public class Tema {

	
	@Id     // Primary Key
	@GeneratedValue(strategy = GenerationType.IDENTITY)     //Auto incremento
	private Long id;
	
	@NotBlank(message = "O atributo descrição é obrigatório e não pode utilizar espaços em branco!")  
	@Size(min = 5, max = 100, message = "O atributo deve conter no mínimo 5 caracteres e no máximo 100 caracteres.")
	private String descricao;
	
	@OneToMany(mappedBy = "tema", cascade = CascadeType.REMOVE)
	@JsonIgnoreProperties("tema")
	private List<Postagem> postagem;

	public List<Postagem> getPostagem() {
		return postagem;
	}

	public void setPostagem(List<Postagem> postagem) {
		this.postagem = postagem;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getDescricao() {
		return descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}
	
}
