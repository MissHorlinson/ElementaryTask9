package util;

import java.util.ArrayList;

public class Output {
    public void startInfo(String value) { System.out.println("Enter the " + value); }

    public void negativeNumber() {
        System.out.println("It should be positive number > 0");
    }

    public void result(ArrayList<Integer> powList, int number, int pow) {
        System.out.println("pow(" + number + ", " + pow + ")");
        pow = number;
        int i = 1;
        for (Integer value : powList) {
            System.out.println(i++ + ". " + number + " * " + pow + " = " + value);
            number = value;
        }
    }
}
