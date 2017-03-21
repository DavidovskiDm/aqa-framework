package demo.pages;

import org.openqa.selenium.By;
import webdriver.BaseForm;
import webdriver.elements.Button;
import webdriver.elements.TextBox;

/**
 * Created by nikikuzi on 3/16/17.
 */
public class MainPage extends BaseForm {


    private Button btnSearch = new Button(By.xpath("//*[contains(@class, 'g-top-i')]//a[contains(.,'Каталог')]"), "Search");

    public MainPage() {
        super(By.className("b-top-logo"),"Main Page");
    }

    public void goToCatalog() {
    btnSearch.click();
    }
}
