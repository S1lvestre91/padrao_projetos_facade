package subsystema2.cep;

public class CepApi {
	private static CepApi instancia = new CepApi();
	private CepApi() {
		super();
	}
	public static CepApi getInstancia() {
		return instancia;
	}
	
	public String recuperaCidade(String cep) {
		return "Picos";
	}
	public String recuperaEstado(String cep) {
		return "PI";
	}
	public String recuperaBairro(String cep) {
		return "Bela Vista";
	}
}
