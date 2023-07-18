package core;

import org.junit.Test;
import taintanalysis.entry.EntrySelector;
import taintanalysis.entry.EntrySelectorManager;

import java.util.List;

public class EntrySelectorTest {

    @Test
    public void test1() {
        List<EntrySelector> entrySelectorList = EntrySelectorManager.buildEntryManager().selectorList("JspServiceEntry,AnnotationTagEntry,PublicStaticOrMainEntry");
        System.out.println(entrySelectorList);
    }
}
