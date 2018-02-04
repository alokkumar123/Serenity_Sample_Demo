package com.poc.serenity.Runner.steps.serenity;

import com.poc.serenity.Runner.pages.AnalyticsDashboardPage;
//import io.restassured.response.Response;
import com.jayway.restassured.response.Response;
import net.serenitybdd.rest.SerenityRest;
import net.thucydides.core.annotations.Step;
import net.thucydides.core.steps.ScenarioSteps;

import static org.assertj.core.api.Assertions.assertThat;

/**
 * Created by asiqa on 10/11/2016.
 */
public class AnalyticsSteps extends ScenarioSteps {


    AnalyticsDashboardPage AnalyticsDashboardPage;

    private String ISO_CODE_SEARCH = "http://restapi.demoqa.com/utilities/weather/city/delhi";

    public void launch_query(String userName, String pass) {
        System.out.println("hello alok beta");
        System.out.println("printing name :" + userName + ", pass : "+pass );
        /*StringBuilder sb = new StringBuilder();
        sb.append("https://google.com");*/

        Response response = SerenityRest.when().get(ISO_CODE_SEARCH);
        System.out.println(response.getBody().asString());
        //getDriver().navigate().to(sb.toString());
        //  loginPage.openAt(sb.toString());
    }

    @Step
    public void launch_url(String url) {
       /* StringBuilder sb = new StringBuilder();
        sb.append("https://google.com");*/
//        AnalyticsDashboardPage.launchingurl(url);
        System.out.println("lauching url here");
        AnalyticsDashboardPage.openAt("https://google.com");
       // waitABit(1000);
    }

    @Step
    public void searchingWord(String searchingWord) {
        AnalyticsDashboardPage.searchingOnpage(searchingWord);
    }
}