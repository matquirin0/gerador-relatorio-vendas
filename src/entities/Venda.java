package entities;

public class Venda {

	private Long id;
	private String nomeProduto;
	private String categoria;
	private Double precoUnitario;
	private Integer quantidade;
	
	public Venda () {
		
	}

	public Venda(Long id, String nomeProduto, String categoria, Double precoUnitario, Integer quantidade) {
		super();
		this.id = id;
		this.nomeProduto = nomeProduto;
		this.categoria = categoria;
		this.precoUnitario = precoUnitario;
		this.quantidade = quantidade;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getNomeProduto() {
		return nomeProduto;
	}

	public void setNomeProduto(String nomeProduto) {
		this.nomeProduto = nomeProduto;
	}
	
	public String getCategoria() {
		return categoria;
	}

	public void setCategoria(String categoria) {
		this.categoria = categoria;
	}

	public double getPrecoUnitario() {
		return precoUnitario;
	}

	public void setPrecoUnitario(Double precoUnitario) {
		this.precoUnitario = precoUnitario;
	}

	public int getQuantidade() {
		return quantidade;
	}

	public void setQuantidade(Integer quantidade) {
		this.quantidade = quantidade;
	}
	
	
	
}
