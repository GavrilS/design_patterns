package pattern_lib.AbstractFactory;

public interface AbstractFactory<T> {
    T create(String mazeType);
}
