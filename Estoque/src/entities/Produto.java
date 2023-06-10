package entities;

public class Produto {

	private String descricao;
	private int qtd;
	private double preco;
	private double valorEstoque;

	public String getDescricao() {
		return descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}

	public int getQtd() {
		return qtd;
	}

	public void setQtd(int qtd) {
		this.qtd = qtd;
	}

	public double getPreco() {
		return preco;
	}

	public void setPreco(double preco) {
		this.preco = preco;
	}

	public double getValorEstoque() {
		return valorEstoque;
	}

	public void setValorEstoque(double valorEstoque) {
		this.valorEstoque = valorEstoque;
	}

	public void pularLinha() {
		System.out.println();
	}

	public void inserirProduto() {
		valorEstoque = qtd * preco;
		System.out.println("Produto adicionado com sucesso.");
	}

	public void retirarProduto(double valor) {
		valor = preco * qtd;
		valorEstoque = valorEstoque - valor;
		System.out.println("Produto retirado com sucesso.");
	}

	@Override
	public String toString() {
		return "Produto [descricao=" + descricao + ", qtd=" + qtd + ", preco=" + preco + ", valorEstoque="
				+ valorEstoque + "]";
	}

}
