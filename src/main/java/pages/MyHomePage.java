package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

import wdMethods.ProjectMethods;

public class MyHomePage extends ProjectMethods {

	public MyHomePage() {
		PageFactory.initElements(driver, this);
	}

	@FindBy(how = How.LINK_TEXT, using = "Create Lead")
	private WebElement eleCreateLeadLink;

	public CreateLeadPage clickCreateLeadLink() {
		// WebElement eleCRMLink = locateElement("link","CRM/SFA");
		click(eleCreateLeadLink);
		return new CreateLeadPage();

	}
	
	@FindBy(how = How.LINK_TEXT, using = "Leads")
	private WebElement eleFindLeadMain;

	public LeadsMainPage clickFindLeadMain() {
		// WebElement eleCRMLink = locateElement("link","CRM/SFA");
		click(eleFindLeadMain);
		return new LeadsMainPage();

	}
	

	/*@FindBy(how = How.CLASS_NAME, using = "decorativeSubmit")
	private WebElement eleLogOut;

	public LoginPage clickLogOut() {
		// WebElement eleLogin = locateElement("class","decorativeSubmit");
		click(eleLogOut);
		return new LoginPage();
	}

	@FindBy(how = How.XPATH, using = "//h2[text()[contains(.,'Selenium Automation Engineer')]]")
	private WebElement eleLoggedName;

	public MyHome verifyLoggedName(String data) {
		verifyPartialText(eleLoggedName, data);
		return this;
	}*/

}
