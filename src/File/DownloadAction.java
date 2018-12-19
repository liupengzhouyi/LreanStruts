package File;

import com.opensymphony.xwork2.ActionSupport;
import org.apache.struts2.ServletActionContext;

import java.io.FileInputStream;
import java.io.InputStream;

public class DownloadAction extends ActionSupport {

    private InputStream fileInput;

    private String fileName;

    public InputStream getFileInput() {
        return ServletActionContext.getServletContext().getResourceAsStream("uploead/" + fileName);
    }

    public void setFileInput(InputStream fileInput) {
        this.fileInput = fileInput;
    }

    public String getFileName() {
        return fileName;
    }

    public void setFileName(String fileName) {
        this.fileName = fileName;
    }

    public String execute() throws Exception {
        System.out.println("push:" + ServletActionContext.getServletContext().getResourceAsStream("uploead/" + fileName));

        fileInput = ServletActionContext.getServletContext().getResourceAsStream("uploead/" + fileName);

        return SUCCESS;
    }
}
