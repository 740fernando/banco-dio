package com.bancodio.entities;


public class PessoaJuridica extends Pessoa {

	private Long cnpj;
	
	public PessoaJuridica(String nome, String endereço, String cep, String telefone, Double renda_pessoa) {
		super(nome, endereço, cep, telefone, renda_pessoa);
	}
}
