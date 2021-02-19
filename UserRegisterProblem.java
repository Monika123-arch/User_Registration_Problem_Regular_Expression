import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.Scanner;

public class UserRegisterProblem {

	public static void main(String[] args) {
		//Declare last name
		Scanner sc = new Scanner(System.in);
		String name;
		System.out.println("enter last name :");
		name = sc.nextLine();
		lastname(name);
	}
	public static void lastname(String name) {
		//Declare pattern
		Pattern p = Pattern.compile("^[A-Z]{1}[A-Za-z]{2,}+$");
		Matcher m = p.matcher(name);
		if(m.find())
		{
			System.out.println("lastname is valid");
		}
		else
		{
			System.out.println("lastname is invalid");
		}
		System.out.println("length :"+name.length());
	}
}
