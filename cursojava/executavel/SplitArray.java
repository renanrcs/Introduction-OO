package cursojava.executavel;

import java.util.Arrays;
import java.util.List;

public class SplitArray {

	public static void main(String[] args) {
		
		String text = " Renan, idade 23, curso Java, 70, 80, 85, 90.75";
		
		String[] newArray = text.split(","); // cria um novo array separando pleo paramentro informado
		
		System.out.println(newArray);
		
		/*Convertendo Array em Lista*/
		List<String> list = Arrays.asList(newArray);
		
		for(String valuesList : list) {
			System.out.println(valuesList);
		}
		
		/*Converter Lista para Array*/
		String[] convertionArray = list.toArray(new String[7]); 
		System.out.println(convertionArray);
		

	}

}
