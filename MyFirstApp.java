import java.util.Date;

public class MyFirstApp {
	Integer i;
	int j;

	public static void main (String[] args) {
			//MyFirstApp t = new MyFirstApp();
			//t.go();

			Date today = new Date();
			System.out.println(String.format("%tA, %<tB, %<td, %<tc, %<tr", today));
	}

	public void go() {
		j=i;


		System.out.println(j);
		System.out.println(i);
	}
}
