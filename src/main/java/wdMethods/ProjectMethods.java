package wdMethods;

import org.openqa.selenium.WebElement;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Parameters;

import utils.DataInputProvider;

public class ProjectMethods extends SeMethods{

	public String dataSheetName;
	@Parameters({"url","uname","pwd"})
	@BeforeMethod
	public void login(String url, String userName, String passWord) {
		startApp("chrome", url);
		WebElement eleUserName = locateElement("id", "username");
		type(eleUserName, userName);
		WebElement elePassword = locateElement("id","password");
		type(elePassword, passWord);
		WebElement eleLogin = locateElement("class","decorativeSubmit");
		click(eleLogin);
		WebElement eleCRM = locateElement("linktext","CRM/SFA");
		click(eleCRM);
	}
	
	@AfterMethod(groups="common")
	public void close() {
		closeAllBrowsers();
	}
	
	@DataProvider(name="fetchData")
	public String[][] getData() {
	return DataInputProvider.getSheet(dataSheetName);
	}
	
	
	
	
	
	
	
	
	
}