package com.cydeo.library.step_definitions;

import com.cydeo.library.pages.BasePage;
import com.cydeo.library.pages.LoginPage;
import com.cydeo.library.pages.UsersPage;
import com.cydeo.library.utilities.BrowserUtils;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;

import java.util.List;

public class SD_DataTableColumns {

    LoginPage loginPage = new LoginPage();
    UsersPage usersPage = new UsersPage();

    @When("User logins as a librarian with {string} {string}")
    public void user_logins_as_a_librarian(String username, String password) {

        loginPage.usernameInputBox.sendKeys(username);
        loginPage.passwordInputBox.sendKeys(password);
        BrowserUtils.highlight(loginPage.signInButton);

        loginPage.signInButton.click();


    }

    @When("User goes to Users tab")
    public void user_goes_to_users_tab() {

        BrowserUtils.highlight(usersPage.usersTab);
        usersPage.usersTab.click();

    }

    @Then("User see fallowing columns in the table")
    public void user_see_fallowing_columns_in_the_table(List<String> columnNames) {

        for (int i = 0; i < columnNames.size(); i++) {

            System.out.println("Expected " + columnNames.get(i)+
                               "\nActual " + usersPage.headerRow.get(i).getText() );

            Assert.assertEquals(columnNames.get(i), usersPage.headerRow.get(i).getText());

        }

    }

}
