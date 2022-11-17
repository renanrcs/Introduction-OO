package cursojava.executavel;

public class Matriz {

	public static void main(String[] args) {
		
		int numbers[][] = new int[2][3];
		
		numbers[0][0] = 70;
		numbers[0][1] = 80;
		numbers[0][2] = 90;
		
		numbers[1][0] = 30;
		numbers[1][1] = 88;
		numbers[1][2] = 25;
//		System.out.println(numbers.length);
//		System.out.println(numbers[0].length);
//		System.out.println(numbers[1].length);
		
		for(int i = 0; i < numbers.length; i++) {
			for (int j = 0; j < numbers[i].length; j++) {
				System.out.print(numbers[i][j]);
				if(j < numbers.length)
					System.out.print(" - ");
			}
			System.out.println();
		}

	}

}
