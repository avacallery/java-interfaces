package com.avacallery;

// interfaces can have multiple parents (Draggable, Resizeable)
public interface UIWidget
        extends Draggable, Resizeable {
    void render();
}

