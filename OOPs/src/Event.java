
public interface Event {
	void doSomething();
}

class EventImpl implements Event {

	@Override
	public void doSomething() {
		System.out.println("First task");
	}
	
	static class InnerEventImpl implements Event {
		@Override
		public void doSomething() {
			System.out.println("Second task");
		}
	}
	
	public void oneMoreImpl() {
		class NestedEventImpl implements Event {
			@Override
			public void doSomething() {
				System.out.println("Third task");
			}
		}
		new NestedEventImpl().doSomething();
	}
	
	public void oneLastImpl() {
		Event e = new Event () {		// Anonymous Inner classes
			@Override
			public void doSomething() {
				System.out.println("Forth task");
			}
		};
		e.doSomething();
	}
	
	public void pakkaLastImpl() {
		Event e  = () -> System.out.println("Fifth task");	// Lambda Expression
		e.doSomething();
	}
	
	public static void main(String[] args) {
		EventImpl ei = new EventImpl();
		ei.doSomething();
	
//		InnerEventImpl inner = ei.new InnerEventImpl(); // Non-static inner classes
		EventImpl.InnerEventImpl inner = new EventImpl.InnerEventImpl();
		inner.doSomething();
		
		ei.oneMoreImpl();
		ei.oneLastImpl();
		ei.pakkaLastImpl();
	}
}
