package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

import wdMethods.ProjectMethods;

public class FindLeadPage extends ProjectMethods {

	public FindLeadPage() {
		PageFactory.initElements(driver, this);
	}

	@FindBy(how = How.XPATH, using = "(//input[@name='firstName'])[3]")
	private WebElement eleFLFirstName;

	public FindLeadPage enterFLFirstName(String data) {
		// WebElement eleCRMLink = locateElement("link","CRM/SFA");
		type(eleFLFirstName, data);
		return this;

	}
	
	@FindBy(how = How.XPATH, using = "//button[text()='Find Leads']")
	private WebElement eleFLFindLeadsButton;

	public FindLeadPage clickFLFindLeadsButton() {
		// WebElement eleCRMLink = locateElement("link","CRM/SFA");
		click(eleFLFindLeadsButton);
		return this;

	}
	
	@FindBy(how = How.XPATH, using = "(//div[@class='x-grid3-cell-inner x-grid3-col-partyId']/a)[1]")
	private WebElement eleFLFindFirstLeadID;

	public ViewLeadPage clickFirstLeadID() {
		// WebElement eleCRMLink = locateElement("link","CRM/SFA");
		click(eleFLFindFirstLeadID);
		return new ViewLeadPage();

	}
	
	

}
