package com.bancodio.entities;

import java.util.Date;

public abstract class Conta {
	
	private int nrConta;
	private Date dtAbertura;
	private Date dtEncerramento;
	private Double saldo;
	

	
	public int getNrConta() {
		return nrConta;
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
