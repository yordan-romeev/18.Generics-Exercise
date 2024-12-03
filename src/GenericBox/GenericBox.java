package GenericBox;

import java.util.List;

public class GenericBox<T extends Comparable<T>> {
    private final T contents;

    public GenericBox(T contents) {
        this.contents = contents;
    }

    public T getContents() {
        return contents;
    }

    @Override
    public String toString() {
        return String.format("%s : %s", this.contents.getClass().getName(), this.getContents().toString());
    }

    public static <T extends Comparable<T>> List<GenericBox<T>> swapElements(List<GenericBox<T>> list, int index1, int index2) {

        //ensure valid and different indexes for the swap operation
        if (index1 >= 0 && index2 >= 0 && index1 < list.size() && index2 < list.size() && index1 != index2) {
            GenericBox<T> temp = list.get(index1);
            list.set(index1, list.get(index2));
            list.set(index2, temp);
        }
        return list;
    }

    public static <T extends Comparable<T>> int CountGreaterElementsInList(List<GenericBox<T>> list, GenericBox<T> elementToCompareTo) {
        int greaterElementsCount = 0;
        for (GenericBox<T> itemInList : list) {
            if (elementToCompareTo.contents.compareTo(itemInList.contents) < 0) {
                greaterElementsCount++;
            }
        }
        return greaterElementsCount;
    }
}
