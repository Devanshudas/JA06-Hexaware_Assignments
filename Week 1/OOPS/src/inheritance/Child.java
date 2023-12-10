package inheritance;

public class Child extends Parent
{
	int cid = 101;
	public Child()
	{
		super();
		System.out.println("Child obj is created");
	}
	public static void main(String[] args) 
	{
		Child c  = new Child();
		System.out.println(c.cid);
		System.out.println(c.pid);
		System.out.println(c);


		
	}

}
