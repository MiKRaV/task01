/*
 * Заданы координаты трех вершин треугольника (x1, y1), (х2, y2), (x3, y3). 
 * Найти его периметр и площадь.
 */

package topic1.section2.task02;

public class Task02 {

	public static void main(String[] args) {
		double x1 = 5;
		double y1 = 5;
		double x2 = 3;
		double y2 = 2;
		double x3 = 8;
		double y3 = 9;

		double a = hypot((x1-x2), (y1-y2)); //x1y1-x2y2
		double b = hypot((x1-x3), (y1-y3)); //x1y1-x3y3
		double c = hypot((x2-x3), (y2-y3)); //x2y2-x3y3
		
		double perim = a + b + c;
		System.out.println("perimetr = " + perim);
		
		double semiperim = perim / 2; 
		double area = Math.sqrt(semiperim * (semiperim - a) * (semiperim - b) * (semiperim - c)); 
		System.out.println("area = " + area);
	}
	
	public static double hypot(double x, double y) {
		double hyp = Math.sqrt(Math.pow(x, 2) + Math.pow(y, 2));
		return hyp;
	}

}
