package File;

import com.opensymphony.xwork2.ActionSupport;
import org.apache.struts2.ServletActionContext;

import java.io.*;

public class UploadAction extends ActionSupport {

    //上传文件
    private File file;

    //上传文件名字
    private String fileFileName;

    //上传文件类型
    private String fileFileType;

    public File getFile() {
        return file;
    }

    public void setFile(File file) {
        this.file = file;
        System.out.println(file.getAbsolutePath());
    }

    public String getFileFileName() {
        return fileFileName;
    }

    public void setFileFileName(String fileFileName) {
        this.fileFileName = fileFileName;
    }

    public String getFileFileType() {
        return fileFileType;
    }

    public void setFileFileType(String fileFileType) {
        this.fileFileType = fileFileType;
    }

    public String execute() throws Exception {

        System.out.println(getFile().getAbsolutePath());
        System.out.println(getFile());

        //根据上传的文件的到输入流
        InputStream inputStream = new FileInputStream(getFile());

        //指定输出流地址
        OutputStream outputStream = new FileOutputStream("/Users/liupeng/TempFile/" + getFileFileName());
        System.out.println("FileName:" + getFileFileName());

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
