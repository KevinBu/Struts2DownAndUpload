package action;

import com.opensymphony.xwork2.ActionSupport;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.InputStream;

/**
 * Created by OnionMac on 17/3/26.
 */
public class DownAction extends ActionSupport {

    private InputStream inputStream;

    public InputStream getInputStream() {
        return inputStream;
    }

    public void setInputStream(InputStream inputStream) {
        this.inputStream = inputStream;
    }

    public String down() throws FileNotFoundException {
        String path = UploadMoreAction.filePaht + File.separator+"1.jpg";
        inputStream = new FileInputStream(new File(path));
        return SUCCESS;
    }
}
