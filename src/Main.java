import JarOFT.Jar;

public class Main {
    public static void main(String[] args) {
        Jar<String> jar = new Jar<>();
        jar.add("first element in jar");
        jar.add("second element in jar");
        System.out.println(jar);
        jar.remove();
        System.out.println(jar);
    }
}