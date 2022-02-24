package com.bancodio.entities;

import java.util.List;

import lombok.Data;

@Data
public class Banco {

	private String nome;
	private Conta conta;
	@Override
	public String toString() {
		return "Banco [nome=" + nome + ", Agencia =" + conta.getAgencia() + 
				", Numero ="+ conta.getNumero()+
				", Titular ="+ conta.getPessoa().getNome()+"]";
	}
	
	

}
