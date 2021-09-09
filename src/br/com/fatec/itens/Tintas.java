package br.com.fatec.itens;

public class Tintas {

	//Atributos da Classe Tintas
	
	public String nome;
	public String marca;
	public String tipo;
	public String quantidade;
	public String preco;
	
	//Método Construtor
	public Tintas(String nome) {
		super();
		this.nome = nome;
	}

	//Getters e Setters
	public String getNome() {
		return nome;
	}
	
	public void setNome(String nome) {
		this.nome = nome;
	}
//	
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
	
	public String getPreco() {
		return preco;
	}
	
	public void setPreco(String preco) {
		this.preco = preco;
	}

	
	//Método de Classificação da Tinta
	public void classificacaoTinta() {
		int precoConvertido = Integer.parseInt(preco);
		if (precoConvertido >= 120) {
			System.out.println("A tinta "+ nome + " é semi-profissional.");
		} else if(precoConvertido >= 270) {
			System.out.println("A tinta "+ nome + " é profissional.");
		} else if(precoConvertido <= 100) {
			System.out.println("A tinta "+ nome + " é para estudantes/iniciantes.");
		}
	}
	
}
