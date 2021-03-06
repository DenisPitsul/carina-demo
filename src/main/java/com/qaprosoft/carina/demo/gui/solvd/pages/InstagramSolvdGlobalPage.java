package com.qaprosoft.carina.demo.gui.solvd.pages;

import com.qaprosoft.carina.core.foundation.webdriver.decorator.ExtendedWebElement;
import com.qaprosoft.carina.core.gui.AbstractPage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.FindBy;

import java.util.ArrayList;
import java.util.List;

public class InstagramSolvdGlobalPage extends AbstractPage {
    @FindBy(xpath = "//h2[text()='solvd.global']")
    private ExtendedWebElement accountName;

    public InstagramSolvdGlobalPage(WebDriver driver) {
        super(driver);
        List<String> browserTabs = new ArrayList<>(driver.getWindowHandles());
        driver.switchTo().window(browserTabs.get(1));
    }

    public String getAccountNameText() {
        return accountName.getText();
    }

    @Override
    public boolean isPageOpened() {
        return accountName != null;
    }
}
