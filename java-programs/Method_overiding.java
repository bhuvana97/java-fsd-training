package practise;


class a{
	void a1() {
		System.out.println("a1");
	}
}

class b{
	void a1() {
		System.out.println("a2");
	}
}

class a11 extends a{
	void a1() {
		System.out.println("a11");
	}
}
public class Method_overiding {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
a11 aaA11=new a11();
aaA11.a1();

a mmA=new a11();
mmA.a1();
	}

}
