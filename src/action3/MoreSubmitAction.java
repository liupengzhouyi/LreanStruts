package action3;

import com.opensymphony.xwork2.ActionSupport;
import org.apache.struts2.interceptor.ServletRequestAware;
import javax.servlet.http.HttpServletRequest;

public class MoreSubmitAction extends ActionSupport implements ServletRequestAware {

    private String msg;
    private HttpServletRequest httpServletRequest;

    @Override
    public void setServletRequest(HttpServletRequest httpServletRequest) {
        this.httpServletRequest = httpServletRequest;
    }

    public String save() throws Exception{
        httpServletRequest.setAttribute("result", "成功保存【" + msg + "】");
        return "save";
    }

    public String print() throws Exception {
        httpServletRequest.setAttribute("result", "打印成功【" + msg + "】");
        return "print";
    }

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }

}
