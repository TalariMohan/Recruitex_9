package Page_Elements_Locaters;

import org.openqa.selenium.By;


	public class Login_Page_Elements extends Base_Data {
	    // Define locators for elements
	    private By usernameLocator = By.xpath("//input[@name='email']");
	    private By passwordLocator = By.xpath("//input[@name=\"password\"]");
	    private By loginButtonLocator = By.cssSelector("button.btn.login-btn");

	    // Method to perform login action
	    public void login(String username, String password) throws InterruptedException {
	    	driver.findElement(usernameLocator).sendKeys(username);
	    	driver.findElement(passwordLocator).sendKeys(password);
	    	Thread.sleep(3000);
	    	driver.findElement(loginButtonLocator).click();
	    }
	}


