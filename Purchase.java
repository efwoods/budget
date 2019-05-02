public class Purchase{
	private double totalCost;
	private double monthlyPayment;
	private double downPayment;
	private int term; // in months
	
	public Purchase(double totalCost, double monthlyPayment, double downPayment, int term){
		this.totalCost = totalCost;
		this.monthlyPayment = monthlyPayment;
		this.downPayment = downPayment;
		this.term = term;
	}
	public Purchase(){
		this.totalCost = 0;
		this.monthlyPayment = 0;
		this.downPayment = 0;
		this.term = 0;
	} 
}