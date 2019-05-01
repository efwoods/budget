public class Purchase{
	private double totalCost;
	private double monthlyPayment;
	private double downPayment;
	
	public Purchase(double totalCost, double monthlyPayment, double downPayment){
		this.totalCost = totalCost;
		this.monthlyPayment = monthlyPayment;
		this.downPayment = downPayment;
	}
	public Purchase(){
		this.totalCost = 0;
		this.monthlyPayment = 0;
		this.downPayment = 0;
	} 
}