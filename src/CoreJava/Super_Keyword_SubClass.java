package CoreJava;
//Sub Class or Derived Class
public class Super_Keyword_SubClass extends Super_Keyword {
public void product()
{
	int x=10;
	int y=20;
	int prod=x*y;
	System.out.println(x);
	System.out.println(y);
	System.out.println(prod);
	System.out.println(super.x);
}
	public static void main(String[] args) {
		Super_Keyword_SubClass r=new Super_Keyword_SubClass();
		r.sum();
		r.product();

	}

}
