package negocio;

public class Casa extends Imovel{

	public Casa(String identificacao, String endereco) {
		super(identificacao, endereco);
		// TODO Auto-generated constructor stub
	}

	public void exibir() {		
		adicionarCabecalho();
		System.out.println("Casa");
		super.imprimir();

	}
	
	
}