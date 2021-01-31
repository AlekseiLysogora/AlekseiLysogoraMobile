package utility;

import java.util.ResourceBundle;

public class GetProperties {

    private ResourceBundle myBundle;

    public enum NameOfProperty {
        NATIVE_LOCATORS,
        WEB_LOCATORS,
        TEST_DATA
    }

    public GetProperties(NameOfProperty numberOfExercise) {
        switch (numberOfExercise) {
            case NATIVE_LOCATORS:
                myBundle = ResourceBundle.getBundle("locators/native");
                break;
            case WEB_LOCATORS:
                myBundle = ResourceBundle.getBundle("locators/web");
                break;
            case TEST_DATA:
                myBundle = ResourceBundle.getBundle("testdata/native");
                break;
            default:
                System.err.println("\n>The resource isn't selected. Check GetProperties.class<\n");
                break;
        }
    }

    public String getResource(String resourceName) {
        return myBundle.getString(resourceName);
    }
}