
public class Hijo extends Thread{
	
	public Hijo() {
		super();
		
	}
	public Hijo(String string) {
		super(string);
	}
	@Override
	public void run() {
		// TODO Auto-generated method stub
		super.run();
		for(int i = 0;i<1000000000 && !isInterrupted()  ;i++) {
			
			System.out.println(this.getName()+" "+i);
			/*try {
				Thread.sleep(1);
			}catch (InterruptedException e) {
				Thread.currentThread().interrupt();
			}*/
			Thread.yield();
		}
		System.out.println("Nos fuimos que es viernes");
		
	}

	
	
}
