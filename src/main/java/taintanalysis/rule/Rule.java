package taintanalysis.rule;

import java.util.Collections;
import java.util.List;

public class Rule {
    private String name;

    private String ruleCwe;

    private Integer ruleLevel;
    private List<String> sources = Collections.emptyList();

    private List<String> sinks = Collections.emptyList();

    public String getRuleCwe() {
        return ruleCwe;
    }

    public void setRuleCwe(String ruleCwe) {
        this.ruleCwe = ruleCwe;
    }

    public Integer getRuleLevel() {
        return ruleLevel;
    }

    public void setRuleLevel(Integer ruleLevel) {
        this.ruleLevel = ruleLevel;
    }

    public List<String> getSources() {
        return sources;
    }

    public void setSources(List<String> sources) {
        this.sources = sources;
    }

    public List<String> getSinks() {
        return sinks;
    }

    public void setSinks(List<String> sinks) {
        this.sinks = sinks;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
