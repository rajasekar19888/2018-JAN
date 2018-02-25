package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

import wdMethods.ProjectMethods;

public class CreateLeadPage extends ProjectMethods {

	public CreateLeadPage() {
		PageFactory.initElements(driver, this);
	}

	@FindBy(how = How.ID, using = "createLeadForm_companyName")
	private WebElement eleCompanyName;

	public CreateLeadPage enterCompanyName(String data) {
		// WebElement eleCRMLink = locateElement("link","CRM/SFA");
		type(eleCompanyName, data);
		return this;

	}

	@FindBy(how = How.ID, using = "createLeadForm_firstName")
	private WebElement eleFirstName;

	public CreateLeadPage enterFirstName(String data) {
		// WebElement eleCRMLink = locateElement("link","CRM/SFA");
		type(eleFirstName, data);
		return this;

	}

	@FindBy(how = How.ID, using = "createLeadForm_lastName")
	private WebElement eleLastName;

	public CreateLeadPage enterLastName(String data) {
		// WebElement eleCRMLink = locateElement("link","CRM/SFA");
		type(eleLastName, data);
		return this;

	}

	@FindBy(how = How.ID, using = "createLeadForm_primaryPhoneNumber")
	private WebElement eleTelPhNum;

	public CreateLeadPage enterTelPhNum(String data) {
		type(eleTelPhNum, data);
		return this;

	}
	
	@FindBy(how = How.ID, using = "createLeadForm_primaryEmail")
	private WebElement elePrimEmail;

	public CreateLeadPage enterPrimEmail(String data) {
		type(elePrimEmail, data);
		return this;

	}
	
	@FindBy(how = How.ID, using = "createLeadForm_generalCountryGeoId")
	private WebElement eleCountryDropDown;

	public CreateLeadPage selectValFromCountryDropDown(String data) {
		selectDropDownUsingText(eleCountryDropDown, data);
		return this;

	}
	
	@FindBy(how = How.ID, using = "createLeadForm_generalStateProvinceGeoId")
	private WebElement eleStateDropDown;

	public CreateLeadPage selectValFromStateDropDown(String data) {
		selectDropDownUsingText(eleStateDropDown, data);
		return this;

	}
	
	@FindBy(how = How.ID, using = "createLeadForm_generalPostalCode")
	private WebElement eleZipCode;

	public CreateLeadPage enterZipCode(String data) {
		type(eleZipCode, data);
		return this;

	}
	
	@FindBy(how = How.ID, using = "createLeadForm_generalCity")
	private WebElement eleCity;

	public CreateLeadPage enterCity(String data) {
		type(eleCity, data);
		return this;

	}

	@FindBy(how = How.NAME, using = "submitButton")
	private WebElement eleCLButton;

	public ViewLeadPage clickCreateLeadButton() {
		// WebElement eleCRMLink = locateElement("link","CRM/SFA");
		click(eleCLButton);
		return new ViewLeadPage();

	}

}
