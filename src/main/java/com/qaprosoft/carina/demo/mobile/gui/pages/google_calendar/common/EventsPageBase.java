package com.qaprosoft.carina.demo.mobile.gui.pages.google_calendar.common;

import com.qaprosoft.carina.core.gui.AbstractPage;
import org.openqa.selenium.WebDriver;

public abstract class EventsPageBase extends AbstractPage {

    public EventsPageBase(WebDriver driver) {
        super(driver);
    }

    public abstract void clickAddEvent();

    public abstract boolean isCreateReminderButtonVisible();

    public abstract CreateReminderPageBase clickCreateReminder();

    public abstract boolean isTestReminderElementPresent();

}
