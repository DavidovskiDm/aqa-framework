package demo.tests;

import demo.pages.*;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Parameters;
import webdriver.BaseTest;
import webdriver.Browser;
import webdriver.elements.Button;
import webdriver.elements.TextBox;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.TimeUnit;

/**
 * Created by nikikuzi on 3/16/17.
 */
public class SearchTest extends BaseTest {
    WebDriver driver;
   // private String locatorListTV = ".//*[@class='schema-product__group']//div[@class='schema-product__image']/a";
    private String locatorListTV = ".//*[@class='schema-product__title']//span/..";

    @Override

    public void runTest() {
        logStep();
        MainPage mainPage = new MainPage();
        mainPage.goToCatalog();

        logStep();
        ResultsPage resultsPage = new ResultsPage();
        resultsPage.navigateText("Телевизоры");

        logStep();
        ResultCatalogPage catalogPage = new ResultCatalogPage();
        catalogPage.setParametrs("Samsung", "1000","2013","39","42");


        logStep();
        String url = browser.getLocation();

        browser.getDriver().manage().timeouts().pageLoadTimeout(10, TimeUnit.SECONDS);
        List <WebElement> listTV =  browser.getDriver().findElements(By.xpath(locatorListTV));

        logStep();
        for (int i =0; i<5/*listTV.size()*/;i++ ) {
            List <WebElement> listTVtemp =  browser.getDriver().findElements(By.xpath(locatorListTV));
            WebElement btn = listTVtemp.get(i);
            btn.click();
            logStep("проверка");
            AnalysPosition analys = new AnalysPosition();
            analys.analysPosition();
            browser.navigate(url);
        }
    }
}
