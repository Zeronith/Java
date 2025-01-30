package testing;

import java.util.Random;

public class RandomNumbers {

	public static void main(String[] args) {
		Random random = new Random();
		
		boolean coin ;
		
		// random.nextInt(); Random integer number
		// random.nextInt(1, 7); // Random integer 1 to 7 , 7 is not included
		// random.nextDouble(); // Random double 0 to 1
		// random.nextBoolean() //	Random boolean value
		
		
		//GROUP 1
		int counter_head = 0;
		int counter_tail = 0;
		for (int i = 0 ; i<10000000; i++)
		{
			coin = random.nextBoolean();
			if (coin) 
			{
				counter_head++;
			}
			else 
			{
				counter_tail++;
			}
		}
		System.out.println("Total Head is : " + counter_head);
		System.out.println("Total Tail is : " + counter_tail);
	}

}
