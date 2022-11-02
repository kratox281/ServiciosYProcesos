package ejemploRunnable;

public class ProcesoHijo implements Runnable{
	Thread proces;

	public ProcesoHijo() {
		super();
		proces = new Thread(this);
		proces.start();
	}

	@Override
	public void run() {
		for(int i = 0;i<100;i++) {
			System.out.println("Soy el hijo"+i);
			
		}
		
	}

}
