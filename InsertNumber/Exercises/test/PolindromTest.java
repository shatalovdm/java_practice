import org.junit.Assert;
import org.junit.Test;

/**
 * Created by Дмитрий Шаталов on 7/19/2015.
 */

public class PolindromTest {
    @Test
    public void testIsPolindrom_v2() {
        Assert.assertTrue(Polindrom.isPolindrom_v2("anna"));
        Assert.assertTrue(Polindrom.isPolindrom_v2("kazak"));
        Assert.assertTrue(Polindrom.isPolindrom_v2("Kazak"));
        Assert.assertTrue(Polindrom.isPolindrom_v2("727"));
        Assert.assertFalse(Polindrom.isPolindrom_v2("ezhik"));
        Assert.assertFalse(Polindrom.isPolindrom_v2("727 "));
    }
    @Test
    public void testIsPolindrom() {
        Assert.assertTrue(Polindrom.isPolindrom("anna"));
        Assert.assertTrue(Polindrom.isPolindrom("kazak"));
        Assert.assertTrue(Polindrom.isPolindrom("Kazak"));
        Assert.assertFalse(Polindrom.isPolindrom("727 "));
        Assert.assertTrue(Polindrom.isPolindrom("727"));
        Assert.assertFalse(Polindrom.isPolindrom("ezhik"));
    }
}
