package com.bancodio.application;

import java.util.ArrayList;
import java.util.List;

import com.bancodio.entities.Banco;
import com.bancodio.entities.Conta;
import com.bancodio.entities.ContaCorrente;
import com.bancodio.entities.ContaPoupanca;
import com.bancodio.entities.PessoaFisica;

public class Main {

	public static void main(String[] args) {
		
		// Teste 01 - pessoa fisica - fev, 23 de 2022 - início 
		
		PessoaFisica pessoa = new PessoaFisica("Fernando Luiz","R. Teste Dev,123","08080-030","(11)98365-2377",10.0000);
		
		pessoa.setCpf("222.222.222-22");
		pessoa.setRg("22.222.222-2");
		
		Conta contaCorrente = new ContaCorrente(pessoa);		
		contaCorrente.depositar(100.00);	
		contaCorrente.imprimirExtrato();	

		Conta contaPoupanca = new ContaPoupanca(pessoa);
		contaPoupanca.depositar(100.00);
		contaPoupanca.imprimirExtrato();
		
		contaCorrente.transferir(100, contaPoupanca);
		
		
		contaCorrente.imprimirExtrato();
		contaPoupanca.imprimirExtrato();
	   
		// Teste 01 - pessoa fisica - fev, 23 de 2022 - fim
		
		// Teste 02 - Banco - fev, 23 de 2022 - início 
		
		Banco banco = new Banco();
		
//		List<Conta> listaContasCliente = new ArrayList();
//		
//		listaContasCliente.add(contaCorrente);
//		listaContasCliente.add(contaPoupanca);
		
		banco.setNome("DevBank");
		banco.setConta(contaCorrente);
		banco.setConta(contaPoupanca);
		System.out.println(banco);

	}
}
