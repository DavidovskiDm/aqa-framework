package demo.tests;

import demo.pages.*;
import org.openqa.selenium.By;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;
import webdriver.BaseTest;
import webdriver.Browser;
import webdriver.elements.Button;
import webdriver.elements.TextBox;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.TimeUnit;



public class SearchTest extends BaseTest {



        @Parameters({"text","model","price","sizefrom","sizeto","year"})
        public void runTest() {
        logStep("переход в Каталог");

        MainPage mainPage = new MainPage();
        mainPage.goToCatalog();

        logStep("переход в раздел Телевизоры");
        ResultsPage resultsPage = new ResultsPage();
        resultsPage.navigateText("Телевизоры");

        logStep("Установка параметров фильтра выбора");
        ResultCatalogPage catalogPage = new ResultCatalogPage();
        catalogPage.setParametrs("Samsung", "1000","2013","39","42");

        logStep("Проверка результатов");
        String[] listTV = catalogPage.getList();
        logStep();
        for (int i=0; i < listTV.length; i++ ){
            browser.navigate(listTV[i]);
            AnalysPosition analys = new AnalysPosition();
            analys.analysPosition();
           }
      }
}
