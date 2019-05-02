0.0//package Woods;

//import Woods.Budget;
public class Main{
	public static void main(String[] args){
		Budget myBudget = new Budget();
//		Budget();
		// below are desired expenditures
		double salary = 0.0;
		double taxes = 0.0;
		double clothing = 0.0;
		double loans = 0.0;
		double rent = 0.0;
		double food = 0.0;
		double car = 0.0;
		double retirement = 0.0;
		double longTermSavings = 0.0;
		double vacation = 0.0;
		double fun = 0.0;

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