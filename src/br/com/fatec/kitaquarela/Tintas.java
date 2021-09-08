package br.com.fatec.kitaquarela;

public class Tintas {

	//Atributos da Classe Tintas
	
	public String nome;
	public String marca;
	public String tipo;
	public String quantidade;
	public int preco;
	
	//Getters e Setters
	public String getNome() {
		return nome;
	}
	
	public void setNome(String nome) {
		this.nome = nome;
	}
	
	public String getMarca() {
		return marca;
	}
	
	public void setMarca(String marca) {
		this.marca = marca;
	}
	
	public String getTipo() {
		return tipo;
	}
	
	public void setTipo(String tipo) {
		this.tipo = tipo;
	}
	
	public String getQuantidade() {
		return quantidade;
	}
	
	public void setQuantidade(String quantidade) {
		this.quantidade = quantidade;
	}
	
	public int getPreco() {
		return preco;
	}
	
	public void setPreco(int preco) {
		this.preco = preco;
	}

	
	//Método de Classificação da Tinta
	public void classificacaoTinta() {
		if (preco >= 120) {
			System.out.println("A tinta "+ nome + " é semi-profissional.");
		} if(preco >= 200) {
			System.out.println("A tinta "+ nome + " é profissional.");
		} else {
			System.out.println("A tinta "+ nome + " é para estudantes.");
		}
	}
	
}
