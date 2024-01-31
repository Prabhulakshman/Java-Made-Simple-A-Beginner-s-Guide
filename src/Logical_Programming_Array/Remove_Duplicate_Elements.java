package Logical_Programming_Array;
//It is used to Remove Duplicate Elements from a Sorted Array (Ascending Order or Descending Order).
public class Remove_Duplicate_Elements {
public static int[]remove_duplicates(int arr[])
{
	int len=arr.length;
	int temp[]=new int[len];
	int rd=0;
	temp[rd]=arr[0];
	for(int i=1;i<len;i++)
	{
		if(temp[rd]!=arr[i])
		{
			rd++;
			temp[rd]=arr[i];
			
		}
		
	}
	int result[]=new int[rd+1];
	System.arraycopy(temp, 0, result, 0, rd +1);
	return result;
}
	public static void main(String[] args) {
		int arr[]= {10,10,9,9,8,7,7,6,5};
		int result[]=remove_duplicates(arr);
		for(int value:result)
		{
			System.out.print(value+" ");
		}
		
	}

}
