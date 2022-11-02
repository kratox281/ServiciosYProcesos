
public class Main {
	public static void main(String[] args) {
		Number n = new Number(0);
		Proceso1 p1 = new Proceso1(n);
		Proceso2 p2 = new Proceso2(n);
		Proceso3 p3 = new Proceso3(n);
		Proceso4 p4 =  new Proceso4(n);	
		Proceso5 p5 =  new Proceso5(n);
		
		p1.start();
		p2.start();
		p3.start();
		p4.start();
		p5.start();
	}
}
