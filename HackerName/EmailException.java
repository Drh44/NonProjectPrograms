
public class EmailException extends Exception {
String str1;


EmailException(String str2)
{
	str1 = str2;

System.out.println(str1 + " is not a valid email address");

}
}
