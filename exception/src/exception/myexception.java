package exception;

public class myexception {
	public static void main(String[] args) {
		myexception tct = new myexception();
		int result = tct.test();
		System.out.println("resutl " +result);
	}
	public int test() {
		int divider = 10;
		int result = 100;
		try {
			while (divider > 0) {
				divider--;
				result = result + 100/divider;
			}
			return result;
		} catch (Exception e) {
			e.printStackTrace();
			System.out.println("循环抛出异常!!!");
		} finally {
			System.out.println("finally result "+result);
		}
		System.out.println("test run end");
		return 123;
	}
}
