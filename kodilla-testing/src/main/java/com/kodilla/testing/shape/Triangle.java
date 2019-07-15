package com.kodilla.testing.shape;

public class Triangle implements Shape{

    private final String name = "Triangle";
    private double edgeLengthA;
    private double edgeLengthB;
    private double edgeLengthC;

    public Triangle(double edgeLengthA, double edgeLengthB, double edgeLengthC) {
        this.edgeLengthA = edgeLengthA;
        this.edgeLengthB = edgeLengthB;
        this.edgeLengthC = edgeLengthC;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Triangle)) return false;

        Triangle triangle = (Triangle) o;

        if (Double.compare(triangle.edgeLengthA, edgeLengthA) != 0) return false;
        if (Double.compare(triangle.edgeLengthB, edgeLengthB) != 0) return false;
        if (Double.compare(triangle.edgeLengthC, edgeLengthC) != 0) return false;
        return name.equals(triangle.name);
    }

    @Override
    public int hashCode() {
        int result;
        long temp;
        result = name.hashCode();
        temp = Double.doubleToLongBits(edgeLengthA);
        result = 31 * result + (int) (temp ^ (temp >>> 32));
        temp = Double.doubleToLongBits(edgeLengthB);
        result = 31 * result + (int) (temp ^ (temp >>> 32));
        temp = Double.doubleToLongBits(edgeLengthC);
        result = 31 * result + (int) (temp ^ (temp >>> 32));
        return result;
    }

    public String getName() {
        return name;
    }

    public double getEdgeLengthA() {
        return edgeLengthA;
    }

    public void setEdgeLengthA(double edgeLengthA) {
        this.edgeLengthA = edgeLengthA;
    }

    public double getEdgeLengthB() {
        return edgeLengthB;
    }

    public void setEdgeLengthB(double edgeLengthB) {
        this.edgeLengthB = edgeLengthB;
    }

    public double getEdgeLengthC() {
        return edgeLengthC;
    }

    public void setEdgeLengthC(double edgeLengthC) {
        this.edgeLengthC = edgeLengthC;
    }

    @Override
    public String getShapeName() {
        return getName();
    }

    @Override
    public double getField() {
        if(checkTriangleCondition()){
            double halfOfCircuit = getHalfOfCircuit();
            return (float)heronsPattern(halfOfCircuit);
        } else {
            return 0;
        }
    }
    private boolean checkTriangleCondition(){
        return(edgeLengthA + edgeLengthB > edgeLengthC &&
                edgeLengthA + edgeLengthC > edgeLengthB &&
                edgeLengthB + edgeLengthC > edgeLengthA);
    }

    private double getHalfOfCircuit(){
        return (edgeLengthA + edgeLengthB + edgeLengthC)/2;
    }

    private double heronsPattern(double halfOfCircuit) {
        return Math.sqrt(halfOfCircuit*(halfOfCircuit-edgeLengthA)*(halfOfCircuit-edgeLengthB)*(halfOfCircuit-edgeLengthC));
    }
}
