package pages;

import org.openqa.selenium.WebElement;

import wdMethods.ProjectMethods;

public class HomePage extends ProjectMethods{

	
	public MyHomePage clickCRMSFA() {
		WebElement eleCRMSFA = locateElement("linktext", "CRM/SFA");
		click(eleCRMSFA);
		return new MyHomePage();
	}
	
}









