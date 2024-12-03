import ArrayCreator.ArrayCreator;
import JarOFT.Jar;

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

    }
}