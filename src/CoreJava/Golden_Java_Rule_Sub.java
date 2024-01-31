package CoreJava;

public class Golden_Java_Rule_Sub extends Golden_Java_Rule_Super{
@Override
public void run()
{
	System.out.println("Overidden Implementation");
}
	public static void main(String[] args) {
		System.out.println("Golden Java Rule");
	//Up Casting
		Golden_Java_Rule_Super s=new Golden_Java_Rule_Sub();
		s.run();
		//If we use an Up Casted Reference Variable and call the overridden method we get the Overridden implementation only.

	}

}
