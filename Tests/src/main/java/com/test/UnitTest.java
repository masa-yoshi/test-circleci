package com.test;

import com.example.Browser;
import com.example.Pages;
import com.example.RolePage;
import org.junit.AfterClass;
import org.junit.Assert;
import org.junit.Test;

public class UnitTest {


    @Test
    public void test() {
        Pages.homePage().goTo();
        Assert.assertTrue(Pages.homePage().isAt());
        //test
    }

    @Test
    public void canGoToAngularRolePage() {
        Pages.rolePages().goTo();
        RolePage rolePage = Pages.rolePages().getRolePage("Angular");
        rolePage.goTo();
        Assert.assertTrue(rolePage.isAtRolePage("Angular Web Developer"));
    }

    @AfterClass
    public static void cleaUp() {
        Browser.close();
    }

}
