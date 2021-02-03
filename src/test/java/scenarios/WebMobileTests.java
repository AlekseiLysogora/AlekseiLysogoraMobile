package scenarios;

import coretest.CoreTest;
import dataprovider.DataProviderForTests;
import org.testng.annotations.Test;

public class WebMobileTests extends CoreTest {

    @Test(
            groups = {"web"},
            description = "Make sure that we've opened Google search page",
            dataProvider = "dataWebApplication",
            dataProviderClass = DataProviderForTests.class
    )
    public void simpleWebTest(String googleHomePagePath,
                              String googleHomePageTitle, String searchingWord) {

        stepWebApp.openGoogleHomePage(googleHomePagePath);
        assertionStepWebApp.checkThatGoogleHomePageWasOpened(googleHomePageTitle);
        stepWebApp.fillSearchTextFieldByRequestWord(searchingWord);

        // Log that test finished
        System.out.println("Site opening done");
    }

}