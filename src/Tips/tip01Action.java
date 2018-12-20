package Tips;

import com.opensymphony.xwork2.ActionSupport;

public class tip01Action extends ActionSupport {
    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String execute() throws Exception {

        return SUCCESS;
    }
}
