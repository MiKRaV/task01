/*
 * Даны два угла треугольника (в градусах). 
 * Определить, существует ли такой треугольник, и если да, то будет ли он прямоугольным.
 */

package topic2.section1.a.task03;

public class Task03 {

	public static void main(String[] args) {
		int a = 30;
		int b = 60;
		
		int ab = a + b;
		
		if(ab < 180) {
			System.out.println("Треугольник существует");
			if(ab == 90) {
				System.out.println("Треугольник прямоугольный");
			} else {
				System.out.println("Треугольник не прямоугольный");
			}
		}
		else {
			System.out.println("Треугольник не существует");
		}
		
		
	}

}
