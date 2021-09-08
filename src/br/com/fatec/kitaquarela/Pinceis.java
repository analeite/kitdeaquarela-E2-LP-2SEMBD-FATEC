package br.com.fatec.kitaquarela;

public class Pinceis {
	
	//Atributos da Classe Tintas
	
	public String nome;
	public String marca;
	public String material;
	public int quantidade;
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

	public String getMaterial() {
		return material;
	}

	public void setMaterial(String material) {
		this.material = material;
	}

	public int getQuantidade() {
		return quantidade;
	}

	public void setQuantidade(int quantidade) {
		this.quantidade = quantidade;
	}

	public int getPreco() {
		return preco;
	}

	public void setPreco(int preco) {
		this.preco = preco;
	}	
	
	//Método de identificação de kit de pincéis
	public void classificacaoTinta() {
		if(quantidade >= 2) {
			System.out.println("Esse produto é um kit com " + quantidade + " pincéis.");
		} else {
			System.out.println("Esse kit possui apenas um pincél.");
		}
	}
}

