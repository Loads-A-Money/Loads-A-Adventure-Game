import java.util.*;

public class HelloWorld {
    
    public static Scanner in = new Scanner(System.in);
    public static String input = "";
    
    public static Boolean con = true;

    public static void main(String []args) {
        
        
        
        while(con) {
            
            if (input.equalsIgnoreCase("quit")) {
                System.out.println("Exiting game ...");
                break;
            } else {
		System.out.println(input);
	    }
        }
    }
}
