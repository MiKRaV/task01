/*
 * ������������� ����� ������ 3 ���� ������� �� 2 ������. 
 * ����������, ������� ���� ����� ����� 3, 6, 9, 12,..., 24 ����.
 */

package topic4.section1.task03;

public class Task03 {

	public static void main(String[] args) {
		int countAm = 1;
		System.out.println("��������� ���������� ���� " + countAm);

		for (int i = 3; i <= 24; i=i+3) {
			countAm *= 2;
			System.out.println("���������� ���� ����� " + i + " ���(�/��): " + countAm);
		}

	}

}
