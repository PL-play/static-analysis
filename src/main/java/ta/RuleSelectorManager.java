package ta;

import com.google.gson.Gson;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import utils.ClassPathResource;

import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;
import java.util.stream.Collectors;

public class RuleSelectorManager implements RuleSelector {
    private final Logger logger = LoggerFactory.getLogger(getClass());

    private static final List<Config.Rule> rules;

    static {
        try {
            rules = Collections.unmodifiableList(new Gson().fromJson(new InputStreamReader(new ClassPathResource("defaultconfig.json").getInputStream()), Config.class).getRules());
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    @Override
    public List<Config.Rule> select(String... cewId) {
        Set<String> cewSet = Arrays.stream(cewId).collect(Collectors.toSet());
        return rules.stream().filter(rule -> cewSet.contains(rule.getRuleCwe())).toList();
    }

    @Override
    public List<Config.Rule> all() {
        return rules;
    }

}
