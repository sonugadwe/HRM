package com.Pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.BaseClass.Library;

public class OrangeHRM_Login_Page extends Library {

	public OrangeHRM_Login_Page() {

		PageFactory.initElements(driver, this);
	}

	@FindBy(id = "txtUsername")
	WebElement username;

	@FindBy(id = "txtPassword")
	WebElement password;

	@FindBy(id = "btnLogin")
	WebElement login;

	public void login(String uname, String pass) {
		username.sendKeys("Admin");
		password.sendKeys("admin123");
		login.click();
	}

}
