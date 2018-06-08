package Steps;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


import java.security.PublicKey;
import java.util.concurrent.TimeUnit;

public class BrandCategory {
    public WebDriver driver;

    @Given("^I am on the homepage$")
    public void i_am_on_the_homepage() throws Throwable {
        System.setProperty("webdriver.chrome.driver","C:\\chromedriver.exe");
        driver=new ChromeDriver();
        driver.navigate().to("https://www.kurtgeiger.com/");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);



    }

    @When("^I select brand category from header$")
    public void i_select_brand_category_from_header() throws Throwable {
        driver.findElement(By.linkText("BRANDS")).click();




    }

    @Then("^I should see the list of brands$")
    public void i_should_see_the_list_of_brands() throws Throwable {
        driver.findElement(By.xpath("//*[@id=\"tab-all-brands\"]/a")).isDisplayed();

    }

    @Then("^I select DOLCE & GABBANA brand from list$")
    public void i_select_DOLCE_GABBANA_brand_from_list() throws Throwable {
        driver.findElement(By.linkText("Dolce & Gabbana")).click();

    }

    @Then("^I should see the list of products from DOLCE & GABBANA$")
    public void i_should_see_the_list_of_products_from_DOLCE_GABBANA() throws Throwable {
        driver.findElement(By.xpath("//*[@id=\"kg_kgbrands_kgbrandsdolcegabbana\"]/span")).click();

    }



}
