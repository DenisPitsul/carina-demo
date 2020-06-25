package com.qaprosoft.carina.demo.gui.solvd.components;

import com.qaprosoft.carina.core.foundation.webdriver.decorator.ExtendedWebElement;
import com.qaprosoft.carina.core.gui.AbstractUIObject;
import org.openqa.selenium.SearchContext;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.FindBy;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class ClientSection extends AbstractUIObject {
    private static final Logger LOGGER = LoggerFactory.getLogger(HeaderMenu.class);

    @FindBy(xpath = "//div[@class='ytp-cued-thumbnail-overlay']")
    private ExtendedWebElement clientReviewElement;
    @FindBy(xpath = "//div[@class='ytp-cued-thumbnail-overlay']/button")
    private ExtendedWebElement clientReviewVideoPlayButton;
    @FindBy(xpath = "//video")
    private ExtendedWebElement clientReviewVideo;

    public ClientSection(WebDriver driver, SearchContext searchContext) {
        super(driver, searchContext);
    }

    public boolean isClientReviewElementVisible() {
        return clientReviewElement.isVisible(2);
    }

    public void playClientReviewVideo() {
        clientReviewVideoPlayButton.click();
    }

    public boolean isClientReviewVideoVisible() {
        return clientReviewVideo.isVisible(2);
    }


}
