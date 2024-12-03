package GenericScale;

public class Scale<T extends Comparable<T>> {
    private T left;
    private T right;

    public Scale(T left, T right){
        this.left = left;
        this.right = right;
    }

    public T getHeavier(){
        int comparison = this.left.compareTo(this.right);
        if(comparison == 0){
            return null;
        } else if (comparison > 0){
            return this.left;
        } else {
            return this.right;
        }
    }
}
