package Logical_Programming_Array;

public class Traversal_Elements {
public static int [] traversal(int[]arr)
{
	System.out.println("The Elements in a Given Array are: ");
	for(int i=0;i<arr.length;i++)
	{
	System.out.println(arr[i]);
	}
	return arr;
}
	public static void main(String[] args) {
		int [] a= {10,20,30,40,50,60,70,80,90,100};
		traversal(a);
	}

}
