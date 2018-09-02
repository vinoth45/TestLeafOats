package pages;

import org.openqa.selenium.WebElement;

import wdMethods.ProjectMethods;

public class LogInPage extends ProjectMethods{

	public LogInPage typeUserName(String data) {
		WebElement eleUserName = locateElement("id", "username");
		type(eleUserName, data);
		return this;
	}
	
	public LogInPage typePassword(String data) {
		WebElement elePassword = locateElement("id", "password");
		type(elePassword, data);
		return this;
	}
	
	public HomePage clickLogin() {
		WebElement eleLogin = locateElement("class", "decorativeSubmit");
		click(eleLogin);
		return new HomePage();
	}
	
}









