package action4;

import com.opensymphony.xwork2.ActionSupport;

public class FunvtionAction extends ActionSupport {

    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String find() throws Exception {
        if (this.name.equals("liupeng")) {
            return "liupeng";
        } else {
            return "someOne";
        }
    }
}
