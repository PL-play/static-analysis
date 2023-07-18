package taintanalysis.phase;

public interface PostAnalysis<U, V> {
    V postAnalysis(U u);
}
