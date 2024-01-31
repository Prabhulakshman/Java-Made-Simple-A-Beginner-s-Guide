package LeetCode_Challenges;
import java.util.HashSet;
public class Single_Number {
	//Linear Time Complexity 
	//O(N)
public static int single_num(int arr[])
{
	if(arr.length==1)
	{
		return arr[0];
	}
	HashSet<Integer> s=new HashSet<Integer>();
	for(int i=0;i<arr.length;i++)
	{
		if(s.contains(arr[i]))
		{
			s.remove(arr[i]);
		}
		else
		{
			s.add(arr[i]);
		}
	}
	return s.iterator().next();
}
	public static void main(String[] args) {
		int arr[]= {2,3,2,3,1,4,5,1,4,0,0,5,12};
		int res=single_num(arr);
		System.out.println("Single Element in a Given Array is: ");
		System.out.println(res);
	}

}
