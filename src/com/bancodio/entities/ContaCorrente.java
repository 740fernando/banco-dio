package com.bancodio.entities;

public class ContaCorrente extends Conta {

	public ContaCorrente(Pessoa pessoa) {
		super(pessoa);
	}

	@Override
	public void imprimirExtrato() {
		System.out.println("--- Extrato Conta Corrente ---");
		super.imprimirInfosComuns();
	}
}
