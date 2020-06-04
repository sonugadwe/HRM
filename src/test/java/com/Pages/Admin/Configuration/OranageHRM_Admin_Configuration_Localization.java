
package com.Pages.Admin.Configuration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import com.BaseClass.Library;

/**
 * @author sonu
 *
 */
public class OranageHRM_Admin_Configuration_Localization extends Library {

	public OranageHRM_Admin_Configuration_Localization() {
		PageFactory.initElements(driver, this);
	}

	@FindBy(id = "menu_admin_viewAdminModule")
	WebElement OrangeHRM_Admin_AdminClick;

	@FindBy(id = "menu_admin_Configuration")
	WebElement OrangeHRM_Admin_ConfigurationClick;

	@FindBy(id = "menu_admin_localization")
	WebElement OrangeHRM_Admin_Configuration_LocalizationClick;

	@FindBy(xpath = "//input[@value='Edit']")
	WebElement Localization_EditButton;

	@FindBy(id = "localization_dafault_language")
	WebElement Localization_SelectLanguage_Dropdown;
	
	@FindBy(id = "localization_use_browser_language")
	WebElement OrangeHRM_Admin_Configuration_Localization_Checkbox;

	@FindBy(id = "localization_default_date_format")
	WebElement Localization_SelectDateFormat_Dropdown;

	@FindBy(linkText = "Supported languages")
	WebElement Localization_SupportedLanguageClick;

	@FindBy(id = "btnSave")
	WebElement Localization_SaveButton;


	public void OrangeHRM_Admin_AdminClick() {
		OrangeHRM_Admin_AdminClick.click();
		
	}
	public void OrangeHRM_Admin_ConfigurationClick() {
		OrangeHRM_Admin_ConfigurationClick.click();
		
	}
	
	public void OrangeHRM_Admin_Configuration_LocalizationClick() {
		OrangeHRM_Admin_Configuration_LocalizationClick.click();
		
	}
	
	public void OrangeHRM_Admin_Configuration_Localization_EditButton() {
		Localization_EditButton.click();
	}
	
	public void OrangeHRM_Admin_Configuration_Localization_SelectLanguage(String languageName) {
		Select statusDropdown = new Select(Localization_SelectLanguage_Dropdown);
		statusDropdown.selectByVisibleText(languageName);
	}
	public void OrangeHRM_Admin_Configuration_Localization_Checkbox() {
		OrangeHRM_Admin_Configuration_Localization_Checkbox.click();
	}
	
	public void OrangeHRM_Admin_Configuration_Localization_SelectDateFormat(int index) {
		Select dropdown = new Select(Localization_SelectDateFormat_Dropdown);
		dropdown.selectByIndex(index);
	}

	/*
	 * @FindBy(xpath="//a[text()="Supported languages"]")
	 * WebElement language;
	 * public void OrangeHRM_Admin_Configuration_Localization_Checkbox()
	 *  { 
	 *  	if(OrangeHRM_Admin_Configuration_Localization_Checkbox.isSelected()) 
	 * 			 {  OrangeHRM_Admin_Configuration_Localization_Checkbox.click();
	 * 					language.click(); 
	 * 					Alert alert=driver.switchTo().alert();
	 * 					alert.accept();
	 * 			 } 
	 * 	}
	 */
	public void OrangeHRM_Admin_Configuration_Localization_SaveButton() {
		Localization_SaveButton.click();
	}

}
