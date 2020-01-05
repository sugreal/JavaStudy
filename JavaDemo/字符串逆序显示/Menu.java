package 字符串逆序显示;

import java.util.Arrays;

public class Menu {
	private IStringService stringService ;
	public Menu() {
		this.stringService = Factory.getInstence() ;
		this.show() ;
		this.choose() ;
	}
	public void choose() {
		int choose = InputUtil.getInt("请进行选择：") ;
		switch (choose) {
		case 1 :{
			String string = InputUtil.getString("请输入字符串数据：") ;
			this.stringService.append(string) ;
			choose() ;
			}
		case 2 :{
			String result[] = this.stringService.reverse() ;
			System.out.println(Arrays.toString(result)) ;
			choose() ;
			}
		case 0 :{
			System.out.println("88") ;
			System.exit(1) ;
			}
		default:{
			System.out.println("请合法输入！");
			choose() ;
			}
		}
	}
	public void show() {
		System.out.println("1:追加字符串数据") ;
		System.out.println("2:逆序显示所有字符串数据") ;
		System.out.println("0:结束程序执行") ;
	}
}
