import java.util.concurrent.atomic.AtomicInteger;

public class Aplicacion {
	public static void main(String[] args) {
		AtomicInteger ati = new AtomicInteger();
		Proceso proces = new Proceso("P1", ati);
		Proceso proces1 = new Proceso("P2", ati);
		Proceso proces2 = new Proceso("P3", ati);
		Proceso proces3 = new Proceso("P4", ati);
		//// El set Daemon sirve para que exista una dependencia absoluta entre procesos
		//// Hijos y el padre
		//// En el momento que el padre acaba hace que finalicen los hijos, cuando este
		//// en true
		// proces.setDaemon(true);
		proces.start();
		proces1.start();
		proces2.start();
		proces3.start();
		System.out.println("Soy el padre");
		// Los Atomic like atomicInteger() nos proporciona metodos Ya SINCRONIZADOS
		// y con las propias funciones de incrementarlo o reducirlo
	}
}
