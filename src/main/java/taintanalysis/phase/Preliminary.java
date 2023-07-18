package taintanalysis.phase;

public interface Preliminary<U, V> {
    V pre(U u);
}
