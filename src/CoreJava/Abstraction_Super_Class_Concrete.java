package CoreJava;
//Concrete Sub Class
public class Abstraction_Super_Class_Concrete  extends Abstraction_Super_Class_Abstract{
@Override
public void run()
{
	System.out.println("Overridden test () Method");
}
	public static void main(String[] args) {
		//Up Casting- Storing Object or Instance of Child Class in Reference of Parent Class. 
		Abstraction_Super_Class_Abstract p=new Abstraction_Super_Class_Concrete();
		p.run();

	}

}
