package com.avacallery;

// use final to prevent other classes from ever inheriting / or methods from being overrided
// public final class CheckBox extends UIControl { }
public class CheckBox extends UIControl {
    @Override
    public void render() {
        System.out.println("Render CheckBox");
    }
}

