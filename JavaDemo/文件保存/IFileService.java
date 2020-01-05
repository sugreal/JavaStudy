package 文件保存;

import java.io.File;

public interface IFileService {
	public static final String SAVE_DIR = "D:" + File.separator + "haha" + File.separator ;
	public boolean save() ;
}
