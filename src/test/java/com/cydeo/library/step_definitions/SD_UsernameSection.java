package com.cydeo.library.step_definitions;

import com.cydeo.library.pages.LoginPage;
import com.cydeo.library.pages.UsersPage;
import com.cydeo.library.utilities.BrowserUtils;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;

public class SD_UsernameSection {

    LoginPage loginPage = new LoginPage();
    UsersPage usersPage = new UsersPage();


    @Then("User should be able to see {string} in Username section")
    public void user_should_be_able_to_see_in_username_section(String username) {

        BrowserUtils.waitForVisibility(usersPage.usernameSectionName, 3);

        System.out.println(usersPage.usernameSectionName.getAttribute("textContent"));
        Assert.assertEquals(username,usersPage.usernameSectionName.getAttribute("textContent"));

    }

}
