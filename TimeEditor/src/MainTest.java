import org.junit.Assert;
import org.junit.Test;

/**
 * Created by Дмитрий Шаталов on 3/4/2015.
 */
public class MainTest {

    @Test
    public void testOperator() {
        Assert.assertEquals("2:30", Main.operator("150"));
        Assert.assertEquals("0:1", Main.operator("1441"));
        Assert.assertEquals("0:0", Main.operator("0"));
    }
}
