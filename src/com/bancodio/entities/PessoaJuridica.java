package com.bancodio.entities;

import lombok.Data;

@Data
public class PessoaJuridica extends Pessoa {

	private String cnpj;
	
	public PessoaJuridica(String nome, String endere�o, String cep, String telefone, Double renda_pessoa) {
		super(nome, endere�o, cep, telefone, renda_pessoa);
	}
}
