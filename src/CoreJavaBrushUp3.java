import java.util.ArrayList;

public class CoreJavaBrushUp3 {

	public static void main(String[] args) {
		//Sting is an Object that represent the sequence of the characters
		//String Literals- In this case both s and s1 refer to the same sting literal
		String s="Ashish Mahajan";
		String s1= "Ashsih Mahajan";
		
		// create string object using new keyword- new memory allocator
		String s2= new String("Ashish");
		String s3= new String("Ashish");
		
		String s5= "Yachana Ashish Mahajan";
		String[] res= s5.split(" ");
		System.out.println("wife's name: "+res[0]);
		System.out.println("Her husband: "+res[1]);
		System.out.println("Their last name: "+res[2]);
		
		System.out.println(s5);
		System.out.println("************************");
		
		// Reverese a string
		
		for(int i= s5.length()-1; i>=0;i--) {
			System.out.print(s5.charAt(i));
		}
	}

}
