package 文件保存;

public class Factory {
	private Factory() {} ;
	public static IFileService getInstence() {
		return new FileService() ;
	}
}
