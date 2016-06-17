package tiegoandrade.github.io;

import java.util.Collection;

public class Produtos {
	
	// Cole��o de produtos.
	public Collection<Produto> produtos;
	
	// Construtor que recebe uma cole��o.
	public Produtos(Collection<Produto> produtos) {
		this.produtos = produtos;
	}
	
	/* 
	 * Muda o tipo de cole��o dos produtos adicionados.
	 * Fornece uma cole��o vazia e os produtos da cole��o antiga
	 * s�o copiados para a nova. 
	 */
	public void mudarColecao(Collection<Produto> produtos) {
		Collection<Produto> temp = this.produtos;
		this.produtos = produtos;
		
		// Adiciona todos os elementos de uma cole��o em outra.
		this.produtos.addAll(temp);
	}
	
	// M�todo que adiciona um produto � cole��o.
	public void adicionar(Produto produto) {
		produtos.add(produto);
	}
	
	// Imprime os produtos da cole��o.
	public void imprimirProdutos() {
		
		// Mostra o nome da classe da cole��o onde os produtos est�o armazenados.
		System.out.println("Produtos armazenados em: " + produtos.getClass().getName());
		for (Produto p : produtos) {
			System.out.println(p);
		}
		System.out.println("---------------------------------------------------");
	}
}
