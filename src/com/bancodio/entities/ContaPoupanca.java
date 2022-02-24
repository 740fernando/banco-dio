package com.bancodio.entities;

public class ContaPoupanca extends Conta {
	
	public ContaPoupanca(Pessoa pessoa) {
		super(pessoa);
	}

	@Override
	public void imprimirExtrato() {
		System.out.println("--- Extrato Conta Poupança ---");
		super.imprimirInfosComuns();
	}
}
