public class CreditCards{
	public CreditCards(){
		CreditCard wellsFargoCC = new CreditCard(37, 25, 959.43, "05/02/2019", 240.57, (16.40/365)); // daily interest rate
		CreditCard capitalOneCC = new CreditCard(38, 0, 1250, "05/22/2019", 0.00, (23.74/365)); // daily interest rate
		CreditCard amazonPrimeCC = new CreditCard(35, 0, 4, "04/23/2019", 2424.67, (16.40/365)); // daily interest rate	
		CreditCard paypalCC = new CreditCard(38,32.99,3250,"05/15/1990",32.99,(26.24/365));
		CreditCard affirmCC = new CreditCard(0.0,358.00,0,"06/01/2019",3671.98,(29.47/365)); // 12 month term
	}
	
}