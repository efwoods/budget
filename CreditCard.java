public class CreditCard extends Debt{
	private double latePayment;
	private double minimumBalanceDue;
	private double availableToSpend;
	private String dueDate;

	public CreditCard (	double latePayment, 
						double minimumBalanceDue, 
						double availableToSpend,
						String dueDate,
						double currentBalance,
						double interestRate){
		
		super(currentBalance, interestRate);
		this.latePayment = latePayment; 
		this.minimumBalanceDue = minimumBalanceDue; 
		this.availableToSpend = availableToSpend;
		this.dueDate = dueDate;
	} 
}