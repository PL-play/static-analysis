package taintanalysis.entry;

import java.util.List;

@FunctionalInterface
public interface EntrySelector {

    List<String> select(String classFilePath);

}
