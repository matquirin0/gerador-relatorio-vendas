package services;

import java.util.List;

import entities.Venda;

public class AnalisadorVenda {

	List<Venda> vendas;

	public AnalisadorVenda() {

	}

	public double calcularFaturamentoTotal(List<Venda> vendas) {
		double totalFaturamento = 0.0;
		for (Venda v : vendas) {
			totalFaturamento += v.getPrecoUnitario() * v.getQuantidade();
		}
		return totalFaturamento;
	}
}
