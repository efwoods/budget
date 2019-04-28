//package Woods;

//import Woods.Budget;
public class Main{
	public static void main(String[] args){
		Budget myBudget = new Budget();
//		Budget();
		// below are desired expenditures
		double salary = 62000.00;
		double taxes = 1550.00;
		double clothing = 0.00;
		double loans = 1500.00;
		double rent = 0.00;
		double food = 0.00;
		double car = 0.00;
		double retirement = 500.00;
		double longTermSavings = 500.00;
		double vacation = 100.00;
		double fun = 1500.00;

		// will print default distribution of povertyline individual household member.
		myBudget.printAllPercents();
//		System.out.println("\n");
		myBudget.printAllAllotments();

		// creates the expenditures and displays the percentage of monthly income used.
		myBudget = new Budget(salary, taxes, clothing, loans, rent, food, car, retirement,  longTermSavings,  
											vacation, fun);
		myBudget.printAllAllotments();
		myBudget.printAllPercents();
	}
}