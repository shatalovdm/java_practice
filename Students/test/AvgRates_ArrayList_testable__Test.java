import avgRates.AvgRates_ArrayList_testable;
import domain.Path;
import org.junit.Assert;
import org.junit.Test;

import java.io.FileNotFoundException;

/**
 * Created by Дмитрий Шаталов on 4/6/2015.
 */
public class AvgRates_ArrayList_testable__Test {
    @Test
    public void testProcess() throws FileNotFoundException {
        Assert.assertEquals("There are less than 2 students in the list.\n", AvgRates_ArrayList_testable.process(Path.path + "rates2.txt"));
        Assert.assertEquals("Three best scores are: 5.0 4.5 4.5\nThree worst scores are: 3.0 3.75 3.75", AvgRates_ArrayList_testable.process(Path.path + "rates.txt"));
        Assert.assertEquals("2 best scores are: 5.0, 5.0.\n2 worst scores are: 3.75, 5.0.", AvgRates_ArrayList_testable.process(Path.path + "rates1.txt"));
    }
}
