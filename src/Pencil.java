public class Pencil extends Stationary implements GetIdAndPrice{

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

    public Pencil(int i, double len, double p) {
        this.id = i;
        this.length = len;
        this.price = p;
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
        System.out.println("The ID of pencil is " + this.id +", and it's price is " + this.price);
    }

    Pencil pencil = new Pencil(590, 7.3, 10.25);
}