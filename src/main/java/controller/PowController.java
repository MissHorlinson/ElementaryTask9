package controller;

import model.Pow;
import service.PowService;
import util.*;

public class PowController {

    private Input      input = new Input();
    private Output     output = new Output();
    private Validator  validator = new Validator();
    private PowService service = new PowService();

    public void run() {
        Pow model = new Pow(getNumber("number"), getNumber("pow"));
        output.result(service.getPow(model.getNumber(), model.getPow()), model);
    }

    public int getNumber(String param) {
        output.startInfo(param);
        String value = input.getString();
        while (!validator.isNumber(value)) {
            output.notValid();
            value = input.getString();
        }
        return validator.getInt(value);
    }
}
