package br.com.fatec.kitaquarela;

public class BlocoAquarela {

	public String nome;
	public String marca;
	public int gramatura;
	public int quantidadeFolhas;
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
	public int getGramatura() {
		return gramatura;
	}
	public void setGramatura(int gramatura) {
		this.gramatura = gramatura;
	}
	public int getQuantidadeFolhas() {
		return quantidadeFolhas;
	}
	public void setQuantidadeFolhas(int quantidadeFolhas) {
		this.quantidadeFolhas = quantidadeFolhas;
	}
	public int getPreco() {
		return preco;
	}
	public void setPreco(int preco) {
		this.preco = preco;
	}

	//M�todo de identifica��o se o bloco � adequado para aquarela
	public void gramaturaBloco() {
		if(gramatura >= 200) {
			System.out.println("Esse bloco possui a gramatura " + gramatura + ", que � adequado para aquarela.");
		} else {
			System.out.println("Esse bloco possui a gramatura " + gramatura + ", que N�O � adequada para aquarela.");
		}
	}
	
}
