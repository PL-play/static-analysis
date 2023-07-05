package ta;

import java.util.Collections;
import java.util.List;

public class RuleResult {
    private String ruleName;

    private String ruleCwe;

    private Integer ruleLevel;

    private List<DetectedResult> result = Collections.emptyList();

    private int resultCount;

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

    public void setResultCount(int resultCount) {
        this.resultCount = resultCount;
    }

    public RuleResult() {
    }

    public RuleResult(String ruleName, List<DetectedResult> result) {
        this.ruleName = ruleName;
        this.result = result;
        this.resultCount = result.size();
    }

    public RuleResult(String ruleName, String ruleCwe, Integer ruleLevel, List<DetectedResult> result) {
        this.ruleName = ruleName;
        this.result = result;
        this.resultCount = result.size();
        this.ruleCwe = ruleCwe;
        this.ruleLevel = ruleLevel;
    }

    public int getResultCount() {
        return resultCount;
    }

    public String getRuleName() {
        return ruleName;
    }

    public void setRuleName(String ruleName) {
        this.ruleName = ruleName;
    }

    public List<DetectedResult> getResult() {
        return result;
    }

    public void setResult(List<DetectedResult> result) {
        this.result = result;
    }
}
