package 文件保存;

import java.util.Scanner;

public class InputUtil {
	private InputUtil() {} ;
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
}
