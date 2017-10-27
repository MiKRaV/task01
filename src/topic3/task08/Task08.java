/*
 * ����� ���������� �������������� ��������������� ������������ ��������:
 * 1) ����� �;
 * 2) ���������� b;
 * 3) ������ h, ��������� �� ������� ������� ���� �� ����������;
 * 4) ������� S.
 * ��������� ���������, ������� �� ��������� ������ � �������� ���������������� �������� 
 * ��������� �� �������� ���� ��������� ��������� ������������.
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
		System.out.println("������� ����� ��������");
		elemNum = sc.nextInt();
		
		switch(elemNum) {
			case 1:
				System.out.println("������� ����� ������");
				a = sc.nextDouble();
				b = a * Math.sqrt(2);
				h = b / 2;
				s = 0.5 * Math.pow(a, 2);
				System.out.println("��� ������, ������: " + a +
									"\n���������� �����: " + b +
									"\n������ �����: " + h + 
									"\n������� �����: " + s);
				break;
			case 2:
				System.out.println("������� ����� ����������");
				b = sc.nextDouble();
				a = b / Math.sqrt(2);
				h = b / 2;
				s = 0.5 * Math.pow(a, 2);
				System.out.println("��� ����������, ������: " + b +
									"\n����� �����: " + a +
									"\n������ �����: " + h + 
									"\n������� �����: " + s);
				break;
			case 3:
				System.out.println("������� ����� ������");
				h = sc.nextDouble();
				b = 2 * h;
				a = b / Math.sqrt(2);
				s = 0.5 * Math.pow(a, 2);
				System.out.println("��� ������, ������: " + h +
									"\n����� �����: " + a +
									"\n���������� �����: " + b + 
									"\n������� �����: " + s);
				break;
			case 4:
				System.out.println("������� �������");
				s = sc.nextDouble();
				a = Math.sqrt(2 * s);
				b = a * Math.sqrt(2);
				h = b / 2;
				System.out.println("��� �������, ������: " + s +
									"\n����� �����: " + a +
									"\n���������� �����: " + b + 
									"\n������ �����: " + h);
				break;
		}
		
		sc.close();
		
	}

}
