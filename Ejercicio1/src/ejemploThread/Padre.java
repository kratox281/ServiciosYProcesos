package ejemploThread;



public class Padre {
public static void main(String[] args) {
	ProcesoHijo hijo = new ProcesoHijo();
	hijo.start();
	for(int i = 0;i<100;i++) {
		System.out.println("Soy el padre"+i);
		
	}
}
}