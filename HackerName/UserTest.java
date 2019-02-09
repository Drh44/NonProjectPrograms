import java.util.*;
public class UserTest 
	{
		public static void main(String[] args) 
			{ // variables to be used
				String salary;
				int age;
				String name;
				String emailAddress;
				User user = new User();
				Scanner keyboard = new Scanner(System.in);
				System.out.println("Hello this program will take information from you and create you a hacker name based on it!");
				
				System.out.println("Please insert your salary");
				salary = keyboard.next();
				user.setSalary(salary);
		
				System.out.println("Please insert your age");
				age = keyboard.nextInt();
				user.setAge(age);
				
				System.out.println("Please insert your name");
				name = keyboard.next();
				user.setName(name);
		
				do {
				System.out.println("Please insert your email");
				emailAddress = keyboard.next();
					}
				while (user.setEmail(emailAddress) != true);
				
				user.setHackerName(user.getName(), user.getAge(), user.getSalary(), user.getEmailAddress());
				System.out.println(user.gethackerName());
			}
	}
