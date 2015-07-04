import java.io.Console;
 
public class Introductions {
  
    public static void main(String[] args) {
        Console console = System.console();
        // Welcome to the Introductions program!  Your code goes below here
        String firstName = console.readLine("What's your name?  "); // this is an example of camelcase
        console.printf("Hello, your name is %s\n", firstName);
        console.printf("%s is learning how to write Java\n", firstName);
  }
}