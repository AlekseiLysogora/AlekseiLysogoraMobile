package scenarios;

import coretest.InitializationTest;
import dataprovider.DataProviderForTests;
import org.testng.annotations.Test;

public class WebMobileTests extends InitializationTest {

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
        assertionStepWebApp.checkThatRelevantResultsNan();

        // Log that test finished
        System.out.println("Simplest Android web test done");
    }

}