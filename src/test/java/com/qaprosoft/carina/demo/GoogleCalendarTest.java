package com.qaprosoft.carina.demo;

import com.qaprosoft.carina.core.foundation.AbstractTest;
import com.qaprosoft.carina.core.foundation.utils.ownership.MethodOwner;
import com.qaprosoft.carina.demo.mobile.gui.pages.google_calendar.common.*;
import com.qaprosoft.carina.demo.utils.helpers.TestData;
import org.testng.Assert;
import org.testng.annotations.Test;

public class GoogleCalendarTest extends AbstractTest {

    @Test
    @MethodOwner(owner = "DenisPitsul")
    public void testCreateReminder() {
        FirstWelcomePageBase firstWelcomePageBase = initPage(getDriver(), FirstWelcomePageBase.class);
        Assert.assertTrue(firstWelcomePageBase.isPageOpened(), "First welcome page isn't opened");

        SecondWelcomePageBase secondWelcomePageBase = firstWelcomePageBase.clickNextButton();
        Assert.assertTrue(secondWelcomePageBase.isPageOpened(), "Second welcome page isn't opened");

        ThirdWelcomePageBase thirdWelcomePageBase = secondWelcomePageBase.clickNextButton();
        Assert.assertTrue(thirdWelcomePageBase.isPageOpened(), "Third welcome page isn't opened");

        EventsPageBase eventsPageBase = thirdWelcomePageBase.clickGotItButton();
        Assert.assertTrue(eventsPageBase.isPageOpened(), "Events page isn't opened");
        eventsPageBase.clickAddEvent();
        Assert.assertTrue(eventsPageBase.isCreateReminderButtonVisible(), "buttons type of events isn't opened");

        CreateReminderPageBase createReminderPageBase = eventsPageBase.clickCreateReminder();
        Assert.assertTrue(createReminderPageBase.isPageOpened(), "Create reminder page isn't opened");
        createReminderPageBase.typeReminderTitle(TestData.REMINDER_TITLE);

        eventsPageBase = createReminderPageBase.clickSave();
        Assert.assertTrue(eventsPageBase.isPageOpened(), "Events page isn't opened");
        Assert.assertTrue(eventsPageBase.isTestReminderElementPresent(), "Reminder hasn't saved");
    }
}
