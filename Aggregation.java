package testing;

public class Aggregation {
	public static void main(String [] args)
	{
		/*Aggregation = Represents a "has-a" relationship between objects .
		 * 				One object contains another object as part of its structure ,
		 * 				But the contained object/s can exist independently
		 */
		
		Book book1 = new Book("Harry Potter" , 500);
		Book book2 = new Book("The Two Towers ", 352);
		Book book3 = new Book("The Return of the King", 416);
		
		Book [] books = {book1, book2 , book3};
		
		
		Library library = new Library("Enguunee's Library", 2005, books);
	
		library.displayInfo();
	}
}
