package Logical_Programming_Array;
import java.util.Arrays;
public class Sorting_Arrays {
public static int[]sort(int arr[])
{
	Arrays.sort(arr);
	return arr;
}
	public static void main(String[] args) {
		int arr[]=new int[] {0,7,3,5,1,2,6,8};
		int res[]=sort(arr);
		System.out.println("Sorted Array in Ascending Order: ");
		//for each loop iterates in increasing order only
		for(int ele:res)
		{
			System.out.print(ele+" ");
		}
		System.out.println();
		System.out.println("Sorted Array in Descending Order: ");
		//for loop can traverse in reverse order also
		for(int i=res.length-1;i>=0;i--)
		{
			System.out.print(res[i]+" ");
		}
	}

}
