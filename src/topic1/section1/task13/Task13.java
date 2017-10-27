package topic1.section1.task13;

public class Task13 {

	public static void main(String[] args) {
		double x = 7;
		double y = 13;
		
		double term1 = Math.cos(x) / (Math.PI - 2 * x); // первое слагаемое
		double term2 = 16 * x * Math.cos(x * y); // второе слагаемое
		double res = term1 + term2 -2;
		
		System.out.println(res);
	}

}
