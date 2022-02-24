package com.bancodio.entities;

import lombok.Getter;

@Getter
public abstract class Pessoa {
	
	private String nome;
	private String endere�o;
	private String cep;
	private String telefone;
	private Double renda_pessoa;
	
	public Pessoa(String nome, String endere�o, String cep, String telefone, Double renda_pessoa) {
		
		this.nome = nome;
		this.endere�o = endere�o;
		this.cep = cep;
		this.telefone = telefone;
		this.renda_pessoa = renda_pessoa;
	}
	
	

}
