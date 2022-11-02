
public class Aplicacion {
	@SuppressWarnings("static-access")
	public static void main(String[] args) {
		Dato dato = new Dato(false);
		Productor p = new Productor(dato);
		Consumidor c = new Consumidor(dato);
		p.start();
		c.start();
		try {
			p.sleep(1);
		}catch (Exception e) {
			// TODO: handle exception
		}
	}

}
