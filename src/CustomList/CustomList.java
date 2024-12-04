package CustomList;

import java.util.ArrayList;
import java.util.List;

public class CustomList<T extends Comparable<T>> {
    private final List<T> listContents;


    public CustomList() {
        this.listContents = new ArrayList<>();
    }

    public void add(T element) {
        this.listContents.add(element);
    }

    public T remove(int index) {
        return this.listContents.remove(index);
    }

    public boolean contains(T element) {
        return this.listContents.contains(element);
    }

    public void swap(int index1, int index2) {
        //ensure valid and different indexes for the swap operation
        if (index1 >= 0 && index2 >= 0 && index1 < this.listContents.size() && index2 < this.listContents.size() && index1 != index2) {
            T temp = this.listContents.get(index1);
            this.listContents.set(index1, this.listContents.get(index2));
            this.listContents.set(index2, temp);
        }
    }

    public int countGreaterThan(T element) {
        int greaterElementsCount = 0;
        for (T itemInList : this.listContents) {
            if (element.compareTo(itemInList) < 0) {
                greaterElementsCount++;
            }
        }
        return greaterElementsCount;
    }

    public T getMax() {
        if (this.listContents.isEmpty()) {
            return null;
        }

        T maxElement = this.listContents.getFirst();
        for (T currentElement : this.listContents) {
            if (maxElement.compareTo(currentElement) < 0) {
                maxElement = currentElement;
            }
        }
        return maxElement;
    }

    public T getMin() {
        if (this.listContents.isEmpty()) {
            return null;
        }

        T minElement = this.listContents.getFirst();
        for (T currentElement : this.listContents) {
            if (minElement.compareTo(currentElement) > 0) {
                minElement = currentElement;
            }
        }
        return minElement;
    }

    @Override
    public String toString() {
        StringBuilder result = new StringBuilder();
        for (T element : this.listContents) {
            result.append(element.toString());
            result.append(String.format("%n"));
        }
        return result.toString();
    }
}
