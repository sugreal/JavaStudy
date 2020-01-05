package 数字大小比较;

public class Number implements Inumber {

	public int[] stat(int count) {
		// TODO Auto-generated method stub
		int result[] = new int[2] ;
		int data[] = new int[count] ;
		for (int i = 0 ; i < data.length ; i ++) {
			data[i] = InputUtil.getInt("请输入第" + (i + 1) + "个数字：") ;
		}
		result[0] = data[0] ;
		result[1] = data[0] ;
		for (int i = 0 ; i < data.length ; i ++) {
			if (data[i] > result[0]) {
				result[0] = data[i] ;
			}
			if (data[i] < result[1]) {
				result[1] = data[i] ;
			}
		}
		return result ;
	}

}
