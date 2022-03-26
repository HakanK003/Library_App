package com.cydeo.library.step_definitions;

import com.cydeo.library.pages.HomePage;
import com.cydeo.library.pages.LoginPage;
import com.cydeo.library.utilities.BrowserUtils;
import com.cydeo.library.utilities.Driver;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;

public class SD_Login {

    LoginPage loginPage = new LoginPage();
    HomePage homePage = new HomePage();

    @When("user enters librarian username {string}")
    public void user_enters_librarian_username(String username) {

        loginPage.usernameInputBox.sendKeys(username);

    }

    @When("user enters librarian password {string}")
    public void user_enters_librarian_password(String password) {

        loginPage.passwordInputBox.sendKeys(password);

    }

    @When("user click Sign in button")
    public void user_click_button() {

        BrowserUtils.highlight(loginPage.signInButton);

        loginPage.signInButton.click();

    }

    @Then("user should see the dashboard icon")
    public void user_should_see_the_dashboard() {

//        System.out.println(Driver.getDriver().getCurrentUrl());
//        System.out.println(Driver.getDriver().getTitle());
//        System.out.println(homePage.dashboardIcon.getText());
//        System.out.println("-----------------------");
//        System.out.println(homePage.dashboardIcon.getAttribute("textContent"));

        BrowserUtils.highlight(homePage.dashboardIcon);

        Assert.assertEquals("Dashboard", homePage.dashboardIcon.getText());

    }

    @When("user enters student username {string}")
    public void user_enters_student_username(String username) {

        loginPage.usernameInputBox.sendKeys(username);

    }
    @When("user enters student password {string}")
    public void user_enters_student_password(String password) {

        loginPage.passwordInputBox.sendKeys(password);

    }


}
