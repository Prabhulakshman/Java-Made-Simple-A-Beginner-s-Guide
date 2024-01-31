package Logical_Programming_Array;

public class Maximum_Element {
public static int max(int arr[])
{
	int max=arr[0];
	for(int i=0;i<arr.length;i++)
	{
		if(arr[i]>max)
		{
			max=arr[i];
		}
	}
	return max;
}
	public static void main(String[] args) {
		int arr[]= {1,2,3,78,35,4,5,6,7};
		int res=max(arr);
		System.out.println("Maximum Element in an Array is : "+res);
	}

}
