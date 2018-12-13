package action1;

import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionSupport;

import java.util.Map;

public class NewValidateAction extends ActionSupport {

    //姓名 ：必须输入
    private String msg ;

    //年龄 ：13 - 30之间
    private int age;

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String execute() {
        if (!msg.isEmpty()) {
            Map request = (Map) ActionContext.getContext().get("request");
            request.put("name", getMsg());
            if (age <= 31 && age >= 13) {
                request.put("age", getAge());
                System.out.println("success");
                return "success";
            } else {
                System.out.println("error");
                return "error";
            }
        } else {
            System.out.println("error");
            return "error";
        }
    }
}
