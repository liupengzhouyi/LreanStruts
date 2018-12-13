package action;

import com.opensymphony.xwork2.ActionContext;

import java.util.Map;

public class StrutsAction {
    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String execute() throws Exception {
        if (!name.equals("HelloWord")) {
            Map request = (Map) ActionContext.getContext().get("request");
            request.put("name", getName());
            System.out.println("success");
            return "success";
        } else {
            System.out.println("error");
            return "error";
        }
    }
}
