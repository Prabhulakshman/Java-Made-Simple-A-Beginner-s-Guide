package CoreJava;

public class Association_Has_a_Relationship_SubClass  {
String name="Jerry";
	public static void main(String[] args) {
		Association_Has_a_Relationship_Super sup=new Association_Has_a_Relationship_Super();
		System.out.println("Super Class name: "+sup.name);
		System.out.println("Sub Class name: "+sup.sub.name);

	}

}
