package subsystema1.crm;

public class CrmService {
	private CrmService() {
		super();
	}
	public static void gravarClientes(String nome, String cep, String cidade, String estado, String bairro) {
		System.out.println("Cliente salvo no sistema de CRM:");
		System.out.println("Nome: " + nome);
		System.out.println("Cep: "+ cep);
		System.out.println("Estado: "+estado);
		System.out.println("Cidade: "+cidade);
		System.out.println("Bairo: "+bairro);
	}
}
