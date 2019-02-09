
public class NameCollectionTester {
	public static void main(String[] args) {
int elementCount = 5;
String[] Name  = new String[100];

NameCollection nameCollection = new NameCollection(Name);

Name[0] = ("Jim");
Name[1] = ("Chase");
Name[2] = ("Billy");
Name[3] = ("Dylan");
Name[4] = ("Paizley");

for (int i = 0; nameCollection.hasNext(i, elementCount) == true; i++) {
	System.out.println(nameCollection.getNext(Name, i));
}
}
}