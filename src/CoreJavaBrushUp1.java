
public class CoreJavaBrushUp1 {

	public static void main(String[] args) {
		//TODO Auto-generated method stub
		int number=5;
		String name="Ashish Mahajan";
		char symbol='A';
		double marks=98.5;
		boolean mystatus= true;
		
		//Arrays- integer
		int[] arr=new int[5];
		arr[0]=23;
		arr[1]=45;
		arr[2]=12;
		arr[3]=8;
		arr[4]=22;
		
		int[] arr1= {11,22,33,44,55};
		
		System.out.println("My number is: "+number);
		System.out.println("My Name is: "+name);
		System.out.println("My symbol is: "+symbol);
		System.out.println("My Marks are: "+marks);
		System.out.println("My Status is: "+mystatus);
		System.out.println("Value at Array arr index 3 is: "+ arr[2]);
		System.out.println("Value at Array arr1 index 5 is: "+ arr1[4]);
		
		//Loops- for loop
		for(int i=0;i<arr.length;i++) {
			System.out.println("Value at Array arr "+i+" is: "+arr[i]);
		}
		for(int i=0;i<arr1.length;i++) {
			System.out.println("Value at Array arr1 "+i+" is: "+arr1[i]);
		}
		
		//Array- Strings
		String[] names= {"Neha","Kunal","Ashish"};
		for(int i=0;i<names.length;i++) {
			System.out.println("Name at Array Names "+i+" is: "+names[i]);
		}
		
		// Enhanced for loop
		for(String s:names) {
			System.out.println(s);
			
		}

	}

}
