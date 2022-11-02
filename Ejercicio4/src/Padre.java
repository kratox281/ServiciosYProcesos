import java.util.ArrayList;

public class Padre {
	

public static void main(String[] args) {
	Numero num = new Numero(0);
	 ArrayList<Hijo> listaHijos = new ArrayList<>();
	 ThreadGroup grupo = new ThreadGroup("grupo");
for (int i=1;i<=5;i++) {
	Hijo h = new Hijo("hijo "+i,grupo,num);
	listaHijos.add(h);
}
try {
	Thread.sleep(200);
} catch (InterruptedException e) {
	// TODO Auto-generated catch block
	e.printStackTrace();
}
for(Hijo h : listaHijos) {
	System.out.println(h.name+" ha contado: "+h.contador);
}



}
}
