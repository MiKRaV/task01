/*
 * �������� ���������, �� ������ ������ ������������ ����� ���� ������������� ABC �������������. 
 * ���� ������� ���, �� ��������� �������� ���� �.
 */

package topic2.section1.b.task02;

public class Task02 {

	public static void main(String[] args) {
		int a = 4;
		int b = 3;
		int c = 4;
		double angleC = 0;
		
		if (Math.pow(a, 2) + Math.pow(b, 2) == Math.pow(c, 2)) {
			System.out.println("����������� �������������");
		} else if (Math.pow(a, 2) + Math.pow(c, 2) == Math.pow(b, 2)) {
			System.out.println("����������� �������������");
		} else if (Math.pow(b, 2) + Math.pow(c, 2) == Math.pow(a, 2)) {
			System.out.println("����������� �������������");
		} else {
			System.out.println("����������� �� �������������");
			angleC = Math.acos((Math.pow(a, 2) + Math.pow(b, 2) - Math.pow(c, 2))/(2 * a * b));
			System.out.println("���� � ����� " + Math.toDegrees(angleC));
		}

	}

}
