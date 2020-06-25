package com.qaprosoft.carina.demo.gui.solvd.components;

import com.qaprosoft.carina.core.foundation.webdriver.decorator.ExtendedWebElement;
import com.qaprosoft.carina.core.gui.AbstractUIObject;
import com.qaprosoft.carina.demo.gui.solvd.pages.HomePage;
import org.openqa.selenium.SearchContext;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.FindBy;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class BlogHeaderMenu extends AbstractUIObject {
    private static final Logger LOGGER = LoggerFactory.getLogger(BlogHeaderMenu.class);

    @FindBy(xpath = "//a[@href='https://blog.solvd.com/']//img")
    private ExtendedWebElement homeButton;
    @FindBy(xpath = "////ul[@class='t456__list']/li[1]/a")
    private ExtendedWebElement homeItem;
    @FindBy(xpath = "//ul[@class='t456__list']/li[2]/a")
    private ExtendedWebElement subscribeItem;
    @FindBy(xpath = "//ul[@class='t456__list']/li[3]/a")
    private ExtendedWebElement backToSolvdItem;

    @FindBy(xpath = "//div[@class='t-popup__container t-width t-width_6 t-popup__container-animated']")
    private SubscribeDialog subscribeDialog;

    public BlogHeaderMenu(WebDriver driver, SearchContext searchContext) {
        super(driver, searchContext);
    }

    public HomePage backToSolvd() {
        backToSolvdItem.click();
        return new HomePage(driver);
    }

    public SubscribeDialog openSubscribe() {
        subscribeItem.click();
        return subscribeDialog;
    }
}
