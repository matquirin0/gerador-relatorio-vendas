package application;

import java.util.List;
import java.util.Scanner;

import entities.Venda;
import services.AnalisadorVenda;
import services.LeitorVenda;

public class Program {

	public static void main(String[] args) {

		LeitorVenda leitor = new LeitorVenda();
		
		AnalisadorVenda analisador = new AnalisadorVenda();
		
		try ( Scanner sc = new Scanner(System.in)){
			
		// Selecionando o arquivo
		System.out.println("Digite o caminho do arquivo: ");
		String arquivo = sc.nextLine();
		
		leitor.LeitorDeArquivo(arquivo);
		System.out.println(leitor.getVendas().toString());
		}
		
		List<Venda> vendas = leitor.getVendas();
		
		double faturamento = analisador.calcularFaturamentoTotal(vendas);
		
		System.out.println("Faturamento: " + faturamento);
	
	}
}
