package testing;

public class Break_Continue {

	public static void main(String[] args) {
		
		// break = break out of loop (Stop)
		// continue = skip current iteration of a loop (SKIP)
		
		for (int i = 0 ; i < 10 ; i++)
		{
			if(i == 5 )
			{
				continue; // Skips at 5
			}
			else if(i == 9 )
			{
				break; // Breaks at 9 
			}
			System.out.println(i);
		}
	}

}
