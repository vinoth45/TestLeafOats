package tests;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import pages.MyHomePage;
import wdMethods.ProjectMethods;

public class TC001_CreateLead extends ProjectMethods {
	
	@BeforeClass
	public void setData() {
		testCaseName = "TC001_CreateLead";
		testCaseDescription ="Create a lead";
		category = "Smoke";
		author= "Babu";
		dataSheetName="TC001";
	}
	@Test(dataProvider="fetchData")
	public  void createLead(String cname, String fname, String lname, String email)   {
		new MyHomePage()
		.clickLeads()
		.clickCreateLead()
		.typeCompanyName(cname)
		.typeFirstName(fname)
		.typeLastName(lname)
		.clickCreateLead();
		
		
	}
	

}
