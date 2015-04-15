import domain.Path;
import org.junit.Assert;
import org.junit.Test;

/**
 * Created by Дмитрий Шаталов on 4/15/2015.
 */
public class AvgRates_HashMapTest {
    @Test
    public void testReadData() {
        Assert.assertEquals("id_14 Петров\n" +
                "id_15 Куликов\n" +
                "id_16 Иванова\n" +
                "id_254 Соколова\n" +
                "id_145 Павлов\n" +
                "id_165 Забавин\n" +
                "id_1 Петров\n" +
                "id_7 Иванова\n" +
                "id_99 Забавин", AvgRates_HashMap.readData(Path.path + "students.txt"));
    }
}
