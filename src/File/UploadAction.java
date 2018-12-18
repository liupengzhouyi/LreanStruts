package File;

import com.opensymphony.xwork2.ActionSupport;
import org.apache.struts2.ServletActionContext;

import java.io.*;

public class UploadAction extends ActionSupport {

    //上传文件
    private File file;

    //上传文件名字
    private String UploadFileName;

    public File getFile() {
        return file;
    }

    public void setFile(File file) {
        this.file = file;
        System.out.println(file.getAbsolutePath());
    }

    public String getUploadFileName() {
        return UploadFileName;
    }

    public void setUploadFileName(String uploadFileName) {
        UploadFileName = uploadFileName;
    }

    public String execute() throws Exception {

        System.out.println(getFile().getAbsolutePath());

        //根据上传的文件的到输入流
        InputStream inputStream = new FileInputStream(getFile());



        //指定输出流地址
        OutputStream outputStream = new FileOutputStream("D:\\Code\\tempFile\\" + getUploadFileName());

        byte buffer[] = new byte[1024];

        int count = 0;

        while ((count = inputStream.read(buffer)) > 0) {
            outputStream.write(buffer, 0, count);
        }

        outputStream.close();

        inputStream.close();

        return SUCCESS;
    }
}
