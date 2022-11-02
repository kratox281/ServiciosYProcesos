
public class Proceso2 extends Thread{
	private Number num;
	private int cont=0;
	public Proceso2(Number nu) {
		super();
		this.num = nu;
	}

	@Override
	public void run() {
		// TODO Auto-generated method stub
		super.run();
		synchronized (num) {
			do {
			System.out.println("Proceso 2: "+num.getDato());
			int temp = num.getDato()+1;
			num.setDato(temp);
			cont++;
		}while(num.getDato()<1000000);
			if(num.getDato()>=1000000) {
				System.out.println("Proceso 2: he contado "+cont+" numeros");
			}
		}
		
		
	}
	
	
}
