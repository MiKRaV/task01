/*
 * ���� ��� ���� ������������ (� ��������). 
 * ����������, ���������� �� ����� �����������, � ���� ��, �� ����� �� �� �������������.
 */

package topic2.section1.a.task03;

public class Task03 {

	public static void main(String[] args) {
		int a = 30;
		int b = 60;
		
		int ab = a + b;
		
		if(ab < 180) {
			System.out.println("����������� ����������");
			if(ab == 90) {
				System.out.println("����������� �������������");
			} else {
				System.out.println("����������� �� �������������");
			}
		}
		else {
			System.out.println("����������� �� ����������");
		}
		
		
	}

}
