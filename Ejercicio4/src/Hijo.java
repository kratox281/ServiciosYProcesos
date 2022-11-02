
public class Hijo implements Runnable{
	Thread procesoHijo;
	public String name;
	private Numero num;
	public int contador=0;
	public Hijo(String nombre,ThreadGroup grupo,Numero numer) {
		super();
		this.name = nombre;
		this.num = numer;
		procesoHijo = new Thread(grupo,this,nombre);
		procesoHijo.start();
	}
	
	@Override
	public void run() {
		System.out.println("Soy el hijo "+procesoHijo.getName());
		while(num.getDato()<5000 && !procesoHijo.isInterrupted()) {
			synchronized (num) {
				if(num.getDato()<5000) {
					contador++;
					num.setDato(num.getDato()+1);
					System.out.println(procesoHijo.getName()+" : "+num.getDato());
					if(num.getDato()==5000){
						System.out.println("Soy el "+procesoHijo.getName()+" y me he cargado a todos, la herencia es solo mia");
						procesoHijo.getThreadGroup().interrupt();
				}
				
				
				}
				
			}
			
			
			
		}
		
	}
	

}
