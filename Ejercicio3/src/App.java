
public class App {
public static void main(String[] args) {
	Numero  number = new Numero(0);
	Hijo h1 = new Hijo(number,"h1");
	Hijo h2 = new Hijo(number,"h2");
	Hijo h3 = new Hijo(number,"h3");
	Hijo h4 = new Hijo(number,"h4");
	Hijo h5 = new Hijo(number,"h5");
	h1.start();
	h2.start();
	h3.start();
	h4.start();
	h5.start();
	//El threadGroup tiene la propiedad de matar a todos los procesos del grupo
	try {
		Thread.sleep(200);
	} catch (InterruptedException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	h1.interrupt();
	h2.interrupt();
	h3.interrupt();
	h4.interrupt();
	h5.interrupt();
	System.out.println(h1.getName()+" "+h1.getContador());
	System.out.println(h2.getName()+" "+h2.getContador());
	System.out.println(h3.getName()+" "+h3.getContador());
	System.out.println(h4.getName()+" "+h4.getContador());
	System.out.println(h5.getName()+" "+h5.getContador());
	
	
}
}
