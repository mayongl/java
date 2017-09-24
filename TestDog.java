//import Dog.*;

public class TestDog {
	public static void main (String[] args) {
	Dog[] dogs1 = new Dog[10];
	dogs1[1] = new Dog();
	dogs1[1].setSize(8);
	updateDogs(dogs1);
	System.out.println(dogs1[1].size);

	}
	
	public static void updateDogs(Dog[] dogs) {
		dogs[1].setSize(10);
	}


}
