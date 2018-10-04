package negocio;

import auxiliar.Constante;
import interfaces.Exibir;

public class Informacao implements Exibir{
	private float valorMetro;
	private int metrosQuadrados;
	private float iptu;
	private float valorSeguro;
	private boolean seguro; 

	
	public Informacao(float valorMetro,int metrosQuadrados,float iptu,boolean seguro,float valorSeguro) {
		this.valorMetro = valorMetro;
		this.metrosQuadrados = metrosQuadrados;
		this.iptu = iptu;
		this.seguro = seguro;
		this.valorSeguro = valorSeguro;
	}
	
	public void exibir() {
		
		System.out.println("Informações de venda do imóvel");
		System.out.printf("Tamanho do imóvel: %dM²\nValor do IPTU por ano: %.2f\nSeguro: %s\nValor total do Imóvel = %.2f\n",
				metrosQuadrados,
				calculaIptu(),
				seguro ? "Sim" : "Não",
				calculaValor()	
				);
	}
	
	
	private float calculaValor() {

		return seguro ? ((valorMetro * metrosQuadrados) + valorSeguro):
			            (valorMetro * metrosQuadrados); 
	}
	private float calculaIptu() {
		return (iptu * Constante.ANO);
	}
	public float getValorMetro() {
		return valorMetro;
	}
	public void setValorMetro(float valorMetro) {
		this.valorMetro = valorMetro;
	}
	public float getIptu() {
		return iptu;
	}
	public void setIptu(float iptu) {
		this.iptu = iptu;
	}
	public int getMetrosQuadrados() {
		return metrosQuadrados;
	}
	public void setMetrosQuadrados(int metrosQuadrados) {
		this.metrosQuadrados = metrosQuadrados;
	}

	public boolean isSeguro() {
		return seguro;
	}

	public void setSeguro(boolean seguro) {
		this.seguro = seguro;
	}
	
}

