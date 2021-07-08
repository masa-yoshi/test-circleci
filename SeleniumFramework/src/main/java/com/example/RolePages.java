package com.example;

public class RolePages {

    static String url = "https://www.pluralsight.com/product/role-iq";

    public void goTo() {
        Browser.goTo(url);
    }

    public RolePage getRolePage(String page) {
        switch (page) {
            case "Angular":
                return Pages.angularRolePage();
        }

        return null;
    }

}
