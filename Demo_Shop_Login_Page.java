package pom_With_PageFactory;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Demo_Shop_Login_Page {
	
	Demo_Shop_Login_Page(WebDriver d)
	{
		PageFactory.initElements(d, this);
	}
	
	//identify Web Element
	@FindBy(id="user-name")
	private WebElement Email;
	
	@FindBy(id="password")
	private WebElement PWD;
	
	@FindBy(id="login-button")
	private WebElement Login;
	
	public void Email(String em) 
	{
		Email.sendKeys(em);
	}
	
	public void Password(String pwd) 
	{
		PWD.sendKeys(pwd);
	}
	
	public void clickOnLoginBtn() 
	{
		Login.click();	
	}
	
}
