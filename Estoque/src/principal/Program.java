package principal;

import java.util.Scanner;

import entities.Produto;

public class Program {

	public static void main(String[] args) {

		Produto produto = new Produto();

		Scanner entrada = new Scanner(System.in);

		String opcao;

		do {

			System.out.println("Escolha uma opcão abaixo: ");
			System.out.println("1 - Inserir Produto");
			System.out.println("2 - Vender Produto");
			System.out.println("3 - Exibir Status");
			System.out.println("4 - Sair");
			opcao = entrada.nextLine();

		} while (opcao == "4");

		switch (opcao) {
		case "1":
			System.out.println("Informe a Descrição: ");
			String descricao = entrada.nextLine();
			produto.setDescricao(descricao);

			System.out.println("Informe a quantidade: ");
			int qtd = entrada.nextInt();
			produto.setQtd(qtd);

			System.out.println("Informe o Preço: ");
			double preco = entrada.nextDouble();
			produto.setPreco(preco);

			produto.inserirProduto();
			produto.pularLinha();
			System.out.println(produto);
			break;
		case "2":
			System.out.println("Informe a Descrição: ");
			descricao = entrada.nextLine();
			produto.setDescricao(descricao);

			System.out.println("Informe a quantidade: ");
			qtd = entrada.nextInt();
			produto.setQtd(qtd);

			System.out.println("Informe o Preço: ");
			preco = entrada.nextDouble();
			produto.setPreco(preco);

			produto.retirarProduto(preco);
			produto.pularLinha();
			System.out.println(produto);
			break;
		case "3":
			System.out.println(produto);
			break;
		case "4":
			System.out.println("Você saiu com sucesso!");
			break;
		}
	}

}
