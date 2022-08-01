package dio.inovation.singleton;

/**
 * Singleton "apreçado"
 * @author Samara
 *
 */
public class SingletonEager {
	
	private static  SingletonEager instancia = new SingletonEager();
	private  SingletonEager() {
		super();
	}
	
	public static SingletonEager getInstancia() {
		
		return instancia;
	}

}
