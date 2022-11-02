
public class Aplicacion {
public static void main(String[] args) {
	Numero  number = new Numero(0);
	System.out.println("Soy el padre");
	ProcesoHijo hijo = new ProcesoHijo("Pepe",number);
	hijo.start();
	System.out.println("Dame tu nombre: "+hijo.getName());
	for(int i = 0; i<10000;i++) {
		synchronized (number) {
			System.out.println("Padre: " + number.getDato());
			int temporal = number.getDato();
			temporal++;
			number.setDato(temporal);
		}
		
	}
}
}
