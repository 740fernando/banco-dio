package com.bancodio.entities;

import lombok.Getter;
import lombok.Setter;


public class PessoaFisica extends Pessoa {

	@Setter
	private String cpf;
	
	@Setter
	private String rg;
	
	
	public PessoaFisica(String nome, String endereço, String cep, String telefone, Double renda_pessoa) {
		super(nome, endereço, cep, telefone, renda_pessoa);
	}

}
