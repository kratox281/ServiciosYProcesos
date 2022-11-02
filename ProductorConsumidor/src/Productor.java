
public class Productor extends Thread {

	
	private Dato dat;
	public Productor(Dato dato) {
		// TODO Auto-generated constructor stub
		dat = dato;
	}

	@Override
	public void run() {
		// TODO Auto-generated method stub
		super.run();
		
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		
		System.out.println("Me he ejecutado");
		dat.setColocado(true);
	}

}
