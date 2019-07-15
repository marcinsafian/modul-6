package com.kodilla.testing.shape;
import java.lang.Math;

public class Circle implements Shape {

    private final String name = "Circle";
    private double radius;

    public Circle(double radius) {
        this.radius = radius;
    }

    public String getName() {
        return name;
    }

    public double getRadius() {
        return radius;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Circle)) return false;

        Circle circle = (Circle) o;

        if (Double.compare(circle.getRadius(), getRadius()) != 0) return false;
        return getName().equals(circle.getName());
    }

    @Override
    public int hashCode() {
        int result;
        long temp;
        result = getName().hashCode();
        temp = Double.doubleToLongBits(getRadius());
        result = 31 * result + (int) (temp ^ (temp >>> 32));
        return result;
    }

    @Override
    public String getShapeName() {
        return name;
    }

    @Override
    public double getField() {
        return Math.PI * Math.pow(getField(), 2);
    }
}