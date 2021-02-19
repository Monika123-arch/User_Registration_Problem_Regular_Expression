import java.util.regex.Pattern;
import java.util.regex.Matcher;
import java.util.Scanner;

public class UserRegisterProblem {

	public static void main(String[] args) {
		//Declare first  name
		Scanner sc = new Scanner(System.in);
		String name;
		System.out.println("enter first name :");
		name = sc.nextLine();
		firstname(name);
	}
	public static void firstname(String name) {
                //Declare pattern
		Pattern p = Pattern.compile("^[A-Z]{1}[A-Za-z]{2,}+$");
		Matcher m = p.matcher(name);
		if(m.find())
		{
			System.out.println("name is valid");
		}
		else
		{
			System.out.println("name is invalid");
		}
		System.out.println("length :"+name.length());
	}
}
