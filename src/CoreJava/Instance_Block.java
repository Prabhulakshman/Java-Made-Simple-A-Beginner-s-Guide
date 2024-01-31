package CoreJava;
//Non-Static Block is also known as Instance Block.
public class Instance_Block {
//Non-Static Block or Instance Block
	{
		System.out.println("Instance Block Executed");
	}
	public static void main(String[] args) {
		System.out.println("main() method Executed");
        new Instance_Block();//Instance Block will get Executed when the Object is Created.
	}

}
