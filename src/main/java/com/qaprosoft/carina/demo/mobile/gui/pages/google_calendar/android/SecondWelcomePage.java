package com.qaprosoft.carina.demo.mobile.gui.pages.google_calendar.android;

import com.qaprosoft.carina.core.foundation.utils.factory.DeviceType;
import com.qaprosoft.carina.core.foundation.utils.mobile.IMobileUtils;
import com.qaprosoft.carina.core.foundation.webdriver.decorator.ExtendedWebElement;
import com.qaprosoft.carina.demo.mobile.gui.pages.google_calendar.common.SecondWelcomePageBase;
import com.qaprosoft.carina.demo.mobile.gui.pages.google_calendar.common.ThirdWelcomePageBase;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.FindBy;

@DeviceType(pageType = DeviceType.Type.ANDROID_PHONE, parentClass = SecondWelcomePageBase.class)
public class SecondWelcomePage extends SecondWelcomePageBase implements IMobileUtils {

    @FindBy(id = "disclaimer_text")
    private ExtendedWebElement disclaimerText;

    @FindBy(id = "next_arrow")
    private ExtendedWebElement nextButton;

    public SecondWelcomePage(WebDriver driver) {
        super(driver);
    }

    @Override
    public boolean isPageOpened() {
        return disclaimerText.isElementPresent();
    }

    @Override
    public ThirdWelcomePageBase clickNextButton() {
        nextButton.click();
        return initPage(getDriver(), ThirdWelcomePageBase.class);
    }
}
