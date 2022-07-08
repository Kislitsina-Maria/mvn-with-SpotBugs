import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class BonusServiceTest {
    @Test
    public void testRegistredUnderLimit() {
        BonusService service = new BonusService();

        int expected = 150;
        int actual = service.calcBonus(5_000, true);
        //System.out.println(expected + " = ? = " + actual);

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void testUnregistredUnderLimit() {
        BonusService service = new BonusService();

        int expected = 50;
        int actual = service.calcBonus(5_000, false);
        //System.out.println(expected + " = ? = " + actual);

        Assertions.assertEquals(expected, actual);
    }
}
