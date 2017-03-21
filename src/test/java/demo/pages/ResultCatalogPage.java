package demo.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import webdriver.BaseForm;
import webdriver.elements.Button;
import webdriver.elements.TextBox;

import java.util.List;

/**
 * Created by Kefir on 20.03.2017.
 */

public class ResultCatalogPage extends BaseForm {

    private WebDriver driver;
    private String modelLocator = "//*[contains(@class, 'schema-filter__checkbox-item')]/span[contains(., '%s')]";
    private String priceLocator = "//input[@class=\"schema-filter-control__item schema-filter__number-input schema-filter__number-input_price\" and @placeholder = \"до\"]" ;
    private String yearLocator = "//input[@class=\"schema-filter-control__item schema-filter__number-input\" and @placeholder = \"2010\"]";
    private String sizeLocatorFrom = "//*[contains(@class, 'schema-filter-control schema-filter-control_select')]//option[contains(.,'%s')]";
    private String sizeLocatorTo ="//*[contains(@class, 'schema-filter-control schema-filter-control_select')]/following-sibling::*[1]//option[contains(.,'%s')]";
    private String tvLocator =".//*[@class='schema-product__group']//div[@class='schema-product__image']";

    public ResultCatalogPage() {
        super(By.xpath("//h1[contains(., 'Телевизоры')]"), "Results Page");}

    public void setParametrs(String model, String price, String year, String sizefrom, String sizeto) {

        Button btnModel = new Button(By.xpath(String.format(modelLocator, model)), "Model");
        btnModel.click();
        TextBox txbPrice = new TextBox(By.xpath(priceLocator), "Price");
        txbPrice.setText(price);
        TextBox txbYear = new TextBox(By.xpath(yearLocator), "Year");
        txbYear.setText(year);
        Button btnSizeFrom = new Button(By.xpath(String.format(sizeLocatorFrom, sizefrom)), "SizeFrom");
        btnSizeFrom.click();
        Button btnSizeTo = new Button(By.xpath(String.format(sizeLocatorTo, sizeto)), "SizeTo");
        btnSizeTo.click();
    }



    }

