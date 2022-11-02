
public class Hijo extends Thread {
	private Numero sincro;
	private int contador = 0;

	public Hijo(Numero sincro, String name) {
		super(name);
		this.sincro = sincro;
	}

	@Override
	public void run() {
		super.run();
		while (sincro.getDato() < 1000 && !Thread.currentThread().isInterrupted()) {
			contador++;
				synchronized (sincro) {
					if (sincro.getDato() < 1000) {
					sincro.setDato(sincro.getDato() + 1);
					System.out.println(this.getName() + " " + sincro.getDato());
				}
			}
		}
		try {
			Thread.sleep(10);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			System.out.println(this.getName()+" : "+this.contador);
		}
	}

	public int getContador() {
		return this.contador;
	}
}
