import java.util.*;

public class MyAwesomeProg
{
	public static void log(Object o)
   	{       
   		System.out.print(o);
	}

	public static void logln(Object o)
	{
   		System.out.println(o);
	}
    
	public static void main(String [] args)
	{
		//Object user#1
		User myself = new User();
		myself.setFirstName("Omar");
		myself.setLastName("Belkady");
		
		
		//Object user#2
		User him = new User();
		him.setFirstName("Omar ");
		him.setLastName("Belkady");

		//List of  user Objects		
		List<User> users = new ArrayList<User>();
		users.add(myself);
		users.add(him);

	}
}
