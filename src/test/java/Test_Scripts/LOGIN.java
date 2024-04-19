package Test_Scripts;


import org.testng.annotations.Test;
import Page_Elements_Locaters.Base_Data;
import Page_Elements_Locaters.Login_Page_Elements;



public class LOGIN extends Base_Data { 
	
	@Test
	public void USER_login() throws Exception {
		Login_Page_Elements loginPage = new Login_Page_Elements();
		loginPage.login("mohan.talari@ojas-it.com","mohan@1234");
		
	}
}
