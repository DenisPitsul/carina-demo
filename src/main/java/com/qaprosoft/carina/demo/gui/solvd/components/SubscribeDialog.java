package com.qaprosoft.carina.demo.gui.solvd.components;

import com.qaprosoft.carina.core.foundation.webdriver.decorator.ExtendedWebElement;
import com.qaprosoft.carina.core.gui.AbstractUIObject;
import org.apache.log4j.Logger;
import org.openqa.selenium.SearchContext;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.FindBy;

public class SubscribeDialog extends AbstractUIObject {
    private static final Logger LOGGER = Logger.getLogger(SubscribeDialog.class);

    @FindBy(xpath = "//input[@name='email']")
    private ExtendedWebElement emailInput;
    @FindBy(xpath = "//input[@name='email']//parent::div//following-sibling::div/button")
    private ExtendedWebElement subscribeButton;
    @FindBy(xpath = "//div[@class='t281__allert-wrapper']//div[@class='t281__success-message t-descr t-descr_md']")
    private ExtendedWebElement successMessage;

    public SubscribeDialog(WebDriver driver, SearchContext searchContext) {
        super(driver, searchContext);
    }

    public void typeEmail(String email) {
        emailInput.type(email);
    }

    public void subscribe() {
        subscribeButton.click();
    }

    public boolean isSuccessMessageVisible() {
        return successMessage.isVisible(2);
    }
}
