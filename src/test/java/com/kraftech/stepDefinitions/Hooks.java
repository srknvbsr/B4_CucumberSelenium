package com.kraftech.stepDefinitions;

import com.kraftech.utilities.Driver;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.Scenario;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;

import java.util.concurrent.TimeUnit;

public class Hooks {

    @Before(order = 0)
    public void setUp() {

        //System.out.println("This is coming from before method");
        Driver.get().manage().window().maximize();
        Driver.get().manage().timeouts().implicitlyWait(7, TimeUnit.SECONDS);
    }

    @After(order = 0)
    public void tearDown(Scenario scenario) {

        //System.out.println("This is coming from after method");
        if(scenario.isFailed()){
            final byte[] screenshot = ((TakesScreenshot) Driver.get()).getScreenshotAs(OutputType.BYTES);
            scenario.attach(screenshot,"image/png","screenshot");
        }
        Driver.closeDriver();
    }

    @Before(value = "@database",order = 1)
    public void openDataBase() {
        System.out.println("Open DataBase");
    }

    @After(value = "@database",order = 1)
    public void closeDataBase() {
        System.out.println("Close DataBase");
    }
}
