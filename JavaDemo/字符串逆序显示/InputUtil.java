package 字符串逆序显示;

import java.util.Scanner;

public class InputUtil {
	private InputUtil() {} ;
	@SuppressWarnings("resource")
	public static String getString(String m) {
		System.out.print(m) ;
		String str = null ;
		boolean flag = true ;
		while(flag) {
			Scanner s = new Scanner(System.in) ;
			if (s.hasNext()) {
				str = s.next().trim() ;
				if (!"".equals(str)) {
					flag = false ;
				} else {
					System.out.print("输入内容不允许为空！");
				}
			} else {
				System.out.print("输入内容不允许为空！");
			}
		}
		return str ;
	}
	@SuppressWarnings("resource")
	public static int getInt(String m) {
		System.out.print(m);
		int num = 0 ;
		boolean flag = true ;
		while(flag) {
			Scanner s = new Scanner(System.in) ;
			if (s.hasNextInt()) {
				flag = false ;
				num = s.nextInt() ;
			} else {
				System.out.print("请输入数字：") ;
			}
		}
		return num;
	}
}
