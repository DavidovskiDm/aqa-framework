package demo.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import webdriver.BaseForm;
import webdriver.Browser;
import webdriver.elements.Button;
import webdriver.elements.Label;
import webdriver.elements.TextBox;

import java.util.List;

import static org.testng.Assert.assertFalse;
import static org.testng.Assert.assertTrue;

/**
 * Created by Kefir on 20.03.2017.
 */
public class AnalysPosition extends BaseForm {

    private String locatorYear = ".//*[@class='product-specs__table']//td[contains(.,'Дата выхода на рынок')]/following-sibling::td//span";
    private String locatorMade ="h1";
    private String locatorPrice =".//*[@class='offers-description__part offers-description__part_1']//span";
    private String locatorSize = ".//*[@class='product-specs__table']//td[contains(.,' Диагональ экрана')]/following-sibling::td//span";

    public AnalysPosition() {
        super(By.className("b-top-logo"), "Analys Position");
    }

     public void analysPosition() {
            //проверка года
            Label lblYear = new Label(By.xpath(locatorYear));
            int year = Integer.parseInt(lblYear.getText().substring(0, 4));
            assertTrue(year >= 2013);
         /*   // проверка цены
           Label lblPrice = new Label(By.xpath(locatorPrice));
          int price = Integer.parseInt(lblPrice.getText());
            assertTrue(price <= 1000);
           */
            // проверка производителя
             Label lblmade = new Label(By.tagName(locatorMade));
             assertTrue(lblmade.getText().contains("Samsung"));
            // проверка диагонали
            Label lblSize = new Label(By.xpath(locatorSize));
            int size = Integer.parseInt(lblSize.getText().substring(0, 2));
            assertTrue((size >= 39 && size <=42));

    }
}