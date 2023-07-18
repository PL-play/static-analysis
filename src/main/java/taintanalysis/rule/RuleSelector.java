package taintanalysis.rule;

import java.util.List;

public interface RuleSelector {
    List<Rule> select(String... cewId);

    List<Rule> all();

}
