package Logical_Programming_Array;

import java.util.Arrays;

public class Multi_Dimensional_Array {
	//Two Dimensional Array
public static int [][]  multi(int arr[][])
{
	for(int i=0;i<arr.length;i++)
	{
		for(int j=0;j<arr.length;j++)
		{
			System.out.print(arr[i][j]+" ");
		}
	}
	return arr;
}
public static int [][][]  multi_dim(int arr[][][])
{
	for(int i=0;i<arr.length;i++)
	{
		for(int j=0;j<arr.length;j++)
		{
			for(int k=0;k<arr.length;k++)
			{
			System.out.print(arr[i][j][k]+" ");
			}
		}
	}
	return arr;
}
	public static void main(String[] args) {
		int arr[][]= {{1,2,3},{4,5,6},{7,8,9}};
		System.out.println(Arrays.deepToString(arr));
		int array[][]=multi(arr);
		System.out.println();
		System.out.println(array);
		System.out.println(Arrays.deepToString(array));
		
		int array3[][][]= {{{1,2,3},{1,2,3}},{{4,5,6},{7,8,9}}};
		System.out.println(Arrays.deepToString(arr));
		int array_res[][][]=multi_dim(array3);
		System.out.println();
		System.out.println(array_res);
		System.out.println(Arrays.deepToString(array_res));
	}

}
