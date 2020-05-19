package inheritance;

public abstract class Food extends Product {
    private int nutritionalValue;

    //getting and setting nutritional value
    public void setNutritionalValue(int nv) {
        nutritionalValue = nv;
    }

    public int getNutritionalValue() {
        return nutritionalValue;
    }
}
