
	import java.util.Scanner;
	 
	public class RestaurantOrder
	{
	/** Restaurant Ordering Program
	 * Welcome the party of diners - get number of diners
	 * Have each diner choose his meal options 
	 * 		- one appetizer
	 * 		- one entree
	 * 		- one drink
	 * 		- one dessert
	 * Present them back to the user along with the cost of that person's meal
	 * Present the total cost at the end of the order
	 * 
	 */
	    public static void main(String[] args)
	    {
	         
	        Scanner input = new Scanner(System.in);
	        
	         
	        // title
	        System.out.println(" Welcome to Cafe Java!\n");
	         
	        //ask how many people in group  
	        System.out.print("How many people are in your party: ");
	        int numDiner = input.nextInt();
	         
	        //size an array of type String based on the number of diners
	        String dinerNameArray[] = new String[numDiner];
	         
	        //ask for name of each diner and store in dinerArray
	        for( int i = 0; i < dinerNameArray.length; i++)
	        {
	            System.out.print("\nEnter the name of diner #" + (i+1) + ":");
	            dinerNameArray[i] = input.next();
	            
	        }//end for
	         
	         
	        System.out.println("\nEach person needs to order an item from each menu category.");
	        System.out.println("I will ask each diner for their menu selections.");

	 
	        //create arrays for Diner's choices
	        int[] appetizerChoiceArray = new int[numDiner];		// holds diner's appetizer choice
	        int[] mealChoiceArray = new int[numDiner];			// holds diner's meal choice
	        int[] dessertChoiceArray = new int[numDiner];		// holds diner's dessert choice
	        int[] drinksChoiceArray = new int [numDiner]; 		//hold's diner's drink choice
	        
	        String[] appetizerMenuArray = {"None","Calamari","Soup","Salad","Garlic Bread"};
	        double[] appetizerPriceArray = {0.00,7.50,4.99,4.99,2.50};
	        //stores choice in app price array
	        
	        String[] mealMenuArray = {"None","Baked Fish & Rice","Steak & Potatoes","Spaghetti & Meatballs","Veggie Burger & Fries"};
	        double[] mealPriceArray = {0.00,13.99,15.99,11.99,9.99};
	        //stores choice in meal price array
	        
	        String[] dessertMenuArray = {"None","Apple Pie","Ice Cream","Brownie","Canoli"};
	        double[] dessertPriceArray = {0.00,3.99,2.99,2.99,3.99};
	        //stores choice in dessert price array
	        
	        String[] drinksMenuArray = {"None", "Apple Juice", "Coke", "Rootbeer", "Dr. Pepper!"};
	        double[] drinksPriceArray = {0.00, 2.99, 1.99, 1.99, 1.99};
	        //stores choice in drinks price array
	    
	        
	        
	        // get diners' choices
	        for (int i = 0; i < dinerNameArray.length; i++)
	        {
	            System.out.print("\n" + dinerNameArray[i] + ", please make your selections from the following menus:\n");
	                   
	            System.out.println("Select one item from the Appetizer menu.\n");
	            System.out.println("1. None $0.00");
	            System.out.println("2. Deep Fried Calamari $7.50");
	            System.out.println("3. Soup du Jour $4.99");
	            System.out.println("4. Garden Salad $3.99");
	            System.out.println("5. Garlic Bread $4.50");
	            System.out.print("Please enter your selection #: ");  
	            appetizerChoiceArray[i]= input.nextInt() - 1;
	            //stores in appetizer choice array
	            
	            System.out.println("\nSelect one item from the Meal menu.\n");
	            System.out.println("1. None $0.00");
	            System.out.println("2. Baked Fish & Rice $13.99");
	            System.out.println("3. Steak & Pototoes $15.99");
	            System.out.println("4. Spaghetti & Meatballs $11.99");
	            System.out.println("5. Veggie Burger & Fries $9.99");
	            System.out.print("Please enter your selection #: ");  
	            mealChoiceArray[i]= input.nextInt() - 1;  
	            //stores in meal choice array
	         
	            System.out.println("\nSelect one item from the Dessert menu.\n");
	            System.out.println("1. None $0.00");
	            System.out.println("2. Apple Pie $3.99");
	            System.out.println("3. Ice Cream $2.99");
	            System.out.println("4. Brownie $2.99");
	            System.out.println("5. Canoli $3.99");
	            System.out.print("Please enter your selection #: ");  
	            dessertChoiceArray[i]= input.nextInt() - 1; 
	            //stores in dessert choice array
	            
	            System.out.println("\nSelect one item from the Drink menu. \n");
	            System.out.println("1. None $0.00");
	            System.out.println("2. Apple Juice $2.99");
	            System.out.println("3. Coke $1.99");
	            System.out.println("4. Rootbeer $1.99");
	            System.out.println("5. Dr. Pepper! $1.99");
	            drinksChoiceArray[i]= input.nextInt() - 1;
	            //stores in drinks choice array
	            
	        }
	        
	        
	        System.out.println("***********************************");
	        
	     System.out.format("Guests : %5s%n%n"  , numDiner);
	     //prints number of guests
	        
	    for ( int i = 0; i < numDiner; i++)
	    	{
			 System.out.format("%-25s%25.2f%n%n" , appetizerMenuArray[appetizerChoiceArray[i]] ,
					 appetizerPriceArray[appetizerChoiceArray[i]]);
			 //prints appetizer chosen and price with left and right formatting
			 
			 System.out.format("%-25s%25s%n%n" , mealMenuArray[mealChoiceArray[i]], mealPriceArray[mealChoiceArray[i]]); 
			 //prints meal chosen and price with left and right formatting
			 
			 System.out.format("%-25s%25s%n%n" ,dessertMenuArray[dessertChoiceArray[i]] , dessertPriceArray[dessertChoiceArray[i]]);
			 //prints dessert chosen and price with left and right formatting
			 
			 System.out.format("%-25s%25s%n%n" , drinksMenuArray[drinksChoiceArray[i]] , drinksPriceArray[drinksChoiceArray[i]] );
			 //prints drink chosen and price with left and right formatting

			     }
	      
	    double sum = 0; //holds price for everything ordered by one person
	    double subTotal = 0; //holds total price for everything ordered
	    double total = 0;
	    for (int i = 0; i < dinerNameArray.length; i++)
	    {
	    	sum = appetizerPriceArray[appetizerChoiceArray[i]] + mealPriceArray[mealChoiceArray[i]] +
	    			dessertPriceArray[dessertChoiceArray[i]] + drinksPriceArray[drinksChoiceArray[i]];
	    	//adds price of each item ordered by each person
	    	
	    	total = sum ;
	    	//puts sum into a total
	    	
	    	subTotal = sum + total;
	    	//adds total cost of all orders
	    }
	   
	    double tip = subTotal * .20;
	    //calculates 20% tip from subTotal
	    
	    System.out.format("Sub Total : " + "%.2f\n" , subTotal);
	    //prints subTotal without tip
	    
	    System.out.format("Tip : " + "%.2f\n" , tip);
	    //prints tip
	    
	    System.out.format("Total Balance : " + "%.2f" , subTotal + tip);
	    //prints total monies subtotal plus tip
	               

	        input.close();
	    }

		       
	    //end main
	}
	
	//end class}
