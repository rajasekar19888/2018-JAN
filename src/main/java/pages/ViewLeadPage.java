package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

import wdMethods.ProjectMethods;

public class ViewLeadPage extends ProjectMethods {

	public ViewLeadPage() {
		PageFactory.initElements(driver, this);
	}

	public ViewLeadPage verifyVLTitle(String data) {
		// WebElement eleCRMLink = locateElement("link","CRM/SFA");
		verifyTitle(data);
		return this;

	}
	
	@FindBy(how = How.ID, using = "viewLead_companyName_sp")
	private WebElement eleVLCompanyName;
	
	public ViewLeadPage verifyVLCompanyName(String data) {
		// WebElement eleCRMLink = locateElement("link","CRM/SFA");
		verifyPartialText(eleVLCompanyName, data);
		return this;

	}
	
	@FindBy(how = How.XPATH, using = "//a[text()='Edit']")
	private WebElement eleEditButton;

	public EditLeadPage clickEditButtone() {
		// WebElement eleCRMLink = locateElement("link","CRM/SFA");
		click(eleEditButton);
		return new EditLeadPage();

	}
	

}
