package taintanalysis.phase;

public interface ResultBuild<U, V> {
    V buildResult(U u);
}
