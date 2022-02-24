package com.bancodio.entities;

import lombok.Data;

@Data
public class PessoaJuridica extends Pessoa {

	private String cnpj;
	
	public PessoaJuridica(String nome, String endereço, String cep, String telefone, Double renda_pessoa) {
		super(nome, endereço, cep, telefone, renda_pessoa);
	}
}
