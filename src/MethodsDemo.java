
public class MethodsDemo {

	public static void main(String[] args) {
		
		MethodsDemo d= new MethodsDemo();
		d.getData();
		MethodsDemo1 d1= new MethodsDemo1();
		System.out.println(d1.getData());
		System.out.println(getData1());
	}
	
	public void getData() {
		System.out.println("Hello Ashish!!");
	}
	
	// Static Method
	public static String getData1() {
		String str="I am a static method";
		
		return str;
		
	}

}
 