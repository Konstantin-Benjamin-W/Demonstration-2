import com.sun.xml.internal.ws.policy.AssertionSet;
import inheritance.Milk;
import org.junit.Assert;
import org.junit.BeforeClass;
import org.junit.Test;

public class MilkTest {
    private static Milk milk1;
    private static Milk milk2;
    private static Milk milk3;
    private static Milk milk4;

    @BeforeClass
    public static void createNewMilkAndObject() {
        milk1 = new Milk();
        milk1.setId(325);
        milk1.setNutritionalValue(2_000);
        milk1.setPrice(20.50);
        milk1.setVolume(2);

        milk2 = new Milk();
        milk2.setId(325);
        milk2.setNutritionalValue(2_000);
        milk2.setPrice(20.50);
        milk2.setVolume(2);

        milk3 = new Milk();
        milk3.setId(13);
        milk3.setNutritionalValue(1_000);
        milk3.setPrice(18.20);
        milk3.setVolume(1);
    }

    @Test
    public void shouldReturnTrueIfTwoMilksAreTheSame() {
        Assert.assertTrue(milk1.equals(milk2));
    }

    @Test
    public void shouldReturnTrueIfTwoMilksAreDifferent() {
        Assert.assertFalse(milk1.equals(milk3));
    }

    @Test
    public void shouldReturnTrueIfMilkAreNotEmpty() {
        Assert.assertFalse(milk1.equals(milk4));
    }
}