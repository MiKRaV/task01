/*
 * Сумма цифр данного трехзначного числа N является четным числом.
 */

package topic1.section3.task02;

public class Task02 {

	public static void main(String[] args) {
		int num = 364;
		
		String numStr = Integer.toString(num);
		char[] mas = numStr.toCharArray();
		
		int sum = 0;
		for(char ch : mas) {
			int x = Integer.parseInt(String.valueOf(ch));
			sum += x;
			//System.out.println(sum);
		}
		
		System.out.println(sum % 2 == 0);

	}

}
