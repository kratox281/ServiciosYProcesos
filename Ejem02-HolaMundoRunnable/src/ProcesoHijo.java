
public class ProcesoHijo implements Runnable {
		/*Esta manera tan liosa se utiliza para poder heredar de otras clases en vez de
		 * limitarnos esa posibilidad por haber extendido de Thread*/
	Thread procesoHijo;
	public ProcesoHijo() {
		super();
		procesoHijo = new Thread(this);
		procesoHijo.start();
	}

	@Override
	public void run() {
		System.out.println("Hola soy el proceso hijo");
	}

}
