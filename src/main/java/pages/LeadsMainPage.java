package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

import wdMethods.ProjectMethods;

public class LeadsMainPage extends ProjectMethods{
	
	public LeadsMainPage() {
		PageFactory.initElements(driver,this);
	}
	
		@FindBy(how=How.LINK_TEXT,using="Find Leads")
	private WebElement eleFindLead;
	
	public FindLeadPage clickFindLeads() {
		click(eleFindLead);
		return new FindLeadPage();
		
	}	
	
	
	

}
