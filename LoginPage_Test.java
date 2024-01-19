package pom_With_PageFactory;

import java.time.Duration;

import org.openqa.selenium.firefox.FirefoxDriver;

public class LoginPage_Test {

	public static void main(String[] args) {
		FirefoxDriver d = new FirefoxDriver();
		d.manage().window().maximize();
		d.get("https://www.saucedemo.com/");
		d.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));

		Demo_Shop_Login_Page a = new Demo_Shop_Login_Page(d);
		a.Email("standard_user");
		a.Password("secret_sauce");
		a.clickOnLoginBtn();
		
		d.quit();
	}

}
