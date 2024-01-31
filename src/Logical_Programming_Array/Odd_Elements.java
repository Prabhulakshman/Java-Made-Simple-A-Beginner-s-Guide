package Logical_Programming_Array;

public class Odd_Elements {
	public static int[] odd_ele(int arr[])
	{
		System.out.println("The Odd Elements in a Given Array are: ");
		for(int i=0;i<arr.length;i++)
		{
			if(arr[i]%2!=0)
			{
				System.out.print(arr[i]+" ");
			}
		}
		return arr;
	}

	public static void main(String[] args) {
		int a[]= {1,2,3,4,5,6,7,8,9};
		odd_ele(a);
	}

}
