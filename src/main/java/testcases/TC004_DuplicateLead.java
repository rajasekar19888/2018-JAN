package testcases;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import pages.LoginPage;
import wdMethods.ProjectMethods;

public class TC004_DuplicateLead extends ProjectMethods {
	@BeforeTest
	public void setData() {
		testCaseName = "TC002_CreateLead";
		testDescription = "Create a Lead";
		testNodes = "Leads";
		category = "Smoke";
		authors = "Rajasekar";
		browserName = "chrome";
		dataSheetName = "TC003";
	}

	@Test(dataProvider="fetchData")
	public void CreateLead(String uName,String pwd,String vName, String cName, String fName, String lName, String phNumber, String primEmail, String cDropDown, String sDropDown, String zipCode, String city) {
		/*LoginPage lp = new LoginPage();
		lp.enterUserName();
		lp.enterPassword();
		lp.clickLogIn();*/
		
		new LoginPage()
		.enterUserName(uName)
		.enterPassword(pwd)
		.clickLogIn()
		.verifyLoggedName(vName)
		.clickCRMSFALink()
		.clickCreateLeadLink()
		.enterCompanyName(cName)
		.enterFirstName(fName)
		.enterLastName(lName)
		.enterTelPhNum(phNumber)
		.enterPrimEmail(primEmail)
		.selectValFromCountryDropDown(cDropDown)
		.selectValFromStateDropDown(sDropDown)
		.enterZipCode(zipCode)
		.enterCity(city)
		.clickCreateLeadButton();		
		
	}

}
