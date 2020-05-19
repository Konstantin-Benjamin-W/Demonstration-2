package inheritance;

import java.util.Objects;

public class Milk extends Food implements PrintIdAndPrice {
    private int volume;

    //setting and getting volume
    public void setVolume(int v) {
        volume = v;
    }

    public int getVolume() {
        return volume;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        Milk milk = (Milk) o;
        return volume == milk.volume;
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), volume);
    }

    @Override
    public String toString() {
        return String.format("ID: " + getId() + "\n" +
                "Price: " + getPrice() + "\n" +
                "Nutritional Value: " + getNutritionalValue() + "\n" +
                "Volume: " + getVolume());
    }

    //Overriding interface method
    @Override
    public void printIdAndPrice() {
        System.out.println("The ID of milk is " + getId() + ", its price is " + getPrice() + ", its volume is" + getVolume());
    }
}