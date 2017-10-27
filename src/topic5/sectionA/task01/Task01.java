package topic5.sectionA.task01;

/*
 * Дано натуральное число п. Найти сумму первой и последней цифры этого числа.
 */

public class Task01 {

	public static void main(String[] args) {
		int n = 6416879;
		
		int sum = sumFirstLastNum(n);
		
		System.out.println("Сумма первой и последней цифр числа " + n + " равняется " + sum);
		

	}
	
	public static int sumFirstLastNum(int num) {
		String numString = Integer.toString(num);
		char[] mas = numString.toCharArray();
		int first = Integer.parseInt(String.valueOf(mas[0]));
		int last = Integer.parseInt(String.valueOf(mas[mas.length-1]));
		
		return first + last;
	}

}
