package testClass;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.BaseClass.Library;
import com.Pages.OrangeHRM_Login_Page;
import com.Pages.Admin.Configuration.OranageHRM_Admin_Configuration_Localization;
import com.Pages.Admin.Configuration.OrangeHRM_Admin_Configuration_Module;

public class ModulesTestcase extends Library{
	OrangeHRM_Login_Page login;
	OranageHRM_Admin_Configuration_Localization local;
	OrangeHRM_Admin_Configuration_Module module;

	public ModulesTestcase() {
		super();
	}

	@BeforeClass
	public void setUp() {
		browserSetUp();
		login = new OrangeHRM_Login_Page();
		//local= new OranageHRM_Admin_Configuration_Localization();
		module=new OrangeHRM_Admin_Configuration_Module();
		login.login("Admin", "admin123");
	}

	@Test(priority = 1)
	public void verifyOrangeHRM_Admin_AdminClick() {
		module.OrangeHRM_Admin_AdminClick();
	}

	@Test(priority = 2)
	public void user_move_to_Admin_configuration() {
		module.OrangeHRM_Admin_ConfigurationClick();
	}
	
	@Test(priority = 3)
	public void user_move_to_Admin_configuration_Modules() {
		module.OrangeHRM_Admin_Configuration_ModulesClick();
	}

	@Test(priority = 4)
	public void user_click_on_edit_button() {
		module.OrangeHRM_Admin_Configuration_Modules_EditButton();
	}

	@Test(priority = 5)
	public void select__checkbox() {
		module.OrangeHRM_Admin_Configuration_Modules_Select_CheckBox();
	}

	

	@Test(priority = 6)
	public void click_on_save_button() {
		module.OrangeHRM_Admin_Modules_SaveButton();
	}

}

