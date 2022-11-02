
public class Dato {
	private boolean colocado;

	public Dato(boolean b) {
		colocado=b;
	}

	public boolean isColocado() {
		if(!colocado) {
			/*try {
				this.wait();
			} catch (Exception e) {
				// TODO: handle exception
			}*/
		}
		return colocado;
	}
	public void setColocado(boolean colocado) {
		this.colocado = colocado;
	//se notifica si ya se puede usar este metodo
		//this.notify();
	}

	@Override
	public String toString() {
		return "Dato [colocado=" + colocado + "]";
	}
	
}
