/*
 * Имеется серия измерений элементов треугольника. Группы элементов пронумерованы. 
 * В серии в произвольном порядке могут встречаться такие группы элементов треугольника:
 * 1) основание и высота;
 * 2) две стороны и угол между ними (угол задан в радианах);
 * 3) три стороны.
 * Разработать программу, которая запрашивает номер группы элементов, 
 * вводит соответствующие элементы и вычисляет площадь треугольника. 
 * Вычисления прекратить, если в качестве номера группы введен 0.
 */

package topic4.section1.task01;

import java.util.Scanner;

public class Task01 {

	public static void main(String[] args) {
		int grNum = 0;
		
		Scanner sc = new Scanner(System.in);
		System.out.print("Введите номер группы элементов: ");
		
		while (sc.hasNext()) {
			grNum = sc.nextInt();
			if (grNum == 0) break;
			triangleArea(grNum);
			System.out.print("\nВведите номер группы элементов "
					+ "(от 1 до 3 или 0 - для окончания вычислений): ");
		}
		
		sc.close();
	}
	
	public static void triangleArea(int grNum) {
		if(grNum == 1) {
			trAreaByBaseHeight(new double[] {2, 5});	
		} else if (grNum == 2) {
			trAreaByTwoSidesAndAngle(new double[] {3, 6, 1.2});
		} else if (grNum == 3) {
			trAreaByThreeSides(new double[] {5, 7, 6});
		} else {
			System.out.println("Неверный номер группы элементов");
		}
	}
	
	public static void trAreaByBaseHeight(double[] gr) {
		double area;
		System.out.println("Основание равно " + gr[0] + ", высота равна " + gr[1]);
		
		area = 0.5 * gr[0] * gr[1];
		System.out.println("Площаь равна " + area);
	}
	
	public static void trAreaByTwoSidesAndAngle(double[] gr) {
		double area;
		System.out.println("Стороны равны " + gr[0] + " и " + gr[1] + ", угол равен " + gr[2]);
		
		area = 0.5 * gr[0] * gr[1] * Math.sin(gr[2]);
		System.out.println("Площаь равна " + area);
	}
	
	public static void trAreaByThreeSides(double[] gr) {
		double area;
		System.out.println("Стороны равны " + gr[0] + ", " + gr[1] + " и " + gr[2]);
		
		double semiperim = 0.5 * (gr[0] + gr[1] + gr[2]);
		area = Math.sqrt(semiperim * (semiperim - gr[0]) * (semiperim - gr[1]) * semiperim - gr[2]);
		System.out.println("Площаь равна " + area);
	}
}