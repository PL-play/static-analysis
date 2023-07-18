package taintanalysis.phase;

public interface Analysis<U, V> {
    V doAnalysis(U u);
}
