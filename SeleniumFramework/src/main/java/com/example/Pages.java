package com.example;

import org.openqa.selenium.support.PageFactory;

public class Pages {
    public static HomePage homePage() {
        return new HomePage();
    }

    public static RolePages rolePages() {
        RolePages rolePages = new RolePages();
        return rolePages;
    }

    public static RolePage angularRolePage() {
        RolePage angularRolePage = new AngularRolePage();
        PageFactory.initElements(Browser.driver, angularRolePage);
        return angularRolePage;
    }
}
