package lippia.web.steps;

import com.crowdar.core.PageSteps;
import io.cucumber.java.en.*;

public class StoreSteps extends PageSteps {
    @Given("the user navigates to the website")
    public static void navigateToWebsite() {

    }

    @When("the user clicks on Bookstore App link")
    public void clickBookstoreAppLink() {
    }

    @Then("the user is redirected to the Store section")
    public void redirectToStore() {
    }

    @And("the user should see the products list containing items")
    public void theUserShouldSeeTheProductsListContainingItems() {
    }

    @And("the user inputs the keyword {}")
    public void inputKeyword(String query) {
    }

    @And("the user clicks the search button")
    public void clickSearchButton() {
    }

    @Then("the products list should update its contents to match the search criteria")
    public void listUpdate() {
    }

    @And("the user clicks on a Product")
    public void clickOnProduct() {
    }

    @Then("the user is redirected to a page showing the details of such product")
    public void redirectToProductDetails() {
    }

    @When("the user is viewing the Details Page of a product")
    public void isOnProductDetails() {
    }

    @And("the user clicks on the Back to Book Store button")
    public void clickOnBackToBookStoreButton() {
    }

    @Then("the user is redirected to the products list page")
    public void returnToStore() {
    }

    @And("the user clicks on the Login button")
    public void clickLoginButtonStore() {
    }

    @Then("the user is redirected to the Login Page")
    public void redirectLoginPage() {
    }
}
