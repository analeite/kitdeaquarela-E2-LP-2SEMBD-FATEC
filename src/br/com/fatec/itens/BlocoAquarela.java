package br.com.fatec.itens;

public class BlocoAquarela {

	public String nome;
	public String marca;
	public String gramatura;
	public String quantidadeFolhas;
	public String preco;
	
	// Método Construtor
	public BlocoAquarela(String nome) {
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
	public String getGramatura() {
		return gramatura;
	}
	public void setGramatura(String gramatura) {
		this.gramatura = gramatura;
	}
	public String getQuantidadeFolhas() {
		return quantidadeFolhas;
	}
	public void setQuantidadeFolhas(String quantidadeFolhas) {
		this.quantidadeFolhas = quantidadeFolhas;
	}
	public String getPreco() {
		return preco;
	}
	public void setPreco(String preco) {
		this.preco = preco;
	}

	//Método de identificação se o bloco é adequado para aquarela
	public void gramaturaBloco() {
		int gramaturaConvertida = Integer.parseInt(gramatura);
		if(gramaturaConvertida >= 200) {
			System.out.println("Esse bloco possui a gramatura " + gramatura + ", que é adequado para aquarela.");
		} else {
			System.out.println("Esse bloco possui a gramatura " + gramatura + ", que NÃO é adequada para aquarela.");
		}
	}
	
}
