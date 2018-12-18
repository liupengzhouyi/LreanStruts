package validationNumber;

import action.StrutsAction;
import com.opensymphony.xwork2.Action;
import com.opensymphony.xwork2.ActionInvocation;
import com.opensymphony.xwork2.interceptor.AbstractInterceptor;

import java.util.Spliterators;

public class MyInterceptor extends AbstractInterceptor {
    @Override
    public String intercept(ActionInvocation actionInvocation) throws Exception {
        //get StrutsAction class object
        Number number = (Number) actionInvocation.getAction();

        //if Action class's number is 666, turn to 666 page

        if (number.getNumber().equals("665")) {
            return Action.ERROR;
        }

        //continue executing the other interceptors
        //orexecuting action 's function
        return actionInvocation.invoke();
    }
}
