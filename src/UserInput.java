import java.util.Scanner; //imports only from Scanner class
//import java.util.*; can import all classes

public class UserInput {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Enter a byte value");
		byte b1 = scanner.nextByte();
		System.out.println("My byte value is: " + b1);
		
		System.out.println("Enter a short value");
		short s1 = scanner.nextShort();
		
		System.out.println("Enter an int value");
		int i1 = scanner.nextInt();
		
		System.out.println("Enter a boolean");
		boolean bool = scanner.hasNext();
		
		System.out.println(b1 +"|"+ s1 +"|" + i1+"|"+bool);
		  
		scanner.nextLine(); //--> allow you to hit enter after int/short/bool/double to enter string
		
		System.out.println("Enter your name");
		String str = scanner.nextLine();
		System.out.println(str);
		  
		//scanner.close(); --> will close your object not to take more space.
		//we cannot use that object after closing		
		  
		
		
		

	}

}
