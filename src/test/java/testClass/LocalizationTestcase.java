package testClass;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.BaseClass.Library;
import com.Pages.OrangeHRM_Login_Page;
import com.Pages.Admin.Configuration.OranageHRM_Admin_Configuration_Localization;

public class LocalizationTestcase extends Library {

	OrangeHRM_Login_Page login;
	OranageHRM_Admin_Configuration_Localization local;

	public LocalizationTestcase() {
		super();
	}

	@BeforeClass
	public void setUp() {
		browserSetUp();
		login = new OrangeHRM_Login_Page();
		local= new OranageHRM_Admin_Configuration_Localization();
		login.login("Admin", "admin123");
	}

	@Test(priority = 1)
	public void verifyOrangeHRM_Admin_AdminClick() {
		local.OrangeHRM_Admin_AdminClick();
	}

	@Test(priority = 2)
	public void user_move_to_Admin_configuration() {
		local.OrangeHRM_Admin_ConfigurationClick();
	}

	@Test(priority = 3)
	public void user_move_to_Admin_configuration_localization() {
		local.OrangeHRM_Admin_Configuration_LocalizationClick();
	}

	@Test(priority = 4)
	public void user_click_on_edit_button() {
		local.OrangeHRM_Admin_Configuration_Localization_EditButton();
	}

	@Test(priority = 5)
	public void select_langauge_from_dropdown() {
		local.OrangeHRM_Admin_Configuration_Localization_SelectLanguage("English");
	}

	@Test(priority = 6)
	public void select_checkbox() {
		local.OrangeHRM_Admin_Configuration_Localization_Checkbox();
	}

	@Test(priority = 7)
	public void select_date_format() {
		local.OrangeHRM_Admin_Configuration_Localization_SelectDateFormat(9);
	}

	@Test(priority = 8)
	public void click_on_save_button() {
		local.OrangeHRM_Admin_Configuration_Localization_SaveButton();
	}

}
