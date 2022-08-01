package dio.inovation.gof.facade;

import subsystema1.crm.CrmService;
import subsystema2.cep.CepApi;

public class Facade {
	public void migrarCliente(String nome, String cep) {
		String cidade = CepApi.getInstancia().recuperaCidade(cep);
		String estado = CepApi.getInstancia().recuperaEstado(cep);
		String bairro = CepApi.getInstancia().recuperaBairro(cep);
		
		CrmService.gravarClientes(nome, cep, cidade, estado, bairro);
	}
}
