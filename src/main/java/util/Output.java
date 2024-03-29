package util;

import model.Pow;
import java.util.ArrayList;

public class Output {

    public void startInfo(String value) { System.out.println("Enter the " + value); }

    public void notValid() {
        System.out.println("Not valid data");
    }

    public void result(ArrayList<Integer> powList, Pow model) {
        int number = model.getNumber();
        int pow = number;
        int i = 1;
        System.out.println(model + "\n" + i++ + ".");
        for (Integer value : powList) {
            System.out.println(i++ + ". " + number + " * " + pow + " = " + value);
            number = value;
        }
    }
}
