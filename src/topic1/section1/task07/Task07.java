package topic1.section1.task07;

public class Task07 {

	public static void main(String[] args) {
		double x = 7;
		double y = 13;
		
		double den = x + Math.pow(x, 2)/4; // знаменатель во втором множителе
		double factor1 = y - Math.sqrt(Math.abs(x)); // первый множитель
		double factor2 = x - y / den; // второй множитель
		
		double res = Math.log(Math.abs(factor1 * factor2));
		System.out.println(res);
	}

}
