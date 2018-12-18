package validationNumber;

public class Number {

    private int number;

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public String whatNumber() {
        if (number == 666) {
            return "sixsixsix";
        } else {
            return "dome";
        }
    }
}
