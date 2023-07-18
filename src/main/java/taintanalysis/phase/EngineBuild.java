package taintanalysis.phase;

public interface EngineBuild<U, V> {

    V buildEngine(U u);
}
