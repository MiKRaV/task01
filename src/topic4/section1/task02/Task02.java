/*
 * ����� ����������, ��������� � ������ ���� �������� 10 ��. 
 * ������ ���� �� ���������� ������� ����� �� 10% ����� ����������� ���. 
 * ����� ��������� ���� �������� ��������� �� 7 ����?
 */

package topic4.section1.task02;

public class Task02 {

	public static void main(String[] args) {
		double distDay = 10;
		double distTot = distDay;
		
		for (int i = 0; i < 7; i++) {
			distDay = 1.1 * distDay;
			System.out.println("���������� �� ���� " + (i+1) + " ����� " + distDay);
			distTot = distTot + distDay;
		}
		
		System.out.println("����� ���������� �� 7 ���� ����� " + distTot);
	}

}
