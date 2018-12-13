package action;

import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionSupport;

import java.util.Map;

public class StrutsAction extends ActionSupport {
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

    /**
     * 把错误信息保存
     */
    public void validate() {
        //如果姓名为空 ， 则把错误信息添加到 Action 类的 fieldError
        if (this.getName() == null || this.getName().trim().equals("")) {
            addFieldError("name", "姓名是必须的");
        }
    }
}
