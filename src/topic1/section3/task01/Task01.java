/*
 * Сумма двух первых цифр заданного четырехзначного числа равна сумме двух его последних цифр.
 */

package topic1.section3.task01;

public class Task01 {

	public static void main(String[] args) {
		int x = 1432;
		
		String xStr = Integer.toString(x);
		char[] mas = xStr.toCharArray();
		int c1 = Integer.parseInt(String.valueOf(mas[0]));
		int c2 = Integer.parseInt(String.valueOf(mas[1]));
		int c3 = Integer.parseInt(String.valueOf(mas[2]));
		int c4 = Integer.parseInt(String.valueOf(mas[3]));
		
		System.out.println((c1 + c2) == (c3 + c4));
	}

}
