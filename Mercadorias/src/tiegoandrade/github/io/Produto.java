package tiegoandrade.github.io;

import java.text.NumberFormat;
import java.util.Locale;

/* 
 * Por essa classe implementar a interface Comparable, 
 * os objetos dela podem ser ordenados. 
 */
public class Produto implements Comparable<Produto> {
	
	// Formata o valor para do produto para a moeda brasileira.
	private static NumberFormat nf = NumberFormat.getCurrencyInstance(new Locale("pt", "BR"));
	
	// Atributo que representa o nome do produto.
	private String nome;
	
	// Atributo que representa o valor do produto.
	private double valor;
	
	// Construtor que recebe um nome e um valor de um produto.
	public Produto (String nome, double valor) {
		this.nome = nome;
		this.valor = valor;
	}
	
	// Método que acessa o nome do produto.
	public String getNome() {
		return nome;
	}
	
	// Método que acessa o valor do produto.
	public Double getValor() {
		return valor;
	}
	
	// Método que ordena os produtos por ordem crescente de valor.
	public int compareTo(Produto p) {
		
		// Converte um tipo primitivo double em uma objeto da Classe Double. 
		Double valor1 = Double.valueOf(this.valor);
		Double valor2 = Double.valueOf(p.valor);
		
		// Método da classe Double que compara dois valores double.
		return valor1.compareTo(valor2);
	}
	
	// Método que sobrescreve o método "toString"
	public String toString() {
		return String.format("%-10s %7s", nome, nf.format(valor));
	}
	
	/* 
	 * Os métodos HashCode e equals definem quais elementos são iguais ou diferentes.
	 * Os produtos serão iguais se possuirem o mesmo nome. 
	 */
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((nome == null) ? 0 : nome.hashCode());
		return result;
	}
	
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Produto other = (Produto) obj;
		if (nome == null) {
			if (other.nome != null)
				return false;
		} else if (!nome.equals(other.nome))
			return false;
		return true;
	}
}
	

