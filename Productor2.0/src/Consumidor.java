
public class Consumidor extends Thread {
	
	private Dato dat;
	public Consumidor(Dato dato) {
		// TODO Auto-generated constructor stub
		dat = dato;
	}

	@Override
	public void run() {
		// TODO Auto-generated method stub
		super.run();
		
		/*try {
			Thread.sleep(50000);
		}catch (InterruptedException e) {
			e.printStackTrace();
		}*/
		synchronized (dat) {
			try {
				dat.wait();
			}catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
		if(dat.isColocado()) {
			System.out.println("Ha colocado un valor");
		}else {
			System.out.println("No se ha colocado ningun valor");
		}
		
	}
}
