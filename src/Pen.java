public class Pen extends Stationary implements GetIdAndPrice {
    String colour;

    //All
    //setting and getting id
    public void setId(int i) {
        id = i;
    }

    public int getId() {
        return id;
    }

    //setting and getting price
    public void setPrice(double p) {
        this.price = p;
    }

    public double getPrice() {
        return price;
    }

    //Stationary
    //setting and getting length
    public void setLength(double len) {
        length = len;
    }

    public double getLength() {
        return length;
    }

    //Very pen
    //setting and getting colour
    public void setColour(String s) {
        colour = s;
    }

    public String getColour() {
        return colour;
    }

    //Constructor
    public Pen(int i, double p, double len, String s) {
        this.id = i;
        this.price = p;
        this.length = len;
        this.colour = s;
    }

    //overriding existing methods
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
        return String.format("ID: " + this.id +
                "length: " + this.length +
                "price: " + this.price);
    }

    //overriding interface method
    @Override
    public void getIdAndPrice() {
        System.out.println("The ID of pen is " + this.id +", and it's price is " + this.price);
    }

    Pen pen = new Pen(710, 9.90, 8.1, "black");
}