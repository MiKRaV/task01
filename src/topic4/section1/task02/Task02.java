/*
 * Начав тренировки, спортсмен в первый день пробежал 10 км. 
 * Каждый день он увеличивал дневную норму на 10% нормы предыдущего дня. 
 * Какой суммарный путь пробежит спортсмен за 7 дней?
 */

package topic4.section1.task02;

public class Task02 {

	public static void main(String[] args) {
		double distDay = 10;
		double distTot = distDay;
		
		for (int i = 0; i < 7; i++) {
			distDay = 1.1 * distDay;
			System.out.println("Расстояние за день " + (i+1) + " равно " + distDay);
			distTot = distTot + distDay;
		}
		
		System.out.println("Общее расстояние за 7 дней равно " + distTot);
	}

}
