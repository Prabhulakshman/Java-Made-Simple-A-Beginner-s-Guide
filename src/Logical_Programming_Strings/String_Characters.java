package Logical_Programming_Strings;

public class String_Characters {
public static char str(String sample)
{
	System.out.println("Characters in a Given String are: ");
	for(int i=0;i<sample.length();i++)
	{
		char ch=sample.charAt(i);
		System.out.print(ch+" ");
	}
	return 'a';
}
	public static void main(String[] args) {
		String sample="Hello world";
		str(sample);
	}

}
