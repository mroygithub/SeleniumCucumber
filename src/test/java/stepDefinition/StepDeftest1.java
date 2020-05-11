package stepDefinition;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import java.util.*;

public class StepDeftest1 {


    WebDriver driver = null;

    @Given("user launch application with given url as {string}")
    public void user_launch_application_with_given_url_as(String string) {


        // Launching Google Application
        System.setProperty("webdriver.chrome.driver","/Users/directory/Downloads/chromedriver");
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get(string);

    }


    @Then("application and feature file expected title is {string}")
    public void application_and_feature_file_expected_title_is(String string) {


        // Checking for page title..

        if(driver.getTitle().equals(string))
        {
            System.out.println("Application Pge Title is Pass");
        }

    }

    @Then("User close the application")
    public void User_close_the_application() {

        // Close the application
        driver.quit();

    }


}
