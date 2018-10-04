package negocio;

public class Apartamento extends Imovel{

	public Apartamento(String identificacao, String endereco) {
		super(identificacao, endereco);
		// TODO Auto-generated constructor stub
	}


	public void exibir() {
		super.adicionarCabecalho();
		System.out.println("Apartamento");
		super.imprimir();

	}



}