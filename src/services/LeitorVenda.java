package services;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import entities.Venda;

public class LeitorVenda {
	
	private String arquivo;
	
	private List<Venda> vendas = new ArrayList<>();
	
	
	//Getters
	
	public List<Venda> getVendas() {
		return vendas;
	}
	
	public String getArquivo() {
		return arquivo;
	}
	
	//Setters

	public void setArquivo(String arquivo) {
		this.arquivo = arquivo;
	}

	//Construtor padrão
	
	public LeitorVenda() {
		
	}
	
	//Método para ler o arquivo e inserir em uma lista
	
	public void LeitorDeArquivo(String arquivo) {

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
	}
}
                                                                                                                                                                     