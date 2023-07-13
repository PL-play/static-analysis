package core;

import org.junit.Test;
import ta.RuleSelectorManager;

public class RuleSelectorTest {

    @Test
    public void test1() {
        System.out.println(new RuleSelectorManager().all());
    }

    @Test
    public void test2() {
        System.out.println(new RuleSelectorManager().select("78", "22"));
    }
}
