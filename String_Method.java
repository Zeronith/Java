package testing;

public class String_Method {

	public static void main(String[] args) {
		
		String name = "Enguun Bayar";
		
		int length = name.length(); 
		char letter = name.charAt(0);
		int index = name.indexOf("a"); // First occurance of given char
		int lastIndex = name.lastIndexOf("a"); // Last occurance of given char
		
	  //name = name.toUpperCase();
	  //name = name.toLowerCase();
	  //name = name.replace('n', 'h');
		
		
		System.out.println(letter);
		System.out.println(length);
		System.out.println(index);
		System.out.println(lastIndex);
		System.out.println(name);
		System.out.println(name.isEmpty());
		System.out.println(name.contains("r"));
		
		if (name.equals("password")) // Case sensitive . 
		{
			System.out.println("Your name can't be password");
			
		}
		else 
		{
			System.out.printf("Hello %s", name);
		}
		
	}

}
