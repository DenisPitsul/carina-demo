package com.qaprosoft.carina.demo.mobile.gui.pages.google_calendar.android;

import com.qaprosoft.carina.core.foundation.utils.factory.DeviceType;
import com.qaprosoft.carina.core.foundation.webdriver.decorator.ExtendedWebElement;
import com.qaprosoft.carina.core.foundation.utils.mobile.IMobileUtils;
import com.qaprosoft.carina.demo.mobile.gui.pages.google_calendar.common.CreateReminderPageBase;
import com.qaprosoft.carina.demo.mobile.gui.pages.google_calendar.common.EventsPageBase;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.FindBy;

@DeviceType(pageType = DeviceType.Type.ANDROID_PHONE, parentClass = EventsPageBase.class)
public class EventsPage extends EventsPageBase implements IMobileUtils {

    @FindBy(id = "floating_action_button")
    private ExtendedWebElement addEventButton;

    @FindBy(id = "speed_dial_icon")
    private ExtendedWebElement createReminderButton;

    @FindBy(xpath = "//android.view.View[contains(@content-desc, 'Test reminder')]")
    private ExtendedWebElement testReminderElement;

    public EventsPage(WebDriver driver) {
        super(driver);
    }

    @Override
    public boolean isPageOpened() {
        return addEventButton.isElementPresent();
    }

    @Override
    public void clickAddEvent() {
        addEventButton.click();
    }

    @Override
    public boolean isCreateReminderButtonVisible() {
        return createReminderButton.isVisible(3);
    }

    @Override
    public CreateReminderPageBase clickCreateReminder() {
        createReminderButton.click();
        return initPage(getDriver(), CreateReminderPageBase.class);
    }

    @Override
    public boolean isTestReminderElementPresent() {
        return testReminderElement.isElementPresent();
    }

}
