package pages;

import org.openqa.selenium.WebElement;

import wdMethods.ProjectMethods;

public class CreateLeadPage extends ProjectMethods{

	public CreateLeadPage typeCompanyName(String data) {
		WebElement eleCompanyName = locateElement("id", "createLeadForm_companyName");
		type(eleCompanyName, data);
		return this;
	}
	
	public CreateLeadPage typeFirstName	(String data) {
		WebElement eleFirstName = locateElement("id", "createLeadForm_firstName");
		type(eleFirstName, data);
		return this;
	}
	public CreateLeadPage typeLastName	(String data) {
		WebElement eleLastName = locateElement("id", "createLeadForm_lastName");
		type(eleLastName, data);
		return this;
	}
	
	public CreateLeadPage clickCreateLead() {
		WebElement eleCreateLead= locateElement("class", "smallSubmit");
		click(eleCreateLead);
		return this; 
	}
	
}









