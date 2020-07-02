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

    @FindBy(xpath = "//a[contains(@href, 'blog.solvd')]//img")
    private ExtendedWebElement homeButton;
    @FindBy(xpath = "//a[@class='t-menu__link-item' and contains(@href, 'blog.solvd')]")
    private ExtendedWebElement homeItem;
    @FindBy(xpath = "//a[contains(@href, 'subscribe')]")
    private ExtendedWebElement subscribeItem;
    @FindBy(xpath = "//a[contains(@href, 'www.solvd.com')]")
    private ExtendedWebElement backToSolvdItem;

    @FindBy(xpath = "//img[@class='t281__img t-img loaded']//parent::div")
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
