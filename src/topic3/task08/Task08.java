/*
 * Пусть элементами прямоугольного равнобедренного треугольника являются:
 * 1) катет а;
 * 2) гипотенуза b;
 * 3) высота h, опущенная из вершины прямого угла на гипотенузу;
 * 4) площадь S.
 * Составить программу, которая по заданному номеру и значению соответствующего элемента 
 * вычисляла бы значение всех остальных элементов треугольника.
 */

package topic3.task08;

import java.util.Scanner;

public class Task08 {

	public static void main(String[] args) {
		double a = 0;
		double b = 0;
		double h = 0;
		double s = 0;
		int elemNum = 0;

		Scanner sc = new Scanner(System.in);
		System.out.println("Введите номер элемента");
		elemNum = sc.nextInt();
		
		switch(elemNum) {
			case 1:
				System.out.println("Введите длину катета");
				a = sc.nextDouble();
				b = a * Math.sqrt(2);
				h = b / 2;
				s = 0.5 * Math.pow(a, 2);
				System.out.println("При катете, равном: " + a +
									"\nгипотенуза равна: " + b +
									"\nвысота равна: " + h + 
									"\nплощадь равна: " + s);
				break;
			case 2:
				System.out.println("Введите длину гипотенузы");
				b = sc.nextDouble();
				a = b / Math.sqrt(2);
				h = b / 2;
				s = 0.5 * Math.pow(a, 2);
				System.out.println("При гипотенузе, равной: " + b +
									"\nкатет равен: " + a +
									"\nвысота равна: " + h + 
									"\nплощадь равна: " + s);
				break;
			case 3:
				System.out.println("Введите длину высоты");
				h = sc.nextDouble();
				b = 2 * h;
				a = b / Math.sqrt(2);
				s = 0.5 * Math.pow(a, 2);
				System.out.println("При высоте, равной: " + h +
									"\nкатет равен: " + a +
									"\nгипотенуза равна: " + b + 
									"\nплощадь равна: " + s);
				break;
			case 4:
				System.out.println("Введите площадь");
				s = sc.nextDouble();
				a = Math.sqrt(2 * s);
				b = a * Math.sqrt(2);
				h = b / 2;
				System.out.println("При площади, равной: " + s +
									"\nкатет равен: " + a +
									"\nгипотенуза равна: " + b + 
									"\nвысота равна: " + h);
				break;
		}
		
		sc.close();
		
	}

}
