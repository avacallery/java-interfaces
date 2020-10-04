package com.avacallery;

public interface Resizeable {
    // inherits drag method from Draggable
    void resize(int size);
    void resize(int x, int y);
    void resizeTo(UIWidget widget);
}
