package inheritance;

public class Sausage extends Food implements GetIdAndPrice {
    String manufacturerName;

    //setting and getting manufacturer name
    public void setManufacturerName(String s) {
        manufacturerName = s;
    }

    public String getManufacturerName() {
        return manufacturerName;
    }

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

    public Sausage(String s, int i, double p, int nv) {
        this.manufacturerName = s;
        this.id = i;
        this.price = p;
        this.nutritionalValue = nv;
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
        return String.format("Manufacturer name: " + this.manufacturerName + "\n" +
                "ID: " + this.id + "\n" +
                "price: " + this.price + "\n");
    }

    //Overriding interface method
    @Override
    public void getIdAndPrice() {
        System.out.println("The ID of sausage is " + this.id + ", and it's price is " + this.price);
    }

    Sausage sausage = new Sausage("Elyon", 357, 120.20, 2_000);
}