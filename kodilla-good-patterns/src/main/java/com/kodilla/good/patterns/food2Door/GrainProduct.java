package com.kodilla.good.patterns.food2Door;

public class GrainProduct extends Product {
    boolean bioProduct;

    public GrainProduct(String productName, boolean bioProduct) {
        super(productName);
        this.bioProduct = bioProduct;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof GrainProduct)) return false;
        if (!super.equals(o)) return false;

        GrainProduct that = (GrainProduct) o;

        return bioProduct == that.bioProduct;
    }

    @Override
    public int hashCode() {
        int result = super.hashCode();
        result = 31 * result + (bioProduct ? 1 : 0);
        return result;
    }
}
