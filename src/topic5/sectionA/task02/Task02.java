/*
 * ���� ����������� ����� �. ����������� ������� ������ � ��������� ����� ����� �����.
 */

package topic5.sectionA.task02;

public class Task02 {

	public static void main(String[] args) {
		int n = 6416879;
		
		System.out.println("�����: " + n + "\n����� ����� ������������ ����: " + permutationOfDigits(n));

	}
	
	public static int permutationOfDigits(int num) {
		String numString = Integer.toString(num);
		char[] mas = numString.toCharArray();
		
		char ch = mas[0];
		mas[0] = mas[mas.length-1];
		mas[mas.length-1] = ch;
		
		String newNumString = String.valueOf(mas);
		
		return Integer.parseInt(newNumString);
	}

}
