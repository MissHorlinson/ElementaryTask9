package controller;

import model.Pow;
import service.PowService;
import util.*;

public class PowController {
    private Input      input = new Input();
    private Output     output = new Output();
    private PowService service = new PowService();

    public void run() {
        Pow model = new Pow(getNumber("number"), getNumber("pow"));
        output.result(service.getPow(model.getNumber(), model.getPow()), model.getNumber(), model.getPow());
    }

    public int getNumber(String value) {
        output.startInfo(value);
        int num= 0;
        while (num <= 0) {
            output.negativeNumber();
            num = Integer.parseInt(input.getString());
        }
        return num;
    }
}
