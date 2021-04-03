
public class NewDemo<Z> {
	private Z data;
	
	public NewDemo(Z data) {
		this.data = data;
	}

	public Z getData() {
		return data;
	}

	public void setData(Z data) {
		this.data = data;
	}
	
	public static void main(String[] args) {
		NewDemo<String> d1 = new NewDemo<String>("Hello");
//		d1.setData(1000);
		System.out.println(d1.getData());
		
		NewDemo<Integer> d2 = new NewDemo<Integer>(1000);
		System.out.println(d2.getData());
	}
}
