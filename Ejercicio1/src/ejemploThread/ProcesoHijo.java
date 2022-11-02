package ejemploThread;

public class ProcesoHijo extends Thread{

	public ProcesoHijo() {
		super();
		
	}

	@Override
	public void run() {
		super.run();
		for(int i = 0;i<100;i++) {
			System.out.println("Soy el hijo"+i);
			
		}
	}
	
}
