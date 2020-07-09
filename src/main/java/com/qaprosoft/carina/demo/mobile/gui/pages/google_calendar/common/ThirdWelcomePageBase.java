package com.qaprosoft.carina.demo.mobile.gui.pages.google_calendar.common;

import com.qaprosoft.carina.core.gui.AbstractPage;
import org.openqa.selenium.WebDriver;

public abstract class ThirdWelcomePageBase extends AbstractPage {

    public ThirdWelcomePageBase(WebDriver driver) {
        super(driver);
    }

    public abstract EventsPageBase clickGotItButton();
}
