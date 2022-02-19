package practise;


class new_parent{
	
	void parentmethod() {
		System.out.println("calling parent method");
	}
}
class child extends new_parent{
	
	void childmethod() {
		System.out.println("calling child method");
	}
}
public class Singlelevelinheritance {

	
	
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
child child=new child();
child.childmethod();
child.parentmethod();

	}

}
