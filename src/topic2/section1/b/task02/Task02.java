/*
 * Написать программу, по длинам сторон распознающую среди всех треугольников ABC прямоугольные. 
 * Если таковых нет, то вычислить величину угла С.
 */

package topic2.section1.b.task02;

public class Task02 {

	public static void main(String[] args) {
		int a = 4;
		int b = 3;
		int c = 4;
		double angleC = 0;
		
		if (Math.pow(a, 2) + Math.pow(b, 2) == Math.pow(c, 2)) {
			System.out.println("Треугольник прямоугольный");
		} else if (Math.pow(a, 2) + Math.pow(c, 2) == Math.pow(b, 2)) {
			System.out.println("Треугольник прямоугольный");
		} else if (Math.pow(b, 2) + Math.pow(c, 2) == Math.pow(a, 2)) {
			System.out.println("Треугольник прямоугольный");
		} else {
			System.out.println("Треугольник не прямоугольный");
			angleC = Math.acos((Math.pow(a, 2) + Math.pow(b, 2) - Math.pow(c, 2))/(2 * a * b));
			System.out.println("Угол С равен " + Math.toDegrees(angleC));
		}

	}

}
