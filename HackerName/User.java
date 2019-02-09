/**
 * program to take user information and create a hacker name
 * @author Dylan Hesser
 *
 */
public class User 
	{
		//variables to be set
		private String name;
		private int age;
		private int salary;
		private String emailAddress;
		private String hackerName;
		// will set the salary, if a number isn't what is entered will tell user and then exit
		public boolean setSalary(String newSalary)
			{
			//tries to convert the string, if not a number will catch it
				try 
					{
						salary = Integer.parseInt(newSalary);
						return true;
					}
				catch (NumberFormatException e) 
					{
						System.out.print("Not a number\n");
						System.exit(1);
						return false;
					}
			}
	/**
	 * sets the age variable
	 * @param newAge variable to be used
	 */
		public void setAge(int newAge) 
			{
				this.age = newAge;
			}
	/**
	 * creates the hacker name with the given parameters
	 * @param name name to be used
	 * @param newAge age to be used
	 * @param salary salary to be used
	 * @param emailAddress email address to be used
	 * @return the created hacker name
	 */
	public String setHackerName(String name, int newAge, int salary, String emailAddress)
		{
			int emailShortened = emailAddress.indexOf("@");
			if ( newAge < 15) 
				{
					hackerName = name.substring(2) + "Acid" + newAge + "Dragon" + salary + "Spitter" + emailAddress.substring(0, emailShortened);
				}
			else if ( (newAge > 15) && ( newAge < 45))
					{
						hackerName = name.substring(3) + "River" + salary + "Dance" + newAge + "Man" + emailAddress.substring(0, emailShortened);
					}
			
			else if (newAge > 45)
				{
					hackerName = name.substring(2) + "GrandMaster" + salary + "Main" + newAge + "Moon" + emailAddress.substring(0, emailShortened);
				}
			
			return hackerName;
		}
	/**
	 * sets the name of the user
	 * @param newName name to be used
	 */
	public void setName(String newName) 
		{
			this.name = newName;
		}
	
	/**
	 * sets the email, if the string entered isn't an email address prints error and asks again
	 * @param newEmail
	 * @return
	 */
	public boolean setEmail(String newEmail)
		{
			int i;
			int j;
			boolean answer = false;
		//uses loops to check for @ and . (two things found in all emails
			try 
				{
					for (i = 0; i < newEmail.length(); i++) 
						{
							if ( newEmail.charAt(i) == '@' ) 
								{
									for (j = 0; j < newEmail.length(); j++) 
										{
											if( newEmail.charAt(j) == '.') 
												{
													emailAddress = newEmail;
													answer = true;
												}
										}
								}
						}
					//if both @ and . aren't found, throws the error
					if (answer != true) 
						{
							throw new EmailException(newEmail);
						}
				}
			catch(EmailException e) 
				{
					System.out.println(e);
					answer = false;
				}
			return answer;
		
		}
	/**
	 * gets the salary
	 * @return salary
	 */
		public int getSalary ()
			{
				return salary;
			}

	/**
	 * gets the age
	 * @return age 
	 */
		public int getAge ()
			{
				return age;
			}
	
	
	
	/**
	 * gets the hacker name that was created
	 * @return hacker name
	 */
		public String gethackerName() 
			{
				return hackerName;
			}
	
	/**
	 * gets the name
	 * @return name
	 */
		public String getName() 
			{
				return name;
			}
	/**
	 * gets the email address
	 * @return email address
	 */
		public String getEmailAddress() 
			{
				return emailAddress;
			}

	}
