package taintanalysis.phase;

public interface Posterior<U, V> {
    V post(U u);
}
