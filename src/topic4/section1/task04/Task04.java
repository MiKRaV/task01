/*
 * ����� ����� �������� ����� ����� ������ � �. 
 * ���� �� ����� ��������� �� ���������� � � �� �����. 
 * ���������� �������� ���� � ����� ������ � ����� ��� �������� � = k � � �, 
 * ������������� �� 2 �� 3 � � ����� h �.
 */

package topic4.section1.task04;

public class Task04 {

	public static void main(String[] args) {
		double x = 6;
		double y = 2;
		double h = 0.2;
		double a;
		
		int itCount = (int)((3 - 2) / h);

		for (int i = 0; i <= itCount; i++) {
			a = Math.toDegrees(Math.acos(y/x));
			System.out.println("��� x=" + x + " � y=" + y + " ���� a ����� " + a);
			y = y + h;
		}

	}

}
