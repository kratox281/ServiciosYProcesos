
public class Aplicación {

public static void main(String[] args) {
	Hijo hijo = new Hijo("1");
	Hijo hijo2 = new Hijo("2");
	hijo.start();
	hijo2.start();
	
	try {
		Thread.sleep(100);
	}catch (InterruptedException e) {
		e.printStackTrace();
	}
	hijo.interrupt();
	hijo2.interrupt();
	
	System.out.println("Que os calleis ya");
}
}
