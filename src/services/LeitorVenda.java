package services;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import entities.Venda;

public class LeitorVenda {
	
	private List<Venda> vendas = new ArrayList<>();

	public LeitorVenda() {

		Scanner sc = new Scanner(System.in);

		// Selecionando o arquivo
		System.out.println("Digite o caminho do arquivo: ");
		String arquivo = sc.nextLine();

		// Lendo o arquivo
		try (BufferedReader br = new BufferedReader(new FileReader(arquivo))) {
			
			String linha = br.readLine();
			
			while (linha != null) {
				
				String tabela [] = linha.split(",");
				
				Long id = Long.parseLong(tabela[0].trim());
				String nome = tabela[1].trim();
				String categoria = tabela[2].trim();
				Double precoUnitario = Double.parseDouble(tabela[3].trim());
				Integer quantidade = Integer.parseInt(tabela[4].trim());
				
				vendas.add(new Venda(id, nome, categoria, precoUnitario, quantidade));
				
				linha = br.readLine();
			}
		} catch (IOException e) {
			System.out.println("Erro ao ler o arquivo: " + e.getMessage());
		}
		sc.close();
	}
}
                                                                                                                                                                     