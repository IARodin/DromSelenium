package Tests;

import Page.MainPage;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;


public class DromTests extends BaseTest {
    private final MainPage mainPage = new MainPage(getDriver());

    @BeforeEach
    @Override
    public void setUp() {
        super.setUp();
        getDriver().get("https://auto.drom.ru/");
    }

    @Test
    public void filterAuto() {
        mainPage.filter();

    }


}
