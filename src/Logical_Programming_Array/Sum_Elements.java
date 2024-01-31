package Logical_Programming_Array;

public class Sum_Elements {
public static int[] sum(int []arr)
{
	int sum=0;
	for(int i=0;i<arr.length;i++)
	{
		sum=sum+arr[i];
	}
	System.out.println("Sum of Array Elements in Given Array is "+sum);
	return arr;
}
	public static void main(String[] args) {
		int a[]= {1,2,3,4,5};
		sum(a);
		}

}
