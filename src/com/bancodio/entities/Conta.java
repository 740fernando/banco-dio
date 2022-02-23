package com.bancodio.entities;

import java.util.Date;

public abstract class Conta {

	private static final int AGENCIA_PADRAO = 1;
	private static int SEQUENCIAL = 1;

	protected int agencia;
	protected int numero;
	protected Date dtAbertura;
	protected Date dtEncerramento;
	protected Double saldo;

	public Conta() {
		this.numero = Conta.AGENCIA_PADRAO;
		this.agencia = SEQUENCIAL++;
	}

	public int getAgencia() {
		return agencia;
	}

	public int getNumero() {
		return numero;
	}

	public Date getDtAbertura() {
		return dtAbertura;
	}

	public Date getDtEncerramento() {
		return dtEncerramento;
	}

	public void sacar() {

	}

	public void depositar() {

	}

	public void transferir() {

	}
}
