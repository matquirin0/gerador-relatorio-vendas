package application;

import java.util.Scanner;

import services.LeitorVenda;

public class Program {

	public static void main(String[] args) {

		try ( Scanner sc = new Scanner(System.in)){
			
		// Selecionando o arquivo
		System.out.println("Digite o caminho do arquivo: ");
		String arquivo = sc.nextLine();
		
		LeitorVenda leitorVenda = new LeitorVenda();
		leitorVenda.LeitorDeArquivo(arquivo);
		System.out.println(leitorVenda.getVendas().toString());
		}
	}
}
