package com.moduscreate.javafeatures.geometry;

public sealed abstract class Shape permits Square, Circle {
    
    public abstract int getSize();

}