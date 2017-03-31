package patel;
import hsa_new.Console;
public class HelloConsole {

	public static void main(String[] args) {
		Console c = new Console();
    int age;
    c.println("Please enter your age");
    age = c.readInt ();
    c.println("You entered: " + age);
    age = age + 20;
    c.println("In 20 years, you will be " + age);
	}

}
