package 数字大小比较;

public class Testcase {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Inumber num = Factory.getInstance() ;
		int n = InputUtil.getInt("请输入要比较的数字个数：") ;
		int result[] = num.stat(n) ;
		System.out.println("最大数是：" + result[0] + "-----" + "最小数是：" + result[1]);
	}

}
