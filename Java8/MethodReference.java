

interface Saylable{
	void say();
}

public class MethodReference{
	public static void saySomething() {
		System.out.println("Hello, this is static method.");
	}
	 public static void main(String[] args) {
Saylable sayable = MethodReference::saySomething;
sayable.say();
	 }
}