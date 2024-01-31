
public class Array_Creation {

	public static void main(String[] args) {
		//Array Creation
		int arr[]=new int[6];
		//Array Initializers 
		arr[0]=10;
		arr[1]=20;
		arr[2]=30;
		arr[3]=40;
		arr[4]=50;
		arr[5]=60;
		System.out.println("Size of an Array : "+arr.length);
		System.out.println("Traversing of an Elements in an Array");
		for(int i=0;i<arr.length;i++)
		{
			System.out.println(arr[i]);
		}
		
	}
	
}
