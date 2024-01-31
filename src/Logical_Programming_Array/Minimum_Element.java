package Logical_Programming_Array;

public class Minimum_Element {
public static int min(int arr[])
{
	int min=arr[0];
	for(int i=0;i<arr.length;i++)
	{
		if(arr[i]<min)
		{
			min=arr[i];
		}
	}
	return min;
}
	public static void main(String[] args) {
		int arr[]= {18,9,4,2,5,3,5,7,9,8};
		int res=min(arr);
		System.out.println("Minimum Element in a Given Array is : "+res);
	}

}
