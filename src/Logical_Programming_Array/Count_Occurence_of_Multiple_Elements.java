package Logical_Programming_Array;

public class Count_Occurence_of_Multiple_Elements {
public static int[]count_multiple(int arr[],int key[])
{
	int count=0;
	for(int i=0;i<arr.length;i++)
	{
		for(int j=0;j<key.length;j++)
		{
			if(arr[i]==key[j])
			{
				count++;
				//System.out.println("Key Element is "+key[j]+" and Occurrence of the Element are "+count);
			}
			
		}	
		System.out.println(arr[i]+" "+count);
	}
	return arr;
}
	public static void main(String[] args) {
		int a[]= {1,2,3,2,3};
		int key[]= {2,3};
		count_multiple(a,key);
	}

}
