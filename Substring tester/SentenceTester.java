import java.util.Scanner;

public class SentenceTester {

	public static void main(String[] args) {
	String sentence;
	String subString;
	Scanner keyboard = new Scanner(System.in);
	System.out.print("Please enter a sentence");
	sentence = keyboard.nextLine();
System.out.print("Please enter the substring");
subString = keyboard.nextLine();
Sentence sentenceClass = new Sentence(sentence);
sentenceClass.setSentence(sentence);

sentenceClass.find(subString, sentenceClass.getSentence());
	}

}
