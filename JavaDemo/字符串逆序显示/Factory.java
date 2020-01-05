package 字符串逆序显示;

public class Factory {
	private Factory() {} ;
	public static IStringService getInstence() {
		return new StringService() ;
	}
}
