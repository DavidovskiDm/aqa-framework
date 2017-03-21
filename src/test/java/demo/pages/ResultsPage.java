package demo.pages;

import org.openqa.selenium.By;
import org.testng.annotations.Parameters;
import webdriver.BaseForm;
import webdriver.elements.Button;
import webdriver.elements.Label;

/**
 * Created by nikikuzi on 3/16/17.
 */

public class ResultsPage extends BaseForm {


    private String resultLocator = "//*[contains(@class, 'catalog-bar__list')]//a[contains(.,'%s')]";

    public ResultsPage() {
        super(By.xpath("//h1[contains(., 'Каталог')]"), "Results Page");
    }

    public void navigateText(String text) {
        Button btnSearch = new Button(By.xpath(String.format(resultLocator, text)));
        btnSearch.click();
    }
}
