package topic1.section1.task07;

public class Task07 {

	public static void main(String[] args) {
		double x = 7;
		double y = 13;
		
		double den = x + Math.pow(x, 2)/4; // ����������� �� ������ ���������
		double factor1 = y - Math.sqrt(Math.abs(x)); // ������ ���������
		double factor2 = x - y / den; // ������ ���������
		
		double res = Math.log(Math.abs(factor1 * factor2));
		System.out.println(res);
	}

}
