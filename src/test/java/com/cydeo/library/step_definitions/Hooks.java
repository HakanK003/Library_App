package com.cydeo.library.step_definitions;

import com.cydeo.library.utilities.BrowserUtils;
import com.cydeo.library.utilities.ConfigurationReader;
import com.cydeo.library.utilities.Driver;
import io.cucumber.java.After;
import io.cucumber.java.Before;

public class Hooks {

    @Before
    public void setUpForLogin(){

        Driver.getDriver().get( ConfigurationReader.getProperty("env") );

    }



    @After
    public void tearDown(){

//        BrowserUtils.waitFor(3);

        Driver.closeDriver();

    }

}
