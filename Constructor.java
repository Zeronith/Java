package testing;

//Class declaration is in Student.java file

public class Constructor {
	public static void main(String [] args)
	{
		// Constructor = A special method to initialize objects
		//				 You can pass arguments to a constructor 
		// 				 and set up initial values
		
		Student student1 = new Student("Enguunbayar", 19, 3.9); // Using Constructor to initialize object
		Student student2 = new Student("Batzolboo", 19, 3.9);
		
		
		System.out.println(student1.name);
		System.out.println(student1.age);
		System.out.println(student1.gpa);
		System.out.println(student1.isEnrolled);
		
		System.out.println();
		
		System.out.println(student2.name);
		System.out.println(student2.age);
		System.out.println(student2.gpa);
		System.out.println(student2.isEnrolled);
		
		student1.study();
		student2.study();
	}
}
