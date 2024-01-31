package Logical_Programming_Array;

public class Product_Array {
public static int[] product(int arr[])
{
	int product=1;
	for(int i=0;i<arr.length;i++)
	{
		product=product*arr[i];
	}
	System.out.println("The Product of Elements of a Given Array is"+product);
	return arr;
}
	public static void main(String[] args) {
		int a[]= {1,2,3,4,5};
		product(a);
	}

}
