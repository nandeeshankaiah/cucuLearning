package com.test.cucumber;

import org.testng.annotations.Test;
import org.testng.Assert;

import cucumber.api.CucumberOptions;
import cucumber.api.testng.AbstractTestNGCucumberTests;



@CucumberOptions(plugin="json:target/cucumber-report.json")
public class AppTest extends AbstractTestNGCucumberTests
   
{
  @Test
    public void testApp()
    {
        Assert.assertTrue( true );
    }
}
