public class User
{
	public String firstName;//fieldA
	public String lastName;//fieldB
	public boolean verified = false;

	public static void log(Object o)
   	{       
   		System.out.print(o);
	}

	public static void logln(Object o)
	{
   		System.out.println(o);
	}



	public void sayHello()
	{
		logln("Buenos Dias My name is " + firstName + " " + lastName  );
	}
}
