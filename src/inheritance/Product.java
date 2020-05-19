package inheritance;

import java.util.Objects;

public abstract class Product {
    private int id;
    private double price;

    //setting and getting id (all)
    public void setId(int id) {
        this.id = id;
    }

    public int getId() {
        return id;
    }

    //setting and getting price (all)
    public void setPrice(double p) {
        price = p;
    }
    public double getPrice() {
        return price;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Product product = (Product) o;
        return id == product.id &&
                Double.compare(product.price, price) == 0;
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, price);
    }
}