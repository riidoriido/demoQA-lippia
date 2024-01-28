package lippia.web.services;

import com.crowdar.core.actions.WebActionManager;
import com.crowdar.driver.DriverManager;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.testng.Assert;

public class Utils extends WebActionManager {

    public static void scrollTo(String xpath) {
        JavascriptExecutor javascriptExecutor = DriverManager.getDriverInstance();
        WebElement element = WebActionManager.getElement(xpath);
        javascriptExecutor.executeScript("arguments[0].scrollIntoView(true);", element);
    }

    public static void verifyElementPresence(String element) {
        Assert.assertTrue(WebActionManager.isPresent(element));
    }

    public static void clickLink(String element) {
        WebActionManager.click(element);
    }

    public static void clickJS(String element) {
        JavascriptExecutor javascriptExecutor = DriverManager.getDriverInstance();
        javascriptExecutor.executeScript("document.getElementById('" + element + "').click();");
    }

    public static void checkAttribute(String element, String attribute) {
        boolean result = false;
        try {
            String value = WebActionManager.getAttribute(element, attribute);
            if (value != null) {
                result = true;
            }
        } catch (Exception e) {
            System.out.println("No attribute o valid element assigned");
        }

        Assert.assertTrue(result);

    }

}


