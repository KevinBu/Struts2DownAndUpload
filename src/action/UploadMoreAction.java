package action;

import com.opensymphony.xwork2.ActionSupport;
import org.apache.commons.io.FileUtils;
import org.apache.struts2.ServletActionContext;

import java.io.File;
import java.io.IOException;

/**
 * Created by OnionMac on 17/3/25.
 */
public class UploadMoreAction extends ActionSupport {

    public static String filePaht = "/Users/OnionMac/D";
    private String userName;
    private File[] file;
    /**
     * 文件名 必须的
     */

    private String[] fileFileName;
    /**
     * 文件类型
     */
    private String[] fileContentType;

    public String uploadMore() throws IOException {
        File theFile = new File(filePaht);
        if (!theFile.exists()) {
            theFile.mkdirs();
        }

        for (int i = 0; i < file.length; i++) {
            System.out.println(fileFileName[i]);
            FileUtils.copyFile(file[i],new File(theFile,fileFileName[i]));
        }
        return SUCCESS;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public File[] getFile() {
        return file;
    }

    public void setFile(File[] fileMore) {
        this.file = fileMore;
    }

    public String[] getFileFileName() {
        return fileFileName;
    }

    public void setFileFileName(String[] fileFileName) {
        this.fileFileName = fileFileName;
    }

    public String[] getFileContentType() {
        return fileContentType;
    }

    public void setFileContentType(String[] fileContentType) {
        this.fileContentType = fileContentType;
    }
}
