package stepDefinition;

import io.cucumber.java.en.When;
import io.cucumber.java.en.Then;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class StepDeftest2 {

    String concatedvalue;
    int finalnumber =0;

    @When("We pass company as {string}")
    public void we_pass_company_as(String string) {

        concatedvalue = "Welcome to"+" "+string;
    }

    @Then("Output should be {string}")
    public void output_should_be(String string) {

        if(concatedvalue.equals(string))
        {
            System.out.println("Output String is Pass as :"+concatedvalue);
        }
    }

    @Then("When we pass two numbers as {int} and {int} for addition")
    public void when_we_pass_two_numbers_as_and_for_addition(Integer int1, Integer int2) {

        finalnumber = int1+int2;
    }


    @Then("When we pass two numbers as {int} and {int} for subtraction")
    public void when_we_pass_two_numbers_as_and_for_subtraction(Integer int1, Integer int2) {

        finalnumber =int1-int2;
    }

    @Then("output should be {int}")
    public void output_should_be(Integer int1) {

        if (finalnumber==int1)
        {
            System.out.println("Final number is Pass as :"+finalnumber);
        }

    }






}