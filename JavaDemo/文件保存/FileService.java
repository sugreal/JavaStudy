package 文件保存;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.PrintWriter;

public class FileService implements IFileService {
	private String name ;
	private String content ;
	public FileService() {
		this.name = InputUtil.getString("请输入文件名：") ;
		this.content = InputUtil.getString("请输入内容：") ;
	}
	public boolean save() {
		// TODO Auto-generated method stub
		File file = new File(IFileService.SAVE_DIR + this.name) ;
		PrintWriter pw = null ;
		try {
			pw = new PrintWriter(new FileOutputStream(file));
			pw.print(this.content) ;
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			return false ;
		} finally {
			if (pw != null) {
				pw.close() ;
			}
		}
		return true;
	}

}
