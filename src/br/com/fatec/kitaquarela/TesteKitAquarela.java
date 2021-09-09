package br.com.fatec.kitaquarela;

import javax.swing.JOptionPane;

import br.com.fatec.itens.*;

public class TesteKitAquarela {
	
	public static void main(String[] args) {
		
		//Instancias das classes Tintas, Pinceis e BlocoAquarela
		Tintas tintas = new Tintas("Koi");
		Pinceis pinceis = new Pinceis("Unique");
		BlocoAquarela bloco = new BlocoAquarela("Canson");
		
//		tintas.setNome("Aquarela Htp");
//		tintas.setMarca("Pentel");
//		tintas.setTipo("Bisnaga");
//		tintas.setQuantidade("12 bisnagas");
//		tintas.setPreco("34");
//		tintas.classificacaoTinta();
		
		//Setters da classe Tintas
		Tintas[] novaTinta = new Tintas[3];
		novaTinta[0] = new Tintas("Pentel");
		novaTinta[0].setMarca("Pentel");
		novaTinta[0].setTipo("Bisnaga");
		novaTinta[0].setQuantidade("12");
		novaTinta[0].setPreco("140");
		
		//for que permite o usuário inserir os dados de Tintas
		for (int i = 1; i < 3; i++) {
			novaTinta[i] = new Tintas (JOptionPane.showInputDialog("Digite o nome das tintas "+i));
			novaTinta[i].setMarca(JOptionPane.showInputDialog("Digite a marca das tintas " +i));
			novaTinta[i].setTipo(JOptionPane.showInputDialog("Digite o tipo das tintas " +i));
			novaTinta[i].setQuantidade(JOptionPane.showInputDialog("Digite a quantidade de tinta " +i));
			novaTinta[i].setPreco(JOptionPane.showInputDialog("Digite o preço das tintas " +i));
		}
		
		//for que imprime os dados de Tintas
		for (int i = 1; i < 3; i++) {
			JOptionPane.showMessageDialog(null, "Tinta " + i + ":\n"+
												"Nome das tintas: " +novaTinta[i].getNome()+ ",\n" + 
												"Marca das tintas: " +novaTinta[i].getMarca() + ",\n" +
												"Tipo das tintas: " +novaTinta[i].getTipo() + ",\n" +
												"Quantidade das tintas: " +novaTinta[i].getQuantidade() + ",\n" +
												"Preço das tintas: " +novaTinta[i].getPreco());
			System.out.println("Tinta " + i + ":");
			novaTinta[i].classificacaoTinta();
			System.out.println("-------------------------------------------");
//			System.out.println("Nome das tintas " +novaTinta[i].getNome());
//			JOptionPane.showMessageDialog(null, "Marca das tintas " +novaTinta[i].getMarca());
//			JOptionPane.showMessageDialog(null, "Tipo das tintas " +novaTinta[i].getTipo());
//			JOptionPane.showMessageDialog(null, "Quantidade das tintas " +novaTinta[i].getQuantidade());
//			JOptionPane.showMessageDialog(null, "Preço das tintas " +novaTinta[i].getPreco());
//			JOptionPane.showMessageDialog(null, "-------------------------------------------");
		}
		
		//Setters da classe Pinceis
		Pinceis[] novoPincel = new Pinceis[3];
		novoPincel[0] = new Pinceis("Unique");
		novoPincel[0].setMarca("Unique");
		novoPincel[0].setMaterial("Madeira");
		novoPincel[0].setQuantidade("12");
		novoPincel[0].setPreco("35");
		
		//for que permite o usuário inserir os dados de Pinceis
		for (int i = 1; i < 3; i++) {
			novoPincel[i] = new Pinceis (JOptionPane.showInputDialog("Digite o nome dos pincéis "+i));
			novoPincel[i].setMarca(JOptionPane.showInputDialog("Digite a marca dos pincéis " +i));
			novoPincel[i].setMaterial(JOptionPane.showInputDialog("Digite o tipo de material dos pincéis " +i));
			novoPincel[i].setQuantidade(JOptionPane.showInputDialog("Digite a quantidade dos pincéis " +i));
			novoPincel[i].setPreco(JOptionPane.showInputDialog("Digite o preço dos pincéis " +i));
		}
		
		//for que imprime os dados de Pinceis
		for (int i = 1; i < 3; i++) {
			JOptionPane.showMessageDialog(null, "Pincel " + i + ":\n"+
												"Nome dos pincéis: " +novoPincel[i].getNome()+ ",\n" + 
												"Marca dos pincéis: " +novoPincel[i].getMarca() + ",\n" +
												"Tipo de material dos pincéis: " +novoPincel[i].getMaterial() + ",\n" +
												"Quantidade dos pincéis: " +novoPincel[i].getQuantidade() + ",\n" +
												"Preço dos pincéis: " +novoPincel[i].getPreco());
			System.out.println("Pincél " + i + ":");
			novoPincel[i].quantidadePinceis();
			System.out.println("-------------------------------------------");
		}
		
		//Setters da classe BlocoAquarela
		BlocoAquarela[] novoBloco = new BlocoAquarela[3];
		novoBloco[0] = new BlocoAquarela("Canson");
		novoBloco[0].setMarca("Canson");
		novoBloco[0].setGramatura("300");
		novoBloco[0].setQuantidadeFolhas("20");
		novoBloco[0].setPreco("21");
		
		//for que permite o usuário inserir os dados de BlocoAquarela
		for (int i = 1; i < 3; i++) {
			novoBloco[i] = new BlocoAquarela (JOptionPane.showInputDialog("Digite o nome do bloco "+i));
			novoBloco[i].setMarca(JOptionPane.showInputDialog("Digite a marca do bloco " +i));
			novoBloco[i].setGramatura(JOptionPane.showInputDialog("Digite a gramatura do bloco " +i));
			novoBloco[i].setQuantidadeFolhas(JOptionPane.showInputDialog("Digite a quantidade de folhas do bloco " +i));
			novoBloco[i].setPreco(JOptionPane.showInputDialog("Digite o preço do bloco " +i));
		}
		
		//for que imprime os dados de BlocoAquarela
		for (int i = 1; i < 3; i++) {
			JOptionPane.showMessageDialog(null, "Bloco de Aquarela " + i + ":\n"+
												"Nome do bloco: " +novoBloco[i].getNome()+ ",\n" + 
												"Marca do bloco: " +novoBloco[i].getMarca() + ",\n" +
												"Gramatura do bloco: " +novoBloco[i].getGramatura() + ",\n" +
												"Quantidade de folhas no bloco: " +novoBloco[i].getQuantidadeFolhas() + ",\n" +
												"Preço do bloco: " +novoBloco[i].getPreco());
			System.out.println("Bloco de Aquarela " + i + ":");
			novoBloco[i].gramaturaBloco();
			System.out.println("-------------------------------------------");
		}
	}

}
