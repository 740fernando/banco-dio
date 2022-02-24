package com.bancodio.entities;

import java.util.Date;

import lombok.Getter;

public abstract class Conta {

	private static final int AGENCIA_PADRAO = 1;
	private static int SEQUENCIAL = 1;
	
	
	@Getter
	protected int agencia;
	
	@Getter
	protected int numero;
	
	@Getter
	protected Date dtAbertura;
	
	@Getter
	protected Date dtEncerramento;
	
	protected double saldo;
	
	@Getter
	protected Pessoa pessoa;

	public Conta(Pessoa pessoa) {
		this.numero = SEQUENCIAL++;
		this.agencia = Conta.AGENCIA_PADRAO;
		this.pessoa = pessoa;
	}

	public Pessoa getPessoa() {
		return pessoa;
	}

	public void sacar(Double valor) {
		saldo -= valor;
	}

	public void depositar(double valor) {
		saldo += valor;
	}

	public void transferir(double valor, Conta contaDestino) {
		this.sacar(valor);
		contaDestino.depositar(valor);
	}
	protected void imprimirInfosComuns() {
		System.out.println(String.format("Titular : %s ", this.pessoa.getNome()));
		System.out.println(String.format("Agencia : %d", this.agencia));
		System.out.println(String.format("Número: %d", this.numero));
		System.out.println(String.format("Saldo : %.2f", this.saldo));
	}
	public void imprimirExtrato() {
		imprimirInfosComuns();
	}
}
