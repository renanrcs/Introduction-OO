package cursojava.executavel;

public class SplitArray {

	public static void main(String[] args) {
		
		String text = "Renan, idade 23, curso Java, 70, 80, 85, 90.75";
		
		String[] newArray = text.split(",");
		
		System.out.println(newArray);

	}

}
