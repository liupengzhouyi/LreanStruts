package Tips.Tools;

import org.apache.struts2.ServletActionContext;

import java.util.ArrayList;
import java.util.List;

public class HelloWorldAction {
    private String name;

    public String execute() throws Exception {
        //2:
        List names = new ArrayList();
        names.add("Robert");
        names.add("Page");
        names.add("Kate");
        ServletActionContext.getRequest().setAttribute("names", names);
        return "success";
        //1:
        //return "success";
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
