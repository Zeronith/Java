package testing;

public class Printf {

	public static void main(String[] args) {
		
		// printf() = is a method used to format output
		
		// %[flags][width][.precision][specifier-character]
		
		String name = "Enguunbayar";
		char firstLetter = 'E';
		int age = 19;
		double height = 179;
		boolean isStudent = true;
		
		System.out.printf("Hello %s\n", name );
		System.out.printf("Your name starts with a %c\n", firstLetter);
		System.out.printf("You are %d years old\n", age);
		System.out.printf("Your height is %.3f\n", height); // Specified precision
		System.out.printf("Student : %b\n", isStudent);

		System.out.printf("Your name is %s and your name starts with letter %c ."
				+ "You are %d years old . You are pretty tall . ", name, firstLetter, age);
		
		
	}

}
