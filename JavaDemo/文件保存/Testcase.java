package 文件保存;

import java.io.File;

public class Testcase {

	static {
		File file = new File(IFileService.SAVE_DIR) ;
		if (!file.exists()) {
			file.mkdirs() ;
		}
	}
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		IFileService fileService = Factory.getInstence() ;
		System.out.println(fileService.save()) ;
	}

}
