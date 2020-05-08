public class Hammer extends HouseholdGoods implements GetIdAndPrice {

    //setting and getting id (all)
    public void setId(int i) {
        id = i;
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

    //setting and getting weight (Household Goods feature)
    public void setWeight(double w) {
        weight = w;
    }

    public double getWeight() {
        return weight;
    }

    public Hammer(int i, double p, double w) {
        this.id = i;
        this.price = p;
        this.weight = w;
    }

    @Override
    public int hashCode() {
        return 0;
    }

    @Override
    public boolean equals(Object obj) {
        if (this.hashCode() == obj.hashCode()) {
            return true;
        } else {
            return false;
        }
    }

    @Override
    public String toString() {
        return String.format("ID: " + this.id + "\n" +
                "Price: " + this.price + "\n" +
                "Weight: " + this.weight);
    }

    //Overriding interface method
    @Override
    public void getIdAndPrice() {
        System.out.println("The ID of hammer is " + this.id + ", and it's price is" + this.price);
    }
}