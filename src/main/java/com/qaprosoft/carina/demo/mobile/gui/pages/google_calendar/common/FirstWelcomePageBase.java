package com.qaprosoft.carina.demo.mobile.gui.pages.google_calendar.common;

import com.qaprosoft.carina.core.gui.AbstractPage;
import org.openqa.selenium.WebDriver;

public abstract class FirstWelcomePageBase extends AbstractPage {

    public FirstWelcomePageBase(WebDriver driver) {
        super(driver);
    }

    public abstract SecondWelcomePageBase clickNextButton();
}
