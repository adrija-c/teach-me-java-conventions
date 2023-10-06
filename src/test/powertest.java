package powerpackage;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class PowerFinderTest {
    PowerFinder p = new PowerFinder();

    @Test
    public void oneToThePowerOne() {
        assertEquals(p.calculatePower(1,1),1);
    }

    @Test
    public void twoToThePowerOne() {
        assertEquals(p.calculatePower(2,1),2);
    }

    @Test
    public void twoToThePowerTwo() {
        assertEquals(p.calculatePower(2,2),4);
    }

    @Test
    public void threeToThePowerTwo() {
        assertEquals(p.calculatePower(3,2),9);
    }

}
