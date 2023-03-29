import java.util.ArrayList;

public class CoreJavaBrushUp2 {

	public static void main(String[] args) {
		int[] arr=new int[5];
		arr[0]=23;
		arr[1]=45;
		arr[2]=12;
		arr[3]=81;
		arr[4]=22;
		//print the values that are multiple of 2
		// if Statement
		for(int i=0;i<arr.length;i++) {
			if(arr[i]%2==0) {
			System.out.println("Value at Array arr "+i+" is muliple of 2: "+arr[i]);
			}
		}
		System.out.println("**********************");
		
		//if-else Statement
		for(int x=0;x<arr.length;x++) {
			if(arr[x]%2==0) {
			System.out.println("Value at Array arr "+x+" is muliple of 2: "+arr[x]);
			}
			else
			{
				System.out.println("Value at Array arr "+x+" is not mutiple of 2: "+ arr[x]);
			}
		}
		System.out.println("**********************");
		
		// check if array has a even number than break the loop
		for(int i=0;i<arr.length;i++) {
			if(arr[i]%2==0) {
			System.out.println("Value at Array arr "+i+" is muliple of 2: "+arr[i]);
			System .out.println("Array contains even numver");
			break;
			}
		}
		
		//Arraylist
		
		ArrayList<String> a= new ArrayList<String>();
		
		//arraylist add method
		a.add("Pooja");
		a.add("Jagmit");
		a.add("Canada");
		a.add("Brampton");
		
		//arraylist remove method
		a.remove(2);
		
		//arraylist get method
		System.out.println("Person name is: "+a.get(1));
		System.out.println("Jagmit's wife: "+a.get(0));
		System.out.println("They live in: "+a.get(2));
		
		for(int j=0;j<a.size();j++) {
			System.out.println("Result: "+a.get(j));
		}	
		
		System.out.println("**********************");
		
		for (String var: a) {
			System.out.println(var);
		}
			
		//arraylist Contains method 
		System.out.println(a.contains("Canada")); 
			
			
		
		

  }
}
