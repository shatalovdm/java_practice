package Editor;

import junit.framework.Assert;
import org.junit.Test;

/**
 * Created by Дмитрий Шаталов on 2/24/2015.
 */
public class EditorTest {

    @Test
    public void testMakeResult() {
        Assert.assertEquals("", Editor.makeResult(""));
        Assert.assertEquals("ho", Editor.makeResult("hom"));
        Assert.assertEquals("hoe", Editor.makeResult("home"));
        Assert.assertEquals("I av 10 og", Editor.makeResult("I have 120 dogs"));
    }
}
