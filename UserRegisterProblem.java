import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.Scanner;

public class UserRegisterProblem {

	public static void main(String[] args) {
		//declare mobile number
		Scanner sc = new Scanner(System.in);
		String name;
		System.out.println("enter mobile number :");
		name = sc.nextLine();
		mobileno(name);
	}
	public static void mobileno(String name) {
		//Declare pattern
		Pattern p = Pattern.compile("^[9][1][\\s][7-9]{1}[0-9]{9}+$");
               //Pattern p = Pattern.compile("^[.]{1}[a-z]{3,}[@]{1}[.]{1}[.]{1}[a-z]{2,}+$");
		Matcher m = p.matcher(name);
		if(m.find())
		{
			System.out.println("mobile no is valid");
		}
		else
		{
			System.out.println("mobile no is invalid");
		}
		System.out.println("length :"+name.length());
	}
}
