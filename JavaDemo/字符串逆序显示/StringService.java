package 字符串逆序显示;

public class StringService implements IStringService {
	private StringBuffer buffer = new StringBuffer() ;
	public void append(String str) {
		// TODO Auto-generated method stub
		this.buffer.append(str).append("|") ;
	}

	public String[] reverse() {
		// TODO Auto-generated method stub
		String result[] = this.buffer.toString().split("\\|") ;
		int center = result.length / 2 ;
		int head = 0 ;
		int tail = result.length - 1 ;
		for (int i = 0 ; i < center ; i ++) {
			String temp = result[head] ;
			result[head] = result[tail] ;
			result[tail] = temp ;
		}
		return result ;
	}

}
