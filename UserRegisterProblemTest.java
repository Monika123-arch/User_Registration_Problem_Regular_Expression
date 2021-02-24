package com.userregistration;
import java.util.Scanner;
import org.junit.Assert;
import org.junit.Test;

public class UserRegtrationTest {

    @Test
    public void nameValid() {
        UserRegistration checkName = new UserRegistration();
        Boolean mood = checkName.nameValid("Monika");
        Assert.assertEquals(true, mood);
    }
    
    @Test
    public void lastValid() {
        UserRegistration checkLastName = new UserRegistration();
        Boolean mood = checkLastName.nameValid("Kale");
        Assert.assertEquals(true, mood);
    }

    @Test
    public void emailValid() {
        UserRegistration checkEmail = new UserRegistration();
        Boolean mood = checkEmail.emailValid("abc.monika@bl.co.in");
        Assert.assertEquals(true, mood);
    }

    @Test
    public void phoneValid() {
        UserRegistration checkPhone = new UserRegistration();
        Boolean mood = checkPhone.phoneValid("91 9420875634");
        Assert.assertEquals(true, mood);
    }

    @Test
    public void passwordValid() {
        UserRegistration checkPassword = new UserRegistration();
        Boolean mood = checkPassword.passwordValid("ssd#");
        Assert.assertEquals(true, mood);
    }
    
    @Test
    public void happy_ShouldReturnHappy() {
        UserRegistration moodAnalyser = new UserRegistration();
        String mood = moodAnalyser.analyseMood("this is a Happy Message");
        Assert.assertEquals("HAPPY", mood);
    }
    @Test
    public void sad_ShouldReturnSad() {
        UserRegistration moodAnalyser = new UserRegistration();
        String mood = moodAnalyser.analyseMood("this is is Sad Message");
        Assert.assertEquals("SAD", mood);
    }
    @Test
    public void allemailValid() {
        UserRegistration checkEmail = new UserRegistration();
        Scanner sc = new Scanner(System.in);
        System.out.println("enter any gmail :");
        String gmail = sc.nextLine();
		Boolean mood = checkEmail.allemailValid(gmail);
        Assert.assertEquals(true, mood);
    }
}
