import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.Scanner;

public class UserRegisterProblem {

	public static void main(String[] args) {
               //Declare email id
		Scanner sc = new Scanner(System.in);
		String name;
		System.out.println("enter email id :");
		name = sc.nextLine();
		email(name);
	}
	public static void email(String name) {
                //Declare pattern
                Pattern p = Pattern.compile("^[a-zA-Z0-9]{3}+(.{1}[a-zA-Z0-9]{3}+)*@{1}[a-zA-Z0-9]{2}+(.{1}[a-zA-Z0-9]{2}+)*(.{1}[a-zA-Z0-9]{2}+)$");
		Matcher m = p.matcher(name);
		if(m.find())
		{
			System.out.println("email is valid");
		}
		else
		{
			System.out.println("email is  invalid");
		}
		System.out.println("length :"+name.length());
	}
}
