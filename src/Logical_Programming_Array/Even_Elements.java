package Logical_Programming_Array;

import java.util.Arrays;

public class Even_Elements {
public static int[] even_ele(int arr[])
{
	System.out.println("The Even Elements oin a Given Array are: ");
	for(int i=0;i<arr.length;i++)
	{
		if(arr[i]%2==0)
		{
			System.out.print(arr[i]+" ");
		}
	}
	return arr;
}
	public static void main(String[] args) {
		int a[]= {1,2,3,4,5,6,7,8,9,0};
		int arr[]=even_ele(a);
		System.out.println();
		System.out.println(Arrays.toString(arr));
	}

}
