package cursojava.executavel;

import javax.swing.JOptionPane;

public class ArrayVetor {
//	used for execute code
	public static void main(String[] args) {
		
		int positions = Integer.parseInt(JOptionPane.showInputDialog("Quantidade de posicoes do Array?"));
		
		/* Array can be all types of data and objects too*/
		double[] notas = new double[positions];
//		notas[1] = 8.89;
//		notas[2] = 6.89;
//		notas[0] = 3.89;
		/*
		 * int[] notas2 = new int[3]; String[] notas3 = new String[3]; float[] notas4 =
		 * new float[3];
		 */
		
		for(int i = 0; i < notas.length; i++) {
			int nota = Integer.parseInt(JOptionPane.showInputDialog("Informe a nota da posição " + i));
			notas[i] = nota;
		}
		
		int count = 1;
		for (double d : notas) {
			System.out.println("Nota " + count + " " + d);
			count++;
		}
	}
}



























