package tiegoandrade.github.io;

import java.util.Collection;

public class Produtos {
	
	// Coleção de produtos.
	public Collection<Produto> produtos;
	
	// Construtor que recebe uma coleção.
	public Produtos(Collection<Produto> produtos) {
		this.produtos = produtos;
	}
	
	/* 
	 * Muda o tipo de coleção dos produtos adicionados.
	 * Fornece uma coleção vazia e os produtos da coleção antiga
	 * são copiados para a nova. 
	 */
	public void mudarColecao(Collection<Produto> produtos) {
		Collection<Produto> temp = this.produtos;
		this.produtos = produtos;
		
		// Adiciona todos os elementos de uma coleção em outra.
		this.produtos.addAll(temp);
	}
	
	// Método que adiciona um produto à coleção.
	public void adicionar(Produto produto) {
		produtos.add(produto);
	}
	
	// Imprime os produtos da coleção.
	public void imprimirProdutos() {
		
		// Mostra o nome da classe da coleção onde os produtos estão armazenados.
		System.out.println("Produtos armazenados em: " + produtos.getClass().getName());
		for (Produto p : produtos) {
			System.out.println(p);
		}
		System.out.println("---------------------------------------------------");
	}
}
