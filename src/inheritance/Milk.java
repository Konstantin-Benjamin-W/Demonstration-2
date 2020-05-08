package inheritance;

public class Milk extends Food implements GetIdAndPrice {
    int volume;

    //setting and getting id
    public void setId(int i) {
        id = i;
    }

    public int getId() {
        return id;
    }

    //setting and getting price
    public void setPrice(double p) {
        price = p;
    }

    public double getPrice() {
        return price;
    }

    //setting and getting nutritional value
    public void setNutritionalValue(int nv) {
        nutritionalValue = nv;
    }

    public int getNutritionalValue() {
        return nutritionalValue;
    }

    //setting and getting volume
    public void setVolume(int v) {
        volume = v;
    }

    public int getVolume() {
        return volume;
    }

    public Milk(int i, double p, int nv, int v) {
        this.id = i;
        this.price = p;
        this.nutritionalValue = nv;
        this.volume = v;
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
    public int hashCode() {
        return 0;
    }

    @Override
    public String toString() {
        return String.format("ID: " + this.id + "\n" +
                "price: " + this.price + "\n" +
                "Nutritional Value: " + this.nutritionalValue);
    }

    //Overriding interface method
    @Override
    public void getIdAndPrice() {
        System.out.println("The ID of milk is " + this.id + ", and it's price is " + this.price);
    }

    Milk milk = new Milk(430, 30.5, 1_000, 2);
}