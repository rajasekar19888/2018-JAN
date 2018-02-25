package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

import wdMethods.ProjectMethods;

public class EditLeadPage extends ProjectMethods {

	public EditLeadPage() {
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(how = How.ID, using = "updateLeadForm_companyName")
	private WebElement eleELCompanyName;

	public EditLeadPage updateCompanyName(String data) {
		// WebElement eleCRMLink = locateElement("link","CRM/SFA");
		type(eleELCompanyName, data);
		return this;

	}
	
	@FindBy(how = How.XPATH, using = "(//input[@name='submitButton'])[1]")
	private WebElement eleELUpdateButton;

	public ViewLeadPage clickELUpdateButton() {
		// WebElement eleCRMLink = locateElement("link","CRM/SFA");
		click(eleELUpdateButton);
		return new ViewLeadPage();

	}
	

}
