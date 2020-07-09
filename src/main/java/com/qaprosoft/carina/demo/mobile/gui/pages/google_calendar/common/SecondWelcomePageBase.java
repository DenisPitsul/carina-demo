package com.qaprosoft.carina.demo.mobile.gui.pages.google_calendar.common;

import com.qaprosoft.carina.core.gui.AbstractPage;
import org.openqa.selenium.WebDriver;

public abstract class SecondWelcomePageBase extends AbstractPage {

    public SecondWelcomePageBase(WebDriver driver) {
        super(driver);
    }

    public abstract ThirdWelcomePageBase clickNextButton();
}
