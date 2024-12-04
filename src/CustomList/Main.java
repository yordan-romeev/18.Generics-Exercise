package CustomList;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String command = scanner.nextLine();

        CustomList<String> list = new CustomList<String>();

        while (!command.equals("end")){
            String[] commandArray = command.split(" ");
            switch (commandArray[0]){
                case "Add": {
                    list.add(commandArray[1]);
                    break;
                }

                case "Remove": {
                    int removeIndex = Integer.parseInt(commandArray[1]);
                    list.remove(removeIndex);
                    break;
                }

                case "Contains": {
                    System.out.println(list.contains(commandArray[1]));
                    break;
                }

                case "Swap": {
                    int swapIndex1 = Integer.parseInt(commandArray[1]);
                    int swapIndex2 = Integer.parseInt(commandArray[2]);
                    list.swap(swapIndex1, swapIndex2);
                    break;
                }

                case "Greater": {
                    System.out.println(list.countGreaterThan(commandArray[1]));
                    break;
                }

                case "Max": {
                    System.out.println(list.getMax());
                    break;
                }

                case "Min": {
                    System.out.println(list.getMin());
                    break;
                }

                case "Print": {
                    System.out.println(list);
                    break;
                }

                default: {
                    System.out.printf("Invalid command: %s%n", commandArray[0]);
                }
            }

            command = scanner.nextLine();
        }
    }
}
