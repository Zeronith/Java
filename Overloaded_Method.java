package testing;

public class Overloaded_Method {
	public static void main(String[] args)
	{
		// overloaded method = method that share the same name
		// 					   but different parametr
		//                     signature = name + parametr
		
		
		System.out.println(add(1, 2, 3));
	}
	static int add(int a , int b) {return a+b;}
	static int add(int a , int b, int c) {return a+b+c;}
	static int add(int a , int b, int c, int d) {return a+b+c+d;}
}
