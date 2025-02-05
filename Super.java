package testing;

public class Super {

	public static void main(String[] args)
	{
		// Super = Refers to the parent class (subclass <- superclass)
		// 		   used in constructor and method overriding
		//		   Calls the parent constructor to initialize attributes
		
		Person person = new Person("Enguunbayar", "Ganzorig");
		Student_Super student = new Student_Super("Enguunbayar", "Ganzorig", 3.9);
		Employee employee = new Employee ("Enguunbayar", "Ganzorig", 123456789876543.3);
		
		person.showName();
		
		student.showName();
		student.show_gpa();
		
		employee.showName();
		employee.showSalary();
	}
	
}
