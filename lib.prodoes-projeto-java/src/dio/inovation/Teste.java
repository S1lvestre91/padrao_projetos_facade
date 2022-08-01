package dio.inovation;

import dio.inovation.gof.facade.Facade;
/*import dio.inovation.singleton.SingletonEager;
import dio.inovation.singleton.SingletonLazy;
import dio.inovation.singleton.SingletonLazyHolder;
import dio.inovation.strategy.Comportamento;
import dio.inovation.strategy.ComportamentoDefensivo;
import dio.inovation.strategy.ComportamentoNormal;
import dio.inovation.strategy.Rodo;*/

public class Teste {

	public static void main(String[] args) {
		// facade
		Facade facade = new Facade();
		facade.migrarCliente("Francisco", "64.606-105");
		
	}

}
