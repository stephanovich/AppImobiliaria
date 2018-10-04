package negocio;

import java.util.List;

import interfaces.Exibir;

public class Imobiliaria implements Exibir{
	private String nome;
	private String endereco;
	private String contato;
	private List<Imovel> imoveis;
	
	public void exibir() {
		System.err.println("------------------------------------------------------");
		System.err.printf("Imobiliaria: %s\nEndereço: %s\nContato: %s\n",
				nome,
				endereco,
				contato
				);
		System.err.println("------------------------------------------------------");
		imprimirLista();

	}
	
	private void imprimirLista() {
		for(int i = 0; i < imoveis.size(); i++) {
			imoveis.get(i).exibir();
			System.out.println("------------------------------------------------------");
		}
	}
	
	public String getNome() {
		return nome;
	}


	public void setNome(String nome) {
		this.nome = nome;
	}


	public String getEndereco() {
		return endereco;
	}


	public void setEndereco(String endereco) {
		this.endereco = endereco;
	}


	public List<Imovel> getImoveis() {
		return imoveis;
	}

	public void setImoveis(List<Imovel> imoveis) {
		this.imoveis = imoveis;
	}

	public String getContato() {
		return contato;
	}

	public void setContato(String contato) {
		this.contato = contato;
	}
	
		
}
