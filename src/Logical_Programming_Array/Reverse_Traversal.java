package Logical_Programming_Array;

public class Reverse_Traversal {
public static int[] reverse_traversal(int [] arr)
{
	System.out.println("The Elements in the Given Array in Rever Order: ");
	for(int i=arr.length-1;i>=0;i--)
	{
		System.out.print(arr[i]+" ");
	}
	return arr;
}
	public static void main(String[] args) {
		int a[]= {0,2,4,6,8,10};
		reverse_traversal(a);
	}

}
