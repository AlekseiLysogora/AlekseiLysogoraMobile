package utility;

import java.util.ResourceBundle;

public class GetProperties {

    private ResourceBundle myBundle;

    public enum NameOfProperty {
        NATIVE_APP,
        WEB_APP
    }

    public GetProperties(NameOfProperty numberOfExercise) {
        switch (numberOfExercise) {
            case NATIVE_APP:
                myBundle = ResourceBundle.getBundle("testdata/native");
                break;
            case WEB_APP:
                myBundle = ResourceBundle.getBundle("testdata/web");
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