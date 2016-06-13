public class MyClass {
	private int a;
	private int b;

	//默认构造方法
	public MyClass() {
		a = 1;
		b = 2;
	}

	public MyClass(int a, int b) {
		this.a = a;
		this.b = b;
	}

	public int getA() {
		return a;
	}

	public void setA(int a) {
		this.a = a;
	}

	public int getB() {
		return b;
	}

	public void setB(int b) {
		this.b = b;
	}
}