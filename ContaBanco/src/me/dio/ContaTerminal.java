package me.dio;

import java.util.InputMismatchException;
import java.util.Scanner;

public class ContaTerminal {
	
	
	
	
	public static void main(String[] args) {
		Conta conta = new Conta();
		Scanner scanner = new Scanner(System.in);
		try {
			System.out.println("Digite seu Nome: ");
			conta.setNomeCliente(scanner.next());
			System.out.println("Digite o Número da Agência:");
			conta.setAgencia(scanner.next());
			System.out.println("Digite o Numero da Conta:");
			conta.setNumero(scanner.nextInt());
			System.out.println("Digite o valor do Saldo:");
			double saldo = scanner.nextDouble();
			conta.setSaldo(saldo);
		}catch (InputMismatchException e) {
			System.out.println("Valor Inválido");
		}
		
		
		
		System.out.println("Olá, cliente " + conta.getNomeCliente() + " obrigado por criar a conta em nosso Banco. "
				+ "Sua agência é " + conta.getAgencia() + ", Conta Nº " + conta.getNumero() + " e seu Saldo R$ " +
				String.format( "%.2f", conta.getSaldo()) + " já está disponível para Saque!");
		scanner.close();
	}

}
