package stepDefinition;

import functionLibraries.CommonFunctions;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.interactions.Actions;

import javax.swing.*;

public class MenuRedirectionSteps extends CommonFunctions {
    @Given("I am on the Home page with url {string} with title {string}")

    public void openHomePage(String url,String pageHeading)
    {
        driver.get(url);

    }
    @When("I click Menu option {string}")
    public void clickMenu(String menuOption)
    {
        driver.findElement(By.xpath("//button[@data-test=\"allow-all\"]")).click();
        driver.findElement(By.xpath("//a[text()='"+menuOption+"']")).click();

    }
    @Then("I should get redirected to appropriate product page with heading {string}")
    public void verifyPageHeading(String expectedPageTitle)
    {
      Assert.assertTrue(!driver.findElement(By.xpath("//h1[text()='"+expectedPageTitle+"']")).getText().isEmpty());

    }
    @When("I click mouseover Menu {string}")
    public void mouseOverMenu(String menuOption)
    {
        mouseOver(driver.findElement(By.xpath("//a[text()='"+menuOption+"']")));


    }
    @When("I click on submenu option {string}")
    public void clickSubMenuOption(String subMenuOption){
        driver.findElement(By.xpath("//a[normalize-space()='"+subMenuOption+"']")).click();

    }
}
