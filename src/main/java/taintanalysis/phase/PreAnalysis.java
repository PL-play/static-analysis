package taintanalysis.phase;

public interface PreAnalysis<U, V> {
    V preAnalysis(U u);
}
