import avgRates.AvgRates_HashMap;
import com.google.common.collect.Lists;
import domain.Path;
import org.junit.Assert;
import org.junit.Test;

import java.util.HashMap;

/**
 * Created by Дмитрий Шаталов on 4/15/2015.
 */
public class AvgRates_HashMapTest {
    static HashMap<String, Object> rates = new HashMap<>();
    static {
        rates.put("id_1", Lists.newArrayList(4, 4, 3, 2, 5, 5));
        rates.put("id_14", Lists.newArrayList(5, 4, 3, 5, 4, 3, 2, 5));
        rates.put("id_15", Lists.newArrayList(5, 3, 5));
        rates.put("id_16", Lists.newArrayList(2, 3, 4, 3));
        rates.put("id_254", Lists.newArrayList(5, 4, 5, 4, 5, 4));
        rates.put("id_145", Lists.newArrayList(5, 5, 5, 3));
        rates.put("id_165", Lists.newArrayList(4, 4, 4, 3));
        rates.put("id_7", Lists.newArrayList(3, 4, 3, 5));
        rates.put("id_99", Lists.newArrayList(5, 5, 5));
    }

    @Test
    public void testReadData() {
        Assert.assertEquals("{id_14=Петров, id_7=Иванова, id_99=Забавин, id_254=Соколова, id_165=Забавин, id_145=Павлов, id_1=Петров, id_15=Куликов, id_16=Иванова}", new AvgRates_HashMap().readData(Path.path + "students.txt").toString());
        Assert.assertEquals(rates.get("id_1"), new AvgRates_HashMap().readData(Path.path + "rates.txt").get("id_1"));
        Assert.assertEquals(rates.size(), new AvgRates_HashMap().readData(Path.path + "rates.txt").size());
        Assert.assertTrue(new AvgRates_HashMap().readData(Path.path + "rates.txt").equals(rates));
        Assert.assertEquals(3.8333333333333335, new AvgRates_HashMap().computeAverage(rates).get("id_1"), 0.0);
        Assert.assertEquals(5, new AvgRates_HashMap().computeAverage(rates).get("id_99"), 0.0);
        Assert.assertEquals("{id_14=3.875, id_7=3.75, id_99=5.0, id_254=4.5, id_165=3.75, id_145=4.5, id_1=3.8333333333333335, id_15=4.333333333333333, id_16=3.0}", new AvgRates_HashMap().computeAverage(rates).toString());
        Assert.assertEquals("{id_14=3.875, id_7=3.75, id_99=5.0, id_254=4.5, id_165=3.75, id_145=4.5, id_1=3.8333333333333335, id_15=4.333333333333333, id_16=3.0}", new AvgRates_HashMap().computeAverage1(rates).toString());
        Assert.assertEquals("{id_99=5.0}", new AvgRates_HashMap().computeAverage(rates, "id_99").toString());
        Assert.assertEquals(5.0, new AvgRates_HashMap().computeAverage1(rates, "id_99"), 0.0);
        Assert.assertEquals("{id_14=[5, 4, 3, 5, 4, 3, 2, 5], id_7=[3, 4, 3, 5], id_99=[5, 5, 5, 3], id_254=[5, 4, 5, 4, 5, 4], id_165=[4, 4, 4, 3], id_145=[5, 5, 5, 3], id_1=[4, 4, 3, 2, 5, 5], id_15=[5, 3, 5], id_16=[2, 3, 4, 3]}", new AvgRates_HashMap().addRate(rates, "id_99", 3).toString());
    }
}
