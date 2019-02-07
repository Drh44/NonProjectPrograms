
public class Sentence {
String sentence;

public Sentence() {
	this.sentence = null;
}

public Sentence(String sentence) {
	this.sentence = sentence;
}

public String getSentence() {
	return sentence;
}

public void setSentence(String sentence) {
	this.sentence = sentence;
}

public boolean find (String subSentence , String sentence ) {
	boolean answer = false;
	int i = 0;
	
	int j = subSentence.length() + i  ;
	if (sentence.substring(i, j ).equalsIgnoreCase(subSentence) )  {
		answer = true;
		System.out.print("Substring is in the sentence");
		return answer;
	}
	else if (j >= sentence.length()) {
		System.out.println("Substring not in string");
		answer = false;
	}
	else {
	find(subSentence, sentence.substring(++i));
	}
	
	return answer;	
	
}
}
