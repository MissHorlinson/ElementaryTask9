package service;

import java.util.ArrayList;

public class PowService {

    public ArrayList<Integer> getPow(int number, int pow) {
        ArrayList<Integer> powList = new ArrayList();
        int result = number;
        for (int i = 1; i < pow; i++) {
            result *= number;
            powList.add(result);
        }
        return powList;
    }
}
