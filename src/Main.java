import ArrayCreator.ArrayCreator;
import GenericBox.GenericBox;
import GenericScale.Scale;
import JarOFT.Jar;

import java.util.ArrayList;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {

        //Exercise 1
        Jar<String> jar = new Jar<>();
        jar.add("first element in jar");
        jar.add("second element in jar");
        System.out.println(jar);
        jar.remove();
        System.out.println(jar);
        System.out.println();

        //Exercise 2
        String[] stringArray = ArrayCreator.create(3, "sample string");
        System.out.println(Arrays.toString(stringArray));
        Integer[] intArray = ArrayCreator.create(Integer.class, 5, 666);
        System.out.println(Arrays.toString(intArray));
        System.out.println();

        //Exercise 3
        Scale<Integer> scaleInt = new Scale<>(1,3);
        System.out.println(scaleInt.getHeavier());

        Scale<String> scaleString = new Scale<>("abc", "abcd");
        System.out.println(scaleString.getHeavier());
        System.out.println();

        //Exercise 4
        GenericBox<String> box1 = new GenericBox<>("chicken in a box");
        System.out.println(box1);
        GenericBox<String> box2 = new GenericBox<>("cat in a box");
        System.out.println(box2);
        System.out.println();

        //Exercise 5
        GenericBox<Integer> box3 = new GenericBox<>(7);
        System.out.println(box3);
        GenericBox<Integer> box4 = new GenericBox<>(123);
        System.out.println(box4);
        GenericBox<Integer> box5 = new GenericBox<>(42);
        System.out.println(box5);
        System.out.println();

        //Exercise 6

        ArrayList<GenericBox<String>> listStrings = new ArrayList<>();
        listStrings.add(new GenericBox<>("Peter"));
        listStrings.add(new GenericBox<>("George"));
        listStrings.add(new GenericBox<>("Swap me with Peter"));
        GenericBox.swapElements(listStrings, 0, 2);
        for (var item : listStrings){
            System.out.println(item);
        }
        System.out.println();

        //Exercise 7

        ArrayList<GenericBox<Integer>> listIntegers = new ArrayList<>();
        listIntegers.add(new GenericBox<>(7));
        listIntegers.add(new GenericBox<>(123));
        listIntegers.add(new GenericBox<>(42));
        GenericBox.swapElements(listIntegers, 0, 2);
        for (var item : listIntegers){
            System.out.println(item);
        }
        System.out.println();

    }
}