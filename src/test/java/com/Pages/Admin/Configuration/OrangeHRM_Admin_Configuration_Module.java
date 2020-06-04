/**
 * 
 */
package com.Pages.Admin.Configuration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.BaseClass.Library;

/**
 * @author sonu
 *
 */
public class OrangeHRM_Admin_Configuration_Module extends Library {


	public OrangeHRM_Admin_Configuration_Module() {
		PageFactory.initElements(driver, this);
	}

	//Locators of OrangeHRM_Admin_Configuration_Modules
	
	@FindBy(id = "menu_admin_viewAdminModule")
	WebElement OrangeHRM_Admin_AdminClick;

	@FindBy(id = "menu_admin_Configuration")
	WebElement OrangeHRM_Admin_ConfigurationClick;

	@FindBy(id = "menu_admin_viewModules")
	WebElement OrangeHRM_Admin_Configuration_ModulesClick;

	@FindBy(xpath = "//input[@value='Edit']")
	WebElement Modules_EditButton;
	
	@FindBy(id = "moduleConfig_leave")
	WebElement Modules_LeaveModule_Checkbox;

	@FindBy(id = "moduleConfig_time")
	WebElement Modules_TimeModule_Checkbox;

	@FindBy(id = "moduleConfig_recruitment")
	WebElement Modules_RecruitmentModule_Checkbox;

	@FindBy(id = "moduleConfig_performance")
	WebElement Modules_PerformanceModule_Checkbox;

	@FindBy(id = "moduleConfig_directory")
	WebElement Modules_DirectoryModule_Checkbox;

	@FindBy(id = "moduleConfig_maintenance")
	WebElement Modules_MaintenanceModule_Checkbox;

	@FindBy(xpath = "//input[@class='checkbo-x']")
	WebElement Modules_AllCheckbox;
	
	@FindBy(id="btnSave")
	WebElement Modules_SaveButton;

	public void OrangeHRM_Admin_AdminClick() {
		OrangeHRM_Admin_AdminClick.click();
		
	}
	public void OrangeHRM_Admin_ConfigurationClick() {
		OrangeHRM_Admin_ConfigurationClick.click();
		
	}
	
	public void OrangeHRM_Admin_Configuration_ModulesClick() {
		OrangeHRM_Admin_Configuration_ModulesClick.click();
		
	}

	public void OrangeHRM_Admin_Configuration_Modules_EditButton() {
		Modules_EditButton.click();
	}
	
	
	public void OrangeHRM_Admin_Configuration_Modules_Select_CheckBox() {
		/*System.out.println(OrangeHRM_Admin_Configuration_Modules_AllCheckbox.getSize());
		System.out.println(OrangeHRM_Admin_Configuration_Modules_AllCheckbox.isSelected());
		OrangeHRM_Admin_Configuration_Modules_AllCheckbox.click();
		System.out.println(OrangeHRM_Admin_Configuration_Modules_AllCheckbox.isSelected());*/
		
		boolean checkBox=Modules_MaintenanceModule_Checkbox.isSelected();
		if(checkBox==false) {
			Modules_MaintenanceModule_Checkbox.click();
		}

	}
	
	public void OrangeHRM_Admin_Modules_SaveButton() {
		Modules_SaveButton.click();
	}

}
