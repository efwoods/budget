public class Debt{
	private double currentBalance;
	private double interestRate;

	public Debt(){
		this.currentBalance = 0;
		this.interestRate = 0;
	}
	public Debt(double currentBalance, double interestRate){
		this.currentBalance = currentBalance;
		this.interestRate = interestRate;
	}
}