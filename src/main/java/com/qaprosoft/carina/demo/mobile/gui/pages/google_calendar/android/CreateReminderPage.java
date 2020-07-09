package com.qaprosoft.carina.demo.mobile.gui.pages.google_calendar.android;

import com.qaprosoft.carina.core.foundation.utils.factory.DeviceType;
import com.qaprosoft.carina.core.foundation.utils.mobile.IMobileUtils;
import com.qaprosoft.carina.core.foundation.webdriver.decorator.ExtendedWebElement;
import com.qaprosoft.carina.demo.mobile.gui.pages.google_calendar.common.CreateReminderPageBase;
import com.qaprosoft.carina.demo.mobile.gui.pages.google_calendar.common.EventsPageBase;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.FindBy;

@DeviceType(pageType = DeviceType.Type.ANDROID_PHONE, parentClass = CreateReminderPageBase.class)
public class CreateReminderPage extends CreateReminderPageBase implements IMobileUtils {

    @FindBy(id = "title_edit_text")
    private ExtendedWebElement reminderTitleInput;

    @FindBy(id = "save")
    private ExtendedWebElement saveButton;

    public CreateReminderPage(WebDriver driver) {
        super(driver);
    }

    @Override
    public boolean isPageOpened() {
        return reminderTitleInput.isElementPresent();
    }

    @Override
    public void typeReminderTitle(String title) {
        reminderTitleInput.type(title);
    }

    @Override
    public EventsPageBase clickSave() {
        saveButton.click();
        return initPage(getDriver(), EventsPageBase.class);
    }
}
