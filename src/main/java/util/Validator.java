package util;

public class Validator {

    public boolean isNumber(String str) {
        if (str.matches("\\-\\d+") || str.matches("\\d+")) {
            return true;
        } else {
            return false;
        }
    }

    public int getInt(String str) {
        return Integer.parseInt(noTub(str));
    }

    public String noTub(String str) {
        return str.replaceAll("\\s+", "");
    }
}
