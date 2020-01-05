package 数字大小比较;

import java.util.Scanner;

public class InputUtil {
	private InputUtil() {}
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
