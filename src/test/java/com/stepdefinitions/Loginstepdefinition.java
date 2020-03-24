package com.stepdefinitions;



import com.pages.LoginFromExcelPage;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.When;

public class Loginstepdefinition {
	
	LoginFromExcelPage page = new LoginFromExcelPage();
	@Given("^open the url in a browser$")
	public void open_the_url_in_a_browser() {
		page.LaunchUrl();

	}

	@When("^url is launched click the MyAccount button$")
	public void url_is_launched_click_the_MyAccount_button() {
		page.clickMyAccount();
	}

	@When("^enter the email id and password in the excel sheet to register click login and assert$")
	public void enter_the_email_id_and_password_in_the_excel_sheet_to_register_click_login_and_assert() throws Exception {
		/*
		 * page.loginCredentials(1); page.clickLogin(); page.Assert();
		 * page.Screenshot1(); page.logout();
		 */
		for(int i=1;i<=3;i++) {
		page.loginCredentials(i);
		page.clickLogin();
		page.Assert();
		if(i==1)
			page.Screenshot1();
		else if(i==2)
			page.Screenshot2();
		else
			page.Screenshot3();
		page.logout();
		}
		
	}

}
