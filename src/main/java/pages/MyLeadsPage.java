package pages;

import org.openqa.selenium.WebElement;

import wdMethods.ProjectMethods;

public class MyLeadsPage extends ProjectMethods{

	
	public CreateLeadPage clickCreateLead() {
		WebElement eleCreateLead = locateElement("linktext", "Create Lead");
		click(eleCreateLead);
		return new CreateLeadPage();
	}
	
}









