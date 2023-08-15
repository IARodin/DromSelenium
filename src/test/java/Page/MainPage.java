package Page;
// page_url = https://auto.drom.ru/


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;


public class MainPage {
    WebDriver driver;

    public MainPage(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    @FindBy(xpath = "//div[@aria-label='Марка, Марка']")
    private WebElement changeAuto;
    @FindBy(xpath = "//input[@placeholder='Марка']")
    private WebElement inputToyota;

    public void filter() {
        inputToyota.sendKeys("Toyota");
    }

}
