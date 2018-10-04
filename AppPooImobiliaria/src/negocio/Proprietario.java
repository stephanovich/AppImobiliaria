package negocio;

import interfaces.Exibir;

public class Proprietario implements Exibir{	
	private String nome;
	private String cpf;
	private String contato;
	
	public Proprietario(String nome, String contato) {
		this.nome = nome;
		this.contato = contato;
	}

	public void exibir() {
		System.out.println();
		System.out.println("Informações do proprietário");
		System.out.printf("Nome: %s\nCpf: %s\nContato %s\n",
				nome,
				cpf,
				contato
			   );
	
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getCpf() {
		return cpf;
	}

	public void setCpf(String cpf) {
		this.cpf = cpf;
	}

	public String getContato() {
		return contato;
	}

	public void setContato(String contato) {
		this.contato = contato;
	}
		

}