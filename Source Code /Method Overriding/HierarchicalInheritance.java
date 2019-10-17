/** Program to demonstrate the implementation of Hierarchical inheritance */
class employee {
	 int base = 1000;

	void salary() {
		System.out.println(base);
	}
}

class manager extends employee {
	void salary() {
		System.out.println(base + 1000);
	}
}

class clerk extends employee {
	void salary() {
		System.out.println(base + 500);
	}
}

public class HierarchicalInheritance {

	public static void main(String[] args) {
		employee a = new employee();
		employee b = new manager();
		employee c = new clerk();
		a.salary();
		b.salary();
		c.salary();

	}

}
