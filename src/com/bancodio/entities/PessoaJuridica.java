package com.bancodio.entities;


public class PessoaJuridica extends Pessoa {

	private Long cnpj;
	
	public PessoaJuridica(String nome, String endere�o, String cep, String telefone, Double renda_pessoa) {
		super(nome, endere�o, cep, telefone, renda_pessoa);
	}
}
