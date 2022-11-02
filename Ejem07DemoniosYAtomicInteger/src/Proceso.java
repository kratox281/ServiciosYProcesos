import java.util.concurrent.atomic.AtomicInteger;

public class Proceso extends Thread{
	private AtomicInteger ai;
	private String nombre;
	public Proceso(String string, AtomicInteger ati) {
		this.nombre = string;
		this.ai = ati;
	}
	
	@Override
	public void run() {
		// TODO Auto-generated method stub
		super.run();
		
		for(int i = 0;i<100;i++) {
			System.out.println(this.nombre+" *-* "+ai.getAndIncrement());
		}
	}
}
