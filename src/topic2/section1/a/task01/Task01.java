/*
 * Даны три действительных числа. 
 * Возвести в квадрат те из них, значения которых неотрицательны, 
 * и в четвертую степень — отрицательные.
 */

package topic2.section1.a.task01;

public class Task01 {

	public static void main(String[] args) {
		int a = 25;
		int b = -56;
		int c = 123;
		
		method(a);
		method(b);
		method(c);
	}
	
	public static void method(int d) {
		int bool = d >= 0? 1 : 0;
		
		switch (bool) {
		case 0:
			System.out.println(d + " в четвертой степени: " + Math.pow(d, 4));
			break;
		case 1:
			System.out.println(d + " во второй степени: " + Math.pow(d, 2));
			break;
		}
	}

}
