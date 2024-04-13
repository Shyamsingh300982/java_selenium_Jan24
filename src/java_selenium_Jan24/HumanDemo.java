package java_selenium_Jan24;

public class HumanDemo {

	public static void main(String[] args) { // principal
		//class object = 
		Human h1 = new Human();
		
		//object.vaiable = vaiable value
		h1.name = "Uma";
		
		Human h2 = new Human();
		h2.name = "Gurpreet";
		
		Human h3 = new Human();
		h3.name = "Raman";
		
	//object.method name
		h1.speak("Hello, How are you");
		h2.speak("Hello,I am good");
		h3.speak("I am fine as well");
		
	}
}

class Human{ // 1st class
	
	// Chracteristic of human being
	
	String name;
	int age;
	double weight;
	int height;
	String country;
	
	// behaviour
	
	void speak(String contentToSpeak) { // teacher 
	System.out.println(name + " - " + contentToSpeak);
	}
}