package com.page_object;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class Login_pom {
	@FindBy(how=How.XPATH,using="//input[@id='emai']")
    private WebElement email;
    
	@FindBy(how=How.XPATH,using="//input[@id='pass']")
    private WebElement password;
    
	@FindBy(how=How.XPATH,using="//button[@name='login']")
    private WebElement login_btn;

	public WebElement getEmail() {
		return email;
	}

	public WebElement getPassword() {
		return password;
	}
	
	public WebElement getLogin_btn() {
		return login_btn;
	}

	
	
	
    
    
}
