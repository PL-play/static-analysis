package ta;

import java.util.List;

public interface RuleSelector {
    List<Config.Rule> select(String... cewId);

    List<Config.Rule> all();

}
