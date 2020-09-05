package step;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class EditLead extends BaseClass {


	
	@And("click find leads")
	public void findlead()
	{
		driver.findElementByLinkText("Find Leads").click();
	}
	
	@And("enter first name")
	public void fname()
	{
		driver.findElementByXPath("(//input[@name='firstName'])[3]").sendKeys("ktest50");
	}
	
	@And("click find leads button")
	public void fleadclick() throws InterruptedException
	{
		driver.findElementByXPath("//button[text()='Find Leads']").click();
		Thread.sleep(2000);
	}
	
	@When("click on first resulting lead")
	public void firstlead()
	{
		driver.findElementByXPath("//div[@class='x-grid3-cell-inner x-grid3-col-partyId']/a").click();
	}
	
	@Then("verify title of the page")
	public void title()
	{
		System.out.println("title of the page is : " + driver.getTitle());
	}
	
	@And("click edit")
	public void clickedit()
	{
		driver.findElementByXPath("//a[text()='Edit']").click();
	}
	
	@And("clear the existing company name if any")
	public void clear()
	{
	 oldcmpny = driver.findElementById("updateLeadForm_companyName").getAttribute("value");
		System.out.println("old company name is " + oldcmpny );
		  driver.findElementById("updateLeadForm_companyName").clear();
		
	}
	
	@And("change company name")
	public void cmpnyname()
	{
		  bb= "Laks tech";
		  driver.findElementById("updateLeadForm_companyName").sendKeys(bb);
		  System.out.println("new company name provided is " + bb );
	}
	
	@When("click update")
	public void updateclick()
	{
		driver.findElementByXPath("//input[@type=\"submit\"][@value=\"Update\"]").click();
	}
	
	@Then("confirm the changed name appears")
	public void chngedname()
	{
		String newcmpname = driver.findElementById("viewLead_companyName_sp").getText();
		  System.out.println("new company name in view lead page is: " + newcmpname );
		  if ( oldcmpny.equals(bb)) 
			 { System.out.println ("name is not changed");} 
			 else
			 {System.out.println ("name is changed"); 
			 System.out.println("new name of the company is : "+ newcmpname);
			 }
		
	}
	
}
