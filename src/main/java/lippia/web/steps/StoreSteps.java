package lippia.web.steps;

import com.crowdar.core.PageSteps;
import com.crowdar.core.actions.WebActionManager;
import io.cucumber.java.en.*;
import lippia.web.services.StoreService;


public class StoreSteps extends PageSteps {
    @Given("the user navigates to the website")
    public static void navigateToWebsite() {
        WebActionManager.navigateTo("https://demoqa.com");
    }

    @When("the user clicks on Bookstore App link")
    public void clickBookstoreAppLink() {
        StoreService.clickBookstore();
    }

    @Then("the user is redirected to the Store section")
    public void theUserIsRedirectedToTheStoreSection() {
        StoreService.userIsOnStore();
    }

    @And("the user should see the products list containing items")
    public void theUserShouldSeeTheProductsListContainingItems() {
        StoreService.checkProductsList();
    }

    @And("the user inputs the keyword {}")
    public void inputKeywordInSearchBox(String query) {
        StoreService.inputQuery(query);
    }

    @And("the user clicks the search button")
    public void clickSearchButton() {
        StoreService.clickOnSearch();
    }

    @Then("the products list should update its contents to match the search criteria")
    public void listUpdates() {
        StoreService.hasFilteredCorrectly();
    }

    @And("the user clicks on a Product")
    public void clickOnProduct() {
        StoreService.clickProduct();
    }

    @Then("the user is redirected to a page showing the details of such product")
    public void redirectToProductDetails() {
        StoreService.userIsOnProductDetailsPage();
    }

    @When("the user is viewing the Details Page of a product")
    public void isOnProductDetails() {
        StoreService.verifyProductDetails();
    }

    @And("the user clicks on the Back to Book Store button")
    public void clickOnBackToBookStoreButton() {
        StoreService.clickReturnFromProductDetails();
    }

    @Then("the user is redirected to the products list page")
    public void returnToStore() {
        StoreService.userIsOnStore();
    }

    @And("the user clicks on the Login button")
    public void clickLoginButtonStore() {
        StoreService.clickLoginFromStore();
    }

    @Then("the user is redirected to the Login Page")
    public void redirectLoginPage() {
        StoreService.userIsOnLogin();
    }


}
