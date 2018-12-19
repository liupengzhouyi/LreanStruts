package File;

import File.Tools.MyUtil;
import com.opensymphony.xwork2.ActionSupport;
import org.apache.struts2.ServletActionContext;

import java.io.FileInputStream;
import java.io.InputStream;
import java.io.UnsupportedEncodingException;

public class DownloadAction extends ActionSupport {

    private String downPath;
    private String contentType;
    private String filename;

    public String getDownPath() {
        return downPath;
    }

    public void setDownPath(String downPath1) {
        try {
            //解决下载时候，中文文件乱码问题
            downPath1 = new String(downPath1.getBytes("ISO-8859-1"), "UTF-8");
        } catch (UnsupportedEncodingException e) {
            e.printStackTrace();
        }
        this.downPath = downPath1;
    }

    public String getContentType() {
        return contentType;
    }

    public void setContentType(String contentType) {
        this.contentType = contentType;
    }

    public String getFilename() {
        return filename;
    }

    public void setFilename(String filename) {
        this.filename = filename;
    }

    /**
     * 下载是返回一个InputStream实例，该方法对应Action
     * @return
     */
    public InputStream getInputStream() {
        return ServletActionContext.getServletContext().getResourceAsStream(downPath);
    }

    public String execute() throws Exception {

        //System.out.println("path;" + ServletActionContext.getServletContext().getResourceAsStream("/downPath"));

        //下载时候保存的文件名 和 被下载的文件名 保存一致
        filename = downPath;

        //下载文件路径 在webapps 目录中创建Image;
        downPath = "images/" + downPath;

        //保存的文件类型
        contentType = "application/x-msdownload";

        /**
         * 对下载的文件按照 UTF-8 的编码
         * 解决西崽时候的窗口的中文乱码问题
         */
        filename = MyUtil.tiUTF8String(filename);

        return SUCCESS;
    }



}
