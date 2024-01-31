package Logical_Programming_Array;

public class Array_Traversal {
public static void traversal(int[]arr)
{
	System.out.println("The Elements of Given Array are :");
	for(int i=0;i<arr.length;i++)
	{
		System.out.println(arr[i]);
	}
}
	public static void main(String[] args) {
		int[]a= {1,2,3,4,5,6,7,8,9,0};
		traversal(a);
	}

}
