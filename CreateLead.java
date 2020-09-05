package step;

import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class CreateLead extends BaseClass {

	
	
	@When("click on crmsfa link")
	public void crmsfalink()
	{
		driver.findElementByLinkText("CRM/SFA").click();
	}
	
	@And("click on the leads tab")
	public void leadstab() 
	{
		driver.findElementByLinkText("Leads").click();
	}
	
	
	@And("click on create lead option")
	public void createlead()
	{
		driver.findElementByLinkText("Create Lead").click();
	}
	
	@And("input the company name (.*)")
	public void cmpnyname(String cname)
	{
		driver.findElementById("createLeadForm_companyName").sendKeys(cname);
	}
	
	@And("input the first name (.*)")
	public void fname(String fname)
	{
	driver.findElementById("createLeadForm_firstName").sendKeys(fname);
	}
	
	@And("input the last name (.*)")
	public void lname(String lname)
	{
		driver.findElementById("createLeadForm_lastName").sendKeys(lname);
	}
	
	@And("click on the submit button")
	public void submit()
	{
		driver.findElementByName("submitButton").click();
	}
	
	@Then("view lead page shuld be displayed")
	public void viewlead()
	{
		String Leadtitle = driver.getTitle();
		System.out.println (Leadtitle);

	}
	
	
	
}
