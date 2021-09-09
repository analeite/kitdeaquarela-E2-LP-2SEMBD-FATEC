package br.com.fatec.itens;

public class Pinceis {
	
	//Atributos da Classe Tintas
	
	public String nome;
	public String marca;
	public String material;
	public String quantidade;
	public String preco;
	
	//Método Construtor	
	public Pinceis(String nome) {
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

	public String getMarca() {
		return marca;
	}

	public void setMarca(String marca) {
		this.marca = marca;
	}

	public String getMaterial() {
		return material;
	}

	public void setMaterial(String material) {
		this.material = material;
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
	
	//Método de identificação de kit de pincéis
	public void quantidadePinceis() {
		int quantidadeConvertida = Integer.parseInt(quantidade);
		if(quantidadeConvertida >= 2) {
			System.out.println("Esse produto é um kit com " + quantidade + " pincéis.");
		} else {
			System.out.println("Esse kit possui apenas um pincél.");
		}
	}
}

