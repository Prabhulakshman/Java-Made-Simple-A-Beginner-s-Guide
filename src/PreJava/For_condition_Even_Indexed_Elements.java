package PreJava;

public class For_condition_Even_Indexed_Elements {

	public static void main(String[] args) {
		int arr[]= {1,2,3,4,5,6,7,8,9,0};
		for(int i=0;i<arr.length;i+=2)
		{
			System.out.println(arr[i]);
		}
	}

}
