package com.qaprosoft.carina.demo.mobile.gui.pages.google_calendar.android;

import com.qaprosoft.carina.core.foundation.utils.factory.DeviceType;
import com.qaprosoft.carina.core.foundation.utils.mobile.IMobileUtils;
import com.qaprosoft.carina.core.foundation.webdriver.decorator.ExtendedWebElement;
import com.qaprosoft.carina.demo.mobile.gui.pages.google_calendar.common.SecondWelcomePageBase;
import com.qaprosoft.carina.demo.mobile.gui.pages.google_calendar.common.FirstWelcomePageBase;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.FindBy;

@DeviceType(pageType = DeviceType.Type.ANDROID_PHONE, parentClass = FirstWelcomePageBase.class)
public class FirstWelcomePage extends FirstWelcomePageBase implements IMobileUtils {

    @FindBy(id = "image")
    private ExtendedWebElement titleImage;

    @FindBy(id = "next_arrow")
    private ExtendedWebElement nextButton;

    public FirstWelcomePage(WebDriver driver) {
        super(driver);
    }

    @Override
    public boolean isPageOpened() {
        return titleImage.isElementPresent();
    }

    @Override
    public SecondWelcomePageBase clickNextButton() {
        nextButton.click();
        return initPage(getDriver(), SecondWelcomePageBase.class);
    }
}
