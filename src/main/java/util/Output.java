package util;

import model.Pow;
import java.util.ArrayList;

public class Output {
    public void startInfo(String value) { System.out.println("Enter the " + value); }

    public void negativeNumber() {
        System.out.println("It should be positive number > 0");
    }

    public void result(ArrayList<Integer> powList, Pow model) {
        System.out.println("pow(" + model.getNumber() + ", " + model.getPow() + ")");
        int pow = model.getNumber();
        int number = pow;
        int i = 1;
        for (Integer value : powList) {
            System.out.println(i++ + ". " + number + " * " + pow + " = " + value);
            number = value;
        }
    }
}
