package Logical_Programming_Array;

public class Copy_Array {
public static int[]copy(int arr[])
{
	int len=arr.length;
	int cpy[]=new int [len];
	for(int i=0;i<arr.length;i++)
	{
		for(int j=0;j<len;j++)
		{
		cpy[j]=arr[i];
		}
	}
	return cpy;
}
	public static void main(String[] args) {
		int arr[]= {1,2,3,4,5};
		int res[]=copy(arr);
		for(int ele:res)
		{
			System.out.print(ele+" ");
		}
	}

}
