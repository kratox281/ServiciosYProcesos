package Solution;

public class Main {
public static void main(String[] args) {
	Number n = new Number(0);
	Hijos h1 = new Hijos("Hijo 1",n);
	h1.start();
	Hijos h2 = new Hijos("Hijo 2",n);
	h2.start();
	Hijos h3 = new Hijos("Hijo 3",n);
	h3.start();
	Hijos h4 = new Hijos("Hijo 4",n);
	h4.start();
	Hijos h5 = new Hijos("Hijo 5",n);
	h5.start();
}
}
