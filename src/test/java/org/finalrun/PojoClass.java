package org.finalrun;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class PojoClass extends Baseclass {
	public PojoClass() {
		PageFactory.initElements(driver, this);

	}

	@FindBy(id = "email")
	private WebElement txtemail;

	@FindBy(id = "pass")
	private WebElement txtpass;

	@FindBy(name = "login")
	private WebElement btnlogin;

	@FindBy(xpath = "//a[text()='Forgotten password?']")
	private WebElement btnfrgtpass;
	
	@FindBy(xpath="//input[@type='text']")
	private WebElement phnum;
	
	@FindBy(xpath="//button[@value='1']")
	private WebElement btnsrch;

	public WebElement getPhnum() {
		return phnum;
	}

	public WebElement getBtnsrch() {
		return btnsrch;
	}

	public WebElement getBtnfrgtpass() {
		return btnfrgtpass;
	}

	public WebElement getTxtemail() {
		return txtemail;
	}

	public WebElement getTxtpass() {
		return txtpass;
	}

	public WebElement getBtnlogin() {
		return btnlogin;
	}

}
