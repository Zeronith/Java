package testing;

public class Multidimension_Array {

	public static void main(String[] args) {
		// 2D array = An array where each element is an array 
		// 			  Usefull for storing matrix of data
		
		String [] fruits = {"banana", "kiwi", "etc"};
		String [] vegetables = {"potato", "carrot", "etc"};
		String [] meats = {"pork", "beef", "etc"};
		
		
		String [][] groceries = {fruits , vegetables, meats}; // Creating 2 dimensional array
		
		for(String [] foods : groceries) // Iterating through array
		{
			for(String food : foods) // iterating through element
			{
				System.out.print(food + " ");
			}
			System.out.println();
		}
		
		groceries[0][0] = "apple"; // Changing element value
		
		System.out.println();

		for(String [] foods : groceries) // Iterating through array
		{
			for(String food : foods) // iterating through element
			{
				System.out.print(food + " ");
			}
			System.out.println();
		}
	}

}
