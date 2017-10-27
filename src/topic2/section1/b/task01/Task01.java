/*
 * Написать программу нахождения суммы большего и меньшего из трех чисел.
 */

package topic2.section1.b.task01;

public class Task01 {

	public static void main(String[] args) {
		int a = 56;
		int b = 23;
		int c = 74;
		
		int min = 0;
		int max = 0;
		int sum = 0;
		
		if (a < b && a < c) {
			min = a;
			if (b > c) max = b;
			else max = c;
		} else if (b < a && b < c) {
			min = b;
			if (a > c) max = a;
			else max = c;
		} else {
			min = c;
			if (a > b) max = a;
			else max = b;
		}
		
		sum = min + max;
		
		System.out.println("min = " + min + 
							"\nmax = " + max + 
							"\nsum = " + sum);
	}

}
