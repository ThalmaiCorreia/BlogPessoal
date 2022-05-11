package com.generation.lojadegames.model;

import java.math.BigDecimal;
import java.time.LocalDate;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

@Entity
@Table(name = "tb_produtos")
public class Produto {
	

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	
	@NotBlank(message = "O atributo nome é obrigatório e não pode utilizar espaços em branco!")
	@Size(min = 5, max = 15, message = "O atributo nome deve conter no mínimo 5 caracteres e no máximo 15 caracteres!")
	private String nome;
	
	@NotNull(message = "O atributo nome é obrigatório!")
	@Size(min = 10, max = 50, message = "O atributo nome deve conter no mínimo 5 caracteres e no máximo 15 caracteres!")
	private String descricao;
	
	@NotBlank(message = "O atributo nome é obrigatório e não pode utilizar espaços em branco!")
	@Size(min = 5, max = 10, message = "O atributo nome deve conter no mínimo 5 caracteres e no máximo 10 caracteres!")
	private String console;
	
	private int quantidade;
		
	private LocalDate dataLancamento;
	
	private BigDecimal preco;
	
	private String foto;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getDescricao() {
		return descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}

	public String getConsole() {
		return console;
	}

	public void setConsole(String console) {
		this.console = console;
	}

	public int getQuantidade() {
		return quantidade;
	}

	public void setQuantidade(int quantidade) {
		this.quantidade = quantidade;
	}

	public LocalDate getDataLancamento() {
		return dataLancamento;
	}

	public void setDataLancamento(LocalDate dataLancamento) {
		this.dataLancamento = dataLancamento;
	}

	public BigDecimal getPreco() {
		return preco;
	}

	public void setPreco(BigDecimal preco) {
		this.preco = preco;
	}

	public String getFoto() {
		return foto;
	}

	public void setFoto(String foto) {
		this.foto = foto;
	}
	
	

}
