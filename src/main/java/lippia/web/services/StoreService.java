package lippia.web.services;

import com.crowdar.core.actions.WebActionManager;
import lippia.web.constants.LoginConstants;
import lippia.web.constants.ProductDetailConstants;
import lippia.web.constants.StoreConstants;

public class StoreService {

    public static void clickBookstore() {
        WebActionManager.click(StoreConstants.BOOKSTORE_BTN);
    }

    public static void userIsOnStore() {
        Utils.verifyURL(StoreConstants.STORE_URL);
    }
    public static void checkProductsList() {
        Utils.hasMoreChilds(StoreConstants.PRODUCTS_LIST,0);
    }

    public static void inputQuery(String query) {
        WebActionManager.setInput(StoreConstants.SEARCH_INPUT, query);
    }

    public static void clickOnSearch() {
        WebActionManager.click(StoreConstants.SEARCH_BTN);
    }

    public static void hasFilteredCorrectly() {
        Utils.hasChildAmount(StoreConstants.PRODUCTS_LIST,1);
    }
    public static void clickProduct(){
        WebActionManager.click(StoreConstants.STORE_ITEM);
    }
    public static void userIsOnProductDetailsPage(){
        Utils.verifyURL(ProductDetailConstants.PRODUCT_DETAILS_PAGE_URL);
    }
    public static void verifyProductDetails(){
        Utils.verifyElementPresence(ProductDetailConstants.PRODUCT_DETAILS);
    }
    public static void clickReturnFromProductDetails(){
        WebActionManager.click(StoreConstants.LOGIN_BTN_STORE);
    }

    public static void clickLoginFromStore(){
        WebActionManager.click(StoreConstants.LOGIN_BTN_STORE);
    }
    public static void userIsOnLogin(){
        Utils.verifyElementPresence(LoginConstants.USERNAME_INPUT);
    }
}
