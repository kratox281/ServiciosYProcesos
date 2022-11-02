package Solution;

public class Hijos extends Thread{
	private int cont=0;
	private Number num;
	
	
	public Hijos(String name,Number num) {
		super(name);
		this.num = num;
	}



	@Override
	public void run() {
		// TODO Auto-generated method stub
		super.run();
		
		for(cont = 0;num.getDato()<1000;cont++) {
			
			synchronized (num) {
				if(num.getDato()>1000)break;
				System.out.println(this.getName()+" : "+num.getDato());
				int temp = num.getDato();
				num.setDato(temp+1);
			}
		}
		System.out.println(this.getName()+" he contado: "+cont);
		
}
}
