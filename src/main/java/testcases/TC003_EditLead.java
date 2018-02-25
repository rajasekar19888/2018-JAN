package testcases;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import pages.LoginPage;
import wdMethods.ProjectMethods;

public class TC003_EditLead extends ProjectMethods {
	@BeforeTest
	public void setData() {
		testCaseName = "TC002_CreateLead";
		testDescription = "Create a Lead";
		testNodes = "Leads";
		category = "Smoke";
		authors = "Rajasekar";
		browserName = "chrome";
		dataSheetName = "TC004";
	}

	@Test(dataProvider="fetchData")
	public void editLead(String uName,String pwd,String vName, String fName, String cName) {
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
		.clickFindLeadMain()
		.clickFindLeads()
		.enterFLFirstName(fName)
		.clickFLFindLeadsButton()
		.clickFirstLeadID()
		.clickEditButtone()
		.updateCompanyName(cName)
		.clickELUpdateButton()
		.verifyVLCompanyName(cName);
		
	}

}
