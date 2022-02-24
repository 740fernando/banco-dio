package com.bancodio.application;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import com.bancodio.entities.Banco;
import com.bancodio.entities.Conta;
import com.bancodio.entities.ContaCorrente;
import com.bancodio.entities.ContaPoupanca;
import com.bancodio.entities.PessoaFisica;
import com.bancodio.entities.PessoaJuridica;

public class Main {

	public static void main(String[] args) {

		// Teste 01 - pessoa fisica - fev, 23 de 2022 - início
		System.out.println("Pessoa Fisica - Inicio ");
		PessoaFisica fisica = new PessoaFisica("Fernando Luiz", "R. Teste Dev,123", "08080-030", "(11)98365-2377",
				10.0000);

		fisica.setCpf("222.222.222-22");
		fisica.setRg("22.222.222-2");

		Conta contaCorrenteFisica = new ContaCorrente(fisica);
		contaCorrenteFisica.depositar(100.00);
		contaCorrenteFisica.imprimirExtrato();

		Conta contaPoupancaFisica = new ContaPoupanca(fisica);
		contaPoupancaFisica.depositar(100.00);
		contaPoupancaFisica.imprimirExtrato();

		contaCorrenteFisica.transferir(100, contaPoupancaFisica);

		contaCorrenteFisica.imprimirExtrato();
		contaPoupancaFisica.imprimirExtrato();

		System.out.println("Pessoa Fisica - Fim ");

		// Teste 01 - pessoa fisica - fev, 23 de 2022 - fim
		System.out.println("----------------------------------------------------------------");
		// Teste 02 - pessoa juridica - fev, 23 de 2022 - inicio

		System.out.println("Pessoa Jurídica -Inicio ");

		PessoaJuridica juridica = new PessoaJuridica("Fernando Luiz", "R. Teste Dev,123", "08080-030", "(11)98365-2377",
				10.0000);

		juridica.setCnpj("45.036.614/0001-61");

		Conta contaCorrenteJuridica = new ContaCorrente(juridica);
		contaCorrenteJuridica.depositar(100.00);
		contaCorrenteJuridica.imprimirExtrato();

		Conta contaPoupancaJuridica = new ContaPoupanca(juridica);
		contaPoupancaJuridica.depositar(100.00);
		contaPoupancaJuridica.imprimirExtrato();

		contaCorrenteJuridica.transferir(100, contaPoupancaFisica);

		contaCorrenteJuridica.imprimirExtrato();
		contaPoupancaJuridica.imprimirExtrato();

		System.out.println("Pessoa Jurídica -Fim ");

		// Teste 02 - pessoa juridica - fev, 23 de 2022 - fim
		System.out.println("----------------------------------------------------------------");
		// Teste 03 - Banco - fev, 23 de 2022 - início

		System.out.println("Banco -Inicio ");

		Banco banco = new Banco();

		List<Conta> listaContasCliente = new ArrayList();
		listaContasCliente.add(contaCorrenteFisica);
		listaContasCliente.add(contaPoupancaFisica);
		listaContasCliente.add(contaCorrenteJuridica);
		listaContasCliente.add(contaPoupancaJuridica);

		banco.setNome("DevBank");
		banco.setContas(listaContasCliente);
		System.out.println("Nome do banco : " + banco.getNome());
		for (Conta conta : banco.getContas()) {
			System.out.println(conta.getAgencia());
			System.out.println(conta.getNumero());
		}
		
		System.out.println("Banco -Fim ");
		// Teste 03 - Banco - fev, 23 de 2022 - fim
	}
}
