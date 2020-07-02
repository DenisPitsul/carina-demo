package com.qaprosoft.carina.demo.gui.solvd.pages;

import com.qaprosoft.carina.core.foundation.webdriver.decorator.ExtendedWebElement;
import com.qaprosoft.carina.core.gui.AbstractPage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.FindBy;

import java.util.ArrayList;
import java.util.List;

public class YoutubeSolvdIncPage extends AbstractPage {
    @FindBy(xpath = "//yt-formatted-string[text()='Solvd, Inc.']")
    private ExtendedWebElement channelName;

    public YoutubeSolvdIncPage(WebDriver driver) {
        super(driver);
        List<String> browserTabs = new ArrayList<>(driver.getWindowHandles());
        driver.switchTo().window(browserTabs.get(1));
    }

    public String getChannelNameText() {
        return channelName.getText();
    }

    @Override
    public boolean isPageOpened() {
        return channelName != null;
    }
}
