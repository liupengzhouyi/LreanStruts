package HelloWorldAction;

public class HelloWord {

    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String exectue() throws Exception {
        return "success";
    }
}
