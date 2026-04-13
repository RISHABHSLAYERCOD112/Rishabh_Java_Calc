import java.util.*;
public class sccc{
        public static void main(String[] args) {
        String input = "Java is fun";
        Scanner scanner = new Scanner(input);

        // Check if there is more text to read
        while (scanner.hasNext()) {
            String word = scanner.next(); // Read the next word
            System.out.println("Found: " + word);
        }
        
        scanner.close();
    }
}
