/*
 * У гусей и кроликов вместе 64 лапы. 
 * Сколько может быть кроликов и гусей (указать все сочетания)?
 */

package topic4.section1.task05;

public class Task05 {

	public static void main(String[] args) {
		int pawsGeese = 2;
		int pawsRabbit = 4;
		
		int pawsTot = 64;
		int countGeese = 0;
		int countRabbit = 0;
		
		for (int i = 0; i <= pawsTot; i = i + pawsRabbit) {
			countRabbit = i / pawsRabbit;
			countGeese = (pawsTot - i) / pawsGeese;
			System.out.println("Гусей - " + countGeese + ", кроликов - " + countRabbit);
		}

	}

}
