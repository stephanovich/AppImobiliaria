package negocio;

import java.util.Calendar;

import auxiliar.Constante;
import interfaces.Exibir;

public abstract class Imovel implements Exibir{
	private Calendar datadoAnuncio;
	private String identificacao;
	private String endereco;
	private String complemento;
	private String[] comodos;
	private Proprietario proprietario;
	private Informacao informacao;
	
	public Imovel(String identificacao, String endereco) {
		this.identificacao = identificacao;
		this.endereco = endereco;
	}
	
	protected final void adicionarCabecalho() {
		System.out.println("#Imóvel#");
	}
	
	public abstract void exibir();
	
	public void imprimir() {
		System.out.printf("Identificação da propriedade: %s\nEndereço: %s\nComplemento: %s\n"
				+ "Data do anuncio: %s\n",
				identificacao,
				endereco,
				complemento,
				Constante.obterDataHoraFormatada(datadoAnuncio.getTime())
				);
		System.out.println();
		System.out.println("Informações de comôdos");
		exibirComodos();
		proprietario.exibir();
		System.out.println();
		informacao.exibir();
		System.out.println();
	}
		
	
	public void exibirComodos() {
		for(int i = 0; i < comodos.length; i++) {
			System.out.println(comodos[i]);
		}
	}
	public String[] getComodos() {
		return comodos;
	}

	public void setComodos(String[] comodos) {
		this.comodos = comodos;
	}

	public String getIdentificacao() {
		return identificacao;
	}
	public void setIdentificacao(String identificacao) {
		this.identificacao = identificacao;
	}
	public String getEndereco() {
		return endereco;
	}
	public void setEndereco(String endereco) {
		this.endereco = endereco;
	}
	public Proprietario getProprietario() {
		return proprietario;
	}
	public void setProprietario(Proprietario proprietario) {
		this.proprietario = proprietario;
	}
	public Informacao getInformacao() {
		return informacao;
	}
	public void setInformacao(Informacao informacao) {
		this.informacao = informacao;
	}

	public Calendar getDatadoAnuncio() {
		return datadoAnuncio;
	}

	public void setDatadoAnuncio(Calendar datadoAnuncio) {
		this.datadoAnuncio = datadoAnuncio;
	}

	public String getComplemento() {
		return complemento;
	}

	public void setComplemento(String complemento) {
		this.complemento = complemento;
	}
	

}
