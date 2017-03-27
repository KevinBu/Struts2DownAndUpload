package action;

import com.opensymphony.xwork2.ActionSupport;
import org.apache.commons.io.FileUtils;
import org.apache.struts2.ServletActionContext;

import java.io.File;
import java.io.IOException;
import java.util.LinkedHashMap;
import java.util.concurrent.ConcurrentHashMap;

/**
 * Created by OnionMac on 17/3/24.
 */
public class UploadAction extends ActionSupport {
    /**
     * 文件存储的地址
     */
    String filePaht = "/Users/OnionMac/D";
    private String userName;
    private File file;

    /**
     * 文件名 必须的
     */

    private String fileFileName;
    /**
     * 文件类型
     */
    private String fileContentType;
    public String upload() throws IOException {
        File theFile = new File(filePaht);
        if (!theFile.exists()) {
            theFile.mkdirs();
        }
        FileUtils.copyFile(file,new File(theFile,fileFileName));
        return SUCCESS;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public File getFile() {
        return file;
    }

    public void setFile(File file) {
        this.file = file;
    }

    public String getFileFileName() {
        return fileFileName;
    }

    public void setFileFileName(String fileFileName) {
        this.fileFileName = fileFileName;
    }

    public String getFileContentType() {
        return fileContentType;
    }

    public void setFileContentType(String fileContentType) {
        this.fileContentType = fileContentType;
    }
}
