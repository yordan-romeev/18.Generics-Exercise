package GenericBox;

public class GenericBox<T> {
    private final T contents;

    public GenericBox(T contents){
        this.contents = contents;
    }

    public T getContents() {
        return contents;
    }

    @Override
    public String toString() {
        return String.format("%s : %s", this.contents.getClass().getName(), this.contents.toString());
    }
}
