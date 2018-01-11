public class Banco {
	private double saldo;
	
	public double ingresar (double dinero){
		this.saldo = this.saldo + dinero;
		return saldo;
	}
	public double retirar (double dinero){
		if (this.saldo>=dinero){
			this.saldo = this.saldo - dinero;
		}
		else{
			System.out.println("No puedes retirar tanto dinero");
		}
		return saldo;
	}
}
