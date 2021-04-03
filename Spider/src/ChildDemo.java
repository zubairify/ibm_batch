
public class ChildDemo<Z, A> extends NewDemo<Z> {
	private A temp;
	
	public ChildDemo(Z data, A temp) {
		super(data);
		this.temp = temp;
	}

	public A getTemp() {
		return temp;
	}

	public void setTemp(A temp) {
		this.temp = temp;
	}
	
	public static void main(String[] args) {
		ChildDemo<String, Integer> d1 = new ChildDemo<String, Integer>("Hello", 100);
		System.out.println(d1.getData() + d1.getTemp());
	}
}
