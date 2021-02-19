import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.Scanner;

public class UserRegisterProblem {

	public static void main(String[] args) {
                //declare password
		Scanner sc = new Scanner(System.in);
		String name;
		System.out.println("enter passward :");
		name = sc.nextLine();
		passward2(name);
	}
	public static void passward2(String name) {
                 //declare pattern
                //Pattern p = Pattern.compile("^[a-zA-Z0-9]{3}+(.{1}[a-zA-Z0-9]{3}+)*@{1}[a-zA-Z0-9]{2}+(.{1}[a-zA-Z0-9]{2}+)*(.{1}[a-zA-Z0-9]{2}+)$");
		Pattern p = Pattern.compile("^([A-Z])(?=.*[0-9])[a-zA-Z0-9]{8,}$");
                Matcher m = p.matcher(name);
		if(m.find())
		{
			System.out.println("passward is valid");
		}
		else
		{
			System.out.println("passward is invalid");
		}
		System.out.println("length :"+name.length());
	}
}
