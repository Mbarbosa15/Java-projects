package entities;



public class salario {
	public String nome; 
	public double salBruto;
	public int  tax;
	
	public double salLiq() {
		return  this.salBruto - this.tax;
		
		}		
		
	public void increaseSalary(double percentage) {
			this.salBruto += this.salBruto * percentage / 100.0;
		}

	@Override
	public String toString() {
	return nome + ", $ " + String.format("%.2f", salLiq());
		
		}	
	
}