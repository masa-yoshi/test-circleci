package com.example;

public abstract class RolePage {

    public abstract void goTo();

    public abstract String pathName();

    public boolean isAtRolePage(String pathName) {
        return pathName().equals(pathName);
    }
}
