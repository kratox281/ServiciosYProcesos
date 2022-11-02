
public class ProcesoHijo extends Thread {
	
	private Numero datoCompartido;
	
	public ProcesoHijo() {
		super();
		// TODO Auto-generated constructor stub
	}

	public ProcesoHijo(String name, Numero number) {
		super(name);
		// TODO Auto-generated constructor stub
		System.out.println("Construyendo hijo");
		datoCompartido = number;
	}

	@Override
	public void run() {
		// TODO Auto-generated method stub
		super.run();
		
		for(int i = 0;i<10000;i++) {
			synchronized (datoCompartido) {
				System.out.println("Hijo: "+datoCompartido.getDato());
				int temporal = datoCompartido.getDato();
				temporal++;
				datoCompartido.setDato(temporal);
			}
			
		}
	}

	
}
