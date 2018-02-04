package com.poc.serenity.Runner.pages;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.*;
import java.util.logging.Level;
import java.util.logging.Logger;
import gherkin.formatter.Reporter;
//import net.mindtap.showcase.cucumber.utils.commonUtil.Sync;
//import net.mindtap.showcase.cucumber.utils.httpUtil.JsonFileHandler;
import net.serenitybdd.core.annotations.findby.By;
import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.annotations.findby.How;
import net.serenitybdd.core.pages.WebElementDescriber;
import net.serenitybdd.core.pages.WebElementFacade;
import net.serenitybdd.core.pages.WebElementFacadeImpl;
import net.thucydides.core.pages.PageObject;
import org.junit.Assert;
import org.openqa.selenium.WebElement;
//import net.mindtap.showcase.cucumber.utils.httpUtil.PropFileHandler;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindAll;

import static jdk.nashorn.internal.objects.NativeString.substring;
import static org.assertj.core.api.Assertions.assertThat;
import net.serenitybdd.core.Serenity;
public class AnalyticsDashboardPage extends PageObject  {

	String searchEventCount,legacy_hr,legacy_login;
	int index = 13;
	static int i=0;
	@FindBy(how = How.ID, using = "emailId")
	public WebElementFacade txtUsername;


	public void login(String username, String password) {

	}

    public void searchingOnpage(String searchingWord) {
		typeInto($("//input[@name='q']"),searchingWord);
		System.out.println("searching successully with : " +searchingWord);
    }

	public void launchingurl(String url) {
		openAt(url);
		System.out.println("launched url successfully with : " +url);
	}
}

