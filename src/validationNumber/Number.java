package validationNumber;

public class Number {

    private String number;

    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number;
    }

    public String whatNumber() {
        if (number.equals("666")) {
            return "sixsixsix";
        } else if (number.equals("665")) {
            return "sixsixfvive";
        } else {
            return "dome";
        }
    }
}
