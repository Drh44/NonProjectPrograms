
public class NameCollection implements NameCollector {
String[] names;
int elementCount;
public NameCollection() {
	names = null;
}

public NameCollection(String[] Name) {
	names = Name;
}

public Boolean hasNext(int i, int elementCount) {
	
	boolean answer;
	if (i < elementCount ) {
		answer = true;
	}
	else {
		answer = false;
	}
	return answer;
}

public String getNext (String[] Name, int i) {
	return Name[i];
}



}
