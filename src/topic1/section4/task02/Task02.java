package topic1.section4.task02;

public class Task02 {

	public static void main(String[] args) {
		int x = 4;
		int y = 4;
		
		System.out.println(((Math.pow(x, 2) + Math.pow(y, 2)) <= Math.pow(5, 2)) && 
					((Math.pow(x, 2)/Math.pow(2.5, 2) + (Math.pow(y, 2)/Math.pow(3, 2)) >= 1)) &&
					x >= 0);

	}

}
