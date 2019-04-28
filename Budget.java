/* 	Given a salary, the following code will calculate the monthly allotment of funds 
 	in concert with Richard Jenkins' 60% solution with an even distribution given to each category.
 	
 	future adaptation invovles:
 		finding expenditure percentage compared to allotted percentage, 
 		mobile app developement, 
 		sql database integration, and 
 		paypal api integration to track actual expenses.
*/

// Budget Allotment: the following shows the allowable monthly expenditures based on a given percentage for each category
public class Budget{
	private double salary;
	
	private double monthlyIncome;
	
	// Fixed Recurring Expenses
	private double monthlyTaxes;
	private double percentTaxes;
	
	private double monthlyCar;
	private double percentCar;
	
	private double monthlyFood;
	private double percentFood;
	
	private double monthlyRent;
	private double percentRent;
	
	private double monthlyLoans;
	private double percentLoans;
	
	private double monthlyClothes;
	private double percentClothes;
	
	// Flexible Expenses
	private double monthlyRetirement;
	private double percentRetirement;
	
	private double monthlyLongTermSavings;
	private double percentLongTermSavings;
	
	private double monthlyEmergencyFunds;
	private double percentEmergencyFunds;

	private double monthlyFun;
	private double percentFun;

	// constructor
	public Budget(){
		this.salary = 12_490; // poverty line for a single person in household 2019
		this.percentTaxes = 0.30;
		this.percentClothes = 0.06;
		this.percentLoans =  0.06;
		this.percentRent = 0.06;
		this.percentFood = 0.06;
		this.percentCar = 0.06;
		this.percentRetirement = 0.10;
		this.percentLongTermSavings = 0.10;
		this.percentEmergencyFunds = 0.10;
		this.percentFun = 0.10;
		setAllotmentByPercentage(	this.salary, 
									this.percentTaxes, 
									this.percentClothes, 
									this.percentLoans, 
									this.percentRent,
									this.percentFood, 
									this.percentCar, 
									this.percentRetirement, 
									this.percentLongTermSavings, 
									this.percentEmergencyFunds, 
									this.percentFun );
	}

	public Budget(double salary){
		this.salary = salary;
		this.percentTaxes = 0.30;
		this.percentClothes = 0.06;
		this.percentLoans =  0.06;
		this.percentRent = 0.06;
		this.percentFood = 0.06;
		this.percentCar = 0.06;
		this.percentRetirement = 0.10;
		this.percentLongTermSavings = 0.10;
		this.percentEmergencyFunds = 0.10;
		this.percentFun = 0.10;
		setAllotmentByPercentage(	this.salary, 
									this.percentTaxes, 
									this.percentClothes, 
									this.percentLoans, 
									this.percentRent,
									this.percentFood, 
									this.percentCar, 
									this.percentRetirement, 
									this.percentLongTermSavings, 
									this.percentEmergencyFunds, 
									this.percentFun );
	}
	/*
		below is used to input what you want to expend each month (salary is needed). the method printAllPercents()
		can then display the percent of the monthly income spent in each category.
	*/
	public Budget(	double salary, 
					double taxes, 
					double clothing, 
					double loans, 
					double rent, 
					double food, 
					double car, 
					double retirement, 
					double longTermSavings,
					double vacation, 
					double fun){
		this.salary = salary;
		this.monthlyTaxes = taxes;
		this.monthlyCar = car;
		this.monthlyClothes = clothing;
		this.monthlyLoans = loans;
		this.monthlyRent  = rent;
		this.monthlyFood = food;
		this.monthlyRetirement = retirement;
		this.monthlyLongTermSavings = longTermSavings;
		this.monthlyEmergencyFunds = vacation;
		this.monthlyFun = fun;
		setPercentageByAllotment(salary, taxes, clothing, loans, rent, food, car, retirement,  longTermSavings,  
											vacation, fun);

	}

	// mass setter based on percentage
	public void setAllotmentByPercentage(	double salary, 
											double percentTaxes, 
											double percentClothes, 
											double percentLoans, 
											double percentRent,
											double percentFood, 
											double percentCar, 
											double percentRetirement, 
											double percentLongTermSavings, 
											double percentEmergencyFunds, 
											double percentFun ){
		this.monthlyIncome = salary/12;
		this.monthlyTaxes = percentTaxes*this.monthlyIncome;
		this.monthlyCar = percentCar*this.monthlyIncome;
		this.monthlyClothes = percentClothes * this.monthlyIncome;
		this.monthlyLoans = percentLoans * this.monthlyIncome;
		this.monthlyRent  = percentRent * this.monthlyIncome;
		this.monthlyFood = percentFood * this.monthlyIncome;
		this.monthlyRetirement = percentRetirement * this.monthlyIncome;
		this.monthlyLongTermSavings = percentLongTermSavings * this.monthlyIncome;
		this.monthlyEmergencyFunds = percentEmergencyFunds * this.monthlyIncome;
		this.monthlyFun = percentFun * this.monthlyIncome;
	}

	public void setPercentageByAllotment(	double salary, 
											double monthlyTaxes, 
											double monthlyClothes, 
											double monthlyLoans, 
											double monthlyRent,
											double monthlyFood, 
											double monthlyCar, 
											double monthlyRetirement, 
											double monthlyLongTermSavings, 
											double monthlyEmergencyFunds, 
											double monthlyFun ){
		this.monthlyIncome = salary/12;
		this.percentTaxes = monthlyTaxes / this.monthlyIncome;
		this.percentCar = monthlyCar / this.monthlyIncome;
		this.percentClothes = monthlyClothes / this.monthlyIncome;
		this.percentLoans = monthlyLoans / this.monthlyIncome;
		this.percentRent = monthlyRent / this.monthlyIncome;
		this.percentFood = monthlyFood / this.monthlyIncome;
		this.percentRetirement = monthlyRetirement / this.monthlyIncome;
		this.percentLongTermSavings = monthlyLongTermSavings / this.monthlyIncome;
		this.percentEmergencyFunds = monthlyEmergencyFunds / this.monthlyIncome;
		this.percentFun = monthlyFun / this.monthlyIncome;
	}

//	Individual Setters
	public void setSalary(double input){
		this.salary = input;
	}
	public void setMonthlyIncome(double input){
		this.monthlyIncome = input;
	}
	public void setMonthlyTaxes(double input){
		this.monthlyTaxes = input;
	}
	public void setPercentTaxes(double input){
		this.percentTaxes = input;
	}
	public void setMonthlyCar(double input){
		this.monthlyCar = input;
	}
	public void setPercentCar(double input){
		this.percentCar = input;
	}
	public void setMonthlyFood(double input){
		this.monthlyFood = input;
	}
	public void setPercentFood(double input){
		this.percentFood = input;
	}
	public void setMonthlyRent(double input){
		this.monthlyRent = input;
	}
	public void setPercentRent(double input){
		this.percentRent = input;
	}
	public void setMonthlyLoans(double input){
		this.monthlyLoans = input;
	}
	public void setPercentLoans(double input){
		this.percentLoans = input;
	}
	public void setMonthlyClothes(double input){
		this.monthlyClothes = input;
	}
	public void setPercentClothes(double input){
		this.percentClothes = input;
	}
	public void setMonthlyRetirement(double input){
		this.monthlyRetirement = input;
	}
	public void setPercentRetirement(double input){
		this.percentRetirement = input;
	}
	public void setMonthlyLongTermSavings(double input){
		this.monthlyLongTermSavings = input;
	}
	public void setPercentLongTermSavings(double input){
		this.percentLongTermSavings = input;
	}
	public void setMonthlyEmergencyFunds(double input){
		this.monthlyEmergencyFunds = input;
	}
	public void setPercentEmergencyFunds(double input){
		this.percentEmergencyFunds = input;
	}
	public void setMonthlyFun(double input){
		this.monthlyFun = input;
	}
	public void setPercentFun(double input){
		this.percentFun = input;
	}

//	Getters	
	public double getSalary(){
		return this.salary;
	}
	public double getMonthlyIncome(){
		return this.monthlyIncome;
	}
	public double getMonthlyTaxes(){
		return this.monthlyTaxes;
	}
	public double getPercentTaxes(){
		return this.percentTaxes;
	}
	public double getMonthlyCar(){
		return this.monthlyCar;
	}
	public double getPercentCar(){
		return this.percentCar;
	}
	public double getMonthlyFood(){
		return this.monthlyFood;
	}
	public double getPercentFood(){
		return this.percentFood;
	}
	public double getMonthlyRent(){
		return this.monthlyRent;
	}
	public double getPercentRent(){
		return this.percentRent;
	}
	public double getMonthlyLoans(){
		return this.monthlyLoans;
	}
	public double getPercentLoans(){
		return this.percentLoans;
	}
	public double getMonthlyClothes(){
		return this.monthlyClothes;
	}
	public double getPercentClothes(){
		return this.percentClothes;
	}
	public double getMonthlyRetirement(){
		return this.monthlyRetirement;
	}
	public double getPercentRetirement(){
		return this.percentRetirement;
	}
	public double getMonthlyLongTermSavings(){
		return this.monthlyLongTermSavings;
	}
	public double getPercentLongTermSavings(){
		return this.percentLongTermSavings;
	}
	public double getMonthlyEmergencyFunds(){
		return this.monthlyEmergencyFunds;
	}
	public double getPercentEmergencyFunds(){
		return this.percentEmergencyFunds;
	}
	public double getMonthlyFun(){
		return this.monthlyFun;
	}
	public double getPercentFun(){
		return this.percentFun;
	}

//	Print Statements
	public void printPercent(double percentage, String name){
		System.out.println(name + ": " + 100*percentage + "% of monthly income.");
	}
	public void printAllotment(double allotment, String name){
		System.out.println(name + " monthly allotment: $" + allotment + ".");
	}
	public void printAllPercents(){
		printPercent(this.percentTaxes, "Taxes");
		printPercent(this.percentClothes, "Clothing");
		printPercent(this.percentLoans, "Loans");
		printPercent(this.percentRent, "Rent");
		printPercent(this.percentFood, "Food");
		printPercent(this.percentCar, "Car payment");
		printPercent(this.percentRetirement, "Retirement");
		printPercent(this.percentLongTermSavings, "Long term savings");
		printPercent(this.percentEmergencyFunds, "Vacation/Repairs/Emergency funds");
		printPercent(this.percentFun, "Fun money");
		System.out.println("");
	}
	public void printAllAllotments(){
		printAllotment(this.monthlyTaxes, "Taxes");
		printAllotment(this.monthlyClothes, "Clothing");
		printAllotment(this.monthlyLoans, "Loans");
		printAllotment(this.monthlyRent, "Rent");
		printAllotment(this.monthlyFood, "Food");
		printAllotment(this.monthlyCar, "Car payment");
		printAllotment(this.monthlyRetirement, "Retirement");
		printAllotment(this.monthlyLongTermSavings, "Long term savings");
		printAllotment(this.monthlyEmergencyFunds, "Vacation/Repairs/Emergency funds");
		printAllotment(this.monthlyFun, "Fun money");
		System.out.println("");
	} 
}