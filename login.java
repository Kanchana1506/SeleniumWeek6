package step;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.java.en.And;
import cucumber.api.java.en.But;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class login extends BaseClass {

	

	@Given("open chrome browser")
	public void openbrowser()
	{
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\User\\Desktop\\MAVEN\\MavenPrject\\drivers\\chromedriver.exe");
		driver = new ChromeDriver();
	}

	@And("provide the url")
	public void provideurl()
	{
		driver.get("http://leaftaps.com/opentaps/control/main");
	}

	@And("maxmize the browser")
	public void maximize()
	{
		driver.manage().window().maximize();
	}

	@And("apply implicit wait")
	public void applywait()
	{
		driver.manage().timeouts().implicitlyWait(60,TimeUnit.SECONDS);
	}

	//if round braces are not given data will not be passed
	@And("enter the username as (.*)")
	public void username(String uname)
	{
		driver.findElementById("username").sendKeys(uname);
		//System.out.println("username" + data);
	}


	@And("enter the password as (.*)")
	public void password(String pwd)
	{
		//System.out.println("pwd"+ data);
		driver.findElementById("password").sendKeys(pwd);
	}

	@When("click on login button")
	public void clicklogin()
	{
		driver.findElementByClassName("decorativeSubmit").click();
	}

	@Then("the home page should be displayed")
	public void homepage()
	{
		System.out.println("home page");
	}

	@But("error message should be displayed")
	public void errormsg()
	{
		System.out.println("error");
	}
}


