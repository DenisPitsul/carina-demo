package com.qaprosoft.carina.demo.mobile.gui.pages.google_calendar.android;

import com.qaprosoft.carina.core.foundation.utils.factory.DeviceType;
import com.qaprosoft.carina.core.foundation.utils.mobile.IMobileUtils;
import com.qaprosoft.carina.core.foundation.webdriver.decorator.ExtendedWebElement;
import com.qaprosoft.carina.demo.mobile.gui.pages.google_calendar.common.EventsPageBase;
import com.qaprosoft.carina.demo.mobile.gui.pages.google_calendar.common.ThirdWelcomePageBase;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.FindBy;

@DeviceType(pageType = DeviceType.Type.ANDROID_PHONE, parentClass = ThirdWelcomePageBase.class)
public class ThirdWelcomePage extends ThirdWelcomePageBase implements IMobileUtils {

    @FindBy(id = "header")
    private ExtendedWebElement headerText;

    @FindBy(id = "done_button")
    private ExtendedWebElement nextButton;

    public ThirdWelcomePage(WebDriver driver) {
        super(driver);
    }

    @Override
    public boolean isPageOpened() {
        return headerText.isElementPresent();
    }

    @Override
    public EventsPageBase clickGotItButton() {
        nextButton.click();
        return initPage(getDriver(), EventsPageBase.class);
    }

}
