/*
 * ������� ����� ��������� ��������� ������������. ������ ��������� �������������. 
 * � ����� � ������������ ������� ����� ����������� ����� ������ ��������� ������������:
 * 1) ��������� � ������;
 * 2) ��� ������� � ���� ����� ���� (���� ����� � ��������);
 * 3) ��� �������.
 * ����������� ���������, ������� ����������� ����� ������ ���������, 
 * ������ ��������������� �������� � ��������� ������� ������������. 
 * ���������� ����������, ���� � �������� ������ ������ ������ 0.
 */

package topic4.section1.task01;

import java.util.Scanner;

public class Task01 {

	public static void main(String[] args) {
		int grNum = 0;
		
		Scanner sc = new Scanner(System.in);
		System.out.print("������� ����� ������ ���������: ");
		
		while (sc.hasNext()) {
			grNum = sc.nextInt();
			if (grNum == 0) break;
			triangleArea(grNum);
			System.out.print("\n������� ����� ������ ��������� "
					+ "(�� 1 �� 3 ��� 0 - ��� ��������� ����������): ");
		}
		
		sc.close();
	}
	
	public static void triangleArea(int grNum) {
		if(grNum == 1) {
			trAreaByBaseHeight(new double[] {2, 5});	
		} else if (grNum == 2) {
			trAreaByTwoSidesAndAngle(new double[] {3, 6, 1.2});
		} else if (grNum == 3) {
			trAreaByThreeSides(new double[] {5, 7, 6});
		} else {
			System.out.println("�������� ����� ������ ���������");
		}
	}
	
	public static void trAreaByBaseHeight(double[] gr) {
		double area;
		System.out.println("��������� ����� " + gr[0] + ", ������ ����� " + gr[1]);
		
		area = 0.5 * gr[0] * gr[1];
		System.out.println("������ ����� " + area);
	}
	
	public static void trAreaByTwoSidesAndAngle(double[] gr) {
		double area;
		System.out.println("������� ����� " + gr[0] + " � " + gr[1] + ", ���� ����� " + gr[2]);
		
		area = 0.5 * gr[0] * gr[1] * Math.sin(gr[2]);
		System.out.println("������ ����� " + area);
	}
	
	public static void trAreaByThreeSides(double[] gr) {
		double area;
		System.out.println("������� ����� " + gr[0] + ", " + gr[1] + " � " + gr[2]);
		
		double semiperim = 0.5 * (gr[0] + gr[1] + gr[2]);
		area = Math.sqrt(semiperim * (semiperim - gr[0]) * (semiperim - gr[1]) * semiperim - gr[2]);
		System.out.println("������ ����� " + area);
	}
}