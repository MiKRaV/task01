/*
 * ��������� ��������� ��� ����������� ����������� �������� ����������� ��� ���������� � ����, 
 * ��������� ��������� �����������: ������� ������� ����� �������� �������� ������� ���� 7, 
 * ������� ������� ������������ �������������� ��� ��������� ������� ������� ����� 14.
 */

package topic3.task23;

import java.util.Scanner;

public class Task23 {

	public static void main(String[] args) {
		String sex = "";
		int age = 0;
		double ageOfMarriage = 0;
		
		Scanner sc = new Scanner(System.in);
		System.out.println("������� ��� (���/���):");
		sex = sc.nextLine();
		System.out.println("������� �������");
		age = sc.nextInt();

		switch (sex) {
		case "���":
			ageOfMarriage = age / 2 + 7;
			System.out.println("��� �������� ������� " + age + " ���(���) ������� ������� " +
								ageOfMarriage + " ���(���)");
			break;
		case "���":
			ageOfMarriage = age * 2 - 14;
			System.out.println("��� �������� ������� " + age + " ���(���) ������� ������� " +
					ageOfMarriage + " ���(���)");
			break;
		}
	
		sc.close();
	}

}
