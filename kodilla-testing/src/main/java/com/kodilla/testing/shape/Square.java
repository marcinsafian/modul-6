package com.kodilla.testing.shape;

public class Square implements Shape {
    private final String name = "Square";
    private double  edgeLength;

    public Square(double edgeLength) {
        this.edgeLength = edgeLength;
    }

    public String getName() {
        return name;
    }

    public double getEdgeLength() {
        return edgeLength;
    }

    @Override
    public String getShapeName() {
        return name;
    }

    @Override
    public double getField() {
        return (float)Math.pow(getEdgeLength(),2);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Square)) return false;

        Square square = (Square) o;

        if (Double.compare(square.getEdgeLength(), getEdgeLength()) != 0) return false;
        return getName().equals(square.getName());
    }

    @Override
    public int hashCode() {
        int result;
        long temp;
        result = getName().hashCode();
        temp = Double.doubleToLongBits(getEdgeLength());
        result = 31 * result + (int) (temp ^ (temp >>> 32));
        return result;
    }
}
