package staticpolymorphism;

public class Calculator {
public static void main(String[] args) {
	Addition a = new Addition();
	//a.add(5,5 , 5);
	int result = a.add(5,5);
	//a.add(0, 0)
	System.out.println(result);
}
}
