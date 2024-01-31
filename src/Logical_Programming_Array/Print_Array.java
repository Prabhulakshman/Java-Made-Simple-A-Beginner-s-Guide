package Logical_Programming_Array;
import java.util.Arrays;
public class Print_Array {
	
	public static void main(String[] args) {
		int array[]= {1,3,5,7,2,3,4,5,6,7,8,0,9};
		System.out.println(array);
		for (int ele: array)
		{
			System.out.print(ele);
		}
		System.out.println();
		
		System.out.println(Arrays.toString(array));
	}

}
