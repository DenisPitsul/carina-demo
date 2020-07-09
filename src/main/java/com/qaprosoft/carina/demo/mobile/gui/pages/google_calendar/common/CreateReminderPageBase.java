package com.qaprosoft.carina.demo.mobile.gui.pages.google_calendar.common;

import com.qaprosoft.carina.core.gui.AbstractPage;
import org.openqa.selenium.WebDriver;

public abstract class CreateReminderPageBase extends AbstractPage {

    public CreateReminderPageBase(WebDriver driver) {
        super(driver);
    }

    public abstract void typeReminderTitle(String title);

    public abstract EventsPageBase clickSave();
}
