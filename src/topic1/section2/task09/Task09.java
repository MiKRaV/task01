/*
 * ���� ������� ��������������� ������������. 
 * ����� ������� ����� ������������, ��� ������, ������� ��������� � ��������� �����������.
 */

package topic1.section2.task09;

public class Task09 {

	public static void main(String[] args) {
		int side = 7;
		
		System.out.println("������� ������������: " + side +
						"\n�������: " + area(side) + 
						"\n������: " + height(side) + 
						"\n������ ��������� ���������� " + radiusInCircle(side) + 
						"\n������ ��������� ���������� " + radiusCircumcircle(side));
		System.out.println("   ------------   ");

	}
	
	public static double area(int side) {
		double s = Math.sqrt(3) * Math.pow(side, 2) / 4;
		return s;
	}
	
	public static double height(int side) {
		double h = Math.sqrt(3) * side / 2;
		return h;
	}
	
	public static double radiusInCircle(int side) {
		double r = side / (2 * Math.sqrt(3));
		return r;
	}
	
	public static double radiusCircumcircle(int side) {
		double r = side / Math.sqrt(3);
		return r;
	}

}
