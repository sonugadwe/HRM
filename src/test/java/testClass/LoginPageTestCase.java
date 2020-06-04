package testClass;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.BaseClass.Library;
import com.Pages.OrangeHRM_Login_Page;

public class LoginPageTestCase extends Library {
	OrangeHRM_Login_Page loginPage=new OrangeHRM_Login_Page();

	public LoginPageTestCase() {
		super(); // it will called super class library of constructor and call property file
	}

	/*@BeforeClass
	public void setUp() {
		// method is coming from Test base class it will called initialization method
		browserSetUp();
		// log.info("I am in login page");
		loginPage = new OrangeHRM_Login_Page();
	}*/

	@Test(priority = 1)
	public void loginTest() {
		loginPage.login("Admin", "admin123");
	}

}
