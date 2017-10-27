/*
 * Составить программу для определения подходящего возраста кандидатуры для вступления в брак, 
 * используя следующее соображение: возраст девушки равен половине возраста мужчины плюс 7, 
 * возраст мужчины определяется соответственно как удвоенный возраст девушки минус 14.
 */

package topic3.task23;

import java.util.Scanner;

public class Task23 {

	public static void main(String[] args) {
		String sex = "";
		int age = 0;
		double ageOfMarriage = 0;
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Введите пол (муж/жен):");
		sex = sc.nextLine();
		System.out.println("Введите возраст");
		age = sc.nextInt();

		switch (sex) {
		case "муж":
			ageOfMarriage = age / 2 + 7;
			System.out.println("При возрасте мужчины " + age + " лет(год) возраст девушки " +
								ageOfMarriage + " лет(год)");
			break;
		case "жен":
			ageOfMarriage = age * 2 - 14;
			System.out.println("При возрасте девушки " + age + " лет(год) возраст мужчины " +
					ageOfMarriage + " лет(год)");
			break;
		}
	
		sc.close();
	}

}
