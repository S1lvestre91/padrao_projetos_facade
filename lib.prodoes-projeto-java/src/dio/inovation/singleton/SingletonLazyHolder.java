package dio.inovation.singleton;

/**
 * Singleton "lazy holder"
 * @author Samara
 *
 *@see <a> </a>
 */

public class SingletonLazyHolder {
	private static class Holder {
		private static  SingletonLazyHolder instanciaHolder = new SingletonLazyHolder();
	}
	private  SingletonLazyHolder() {
		super();
	}
	
	public static SingletonLazyHolder getInstancia() {
		
		return Holder.instanciaHolder;
	}

}
