package File;

import com.opensymphony.xwork2.ActionSupport;

import java.io.*;
import java.util.List;

public class FilesUploadAction extends ActionSupport {

    private List<File> upload;

    private List<String> uploadFileName;

    public List<File> getUpload() {
        return upload;
    }

    public void setUpload(List<File> upload) {
        this.upload = upload;
    }

    public List<String> getUploadFileName() {
        return uploadFileName;
    }

    public void setUploadFileName(List<String> uploadFileName) {
        this.uploadFileName = uploadFileName;
    }

    public String execute() throws Exception {

        System.out.println(getUpload().get(0).getAbsolutePath());
        System.out.println(getUpload());

        for (int i=0;i<getUpload().size();i++) {
            //根据上传的文件的到输入流
            InputStream inputStream = new FileInputStream(getUpload().get(i));

            //指定输出流地址
            OutputStream outputStream = new FileOutputStream("/Users/liupeng/TempFile/" + getUploadFileName().get(i));
            System.out.println("FileName:" + getUploadFileName().get(i));

            byte buffer[] = new byte[1024];

            int count = 0;

            while ((count = inputStream.read(buffer)) > 0) {
                outputStream.write(buffer, 0, count);
            }

            outputStream.close();

            inputStream.close();
        }

        return SUCCESS;
    }
}
