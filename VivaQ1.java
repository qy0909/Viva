import java.util.Scanner;

public class VivaQ1 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String username;
        int countDistinctRunes = 0;
        
        // Input validation loop
        do {
            System.out.print("Enter your username: ");
            username = input.nextLine();

            // Check for lowercase English letters and length constraints
            if (!username.matches("[a-z]+")) {
                System.out.println("Username should only contain lowercase English letters.\n");
            } else if (username.length() > 100) {
                System.out.println("Username cannot be longer than 100 characters.\n");
            }

        } while (!username.matches("[a-z]+") || username.length() > 100);
        
        // Count distinct runes
        for (int i = 0; i < username.length(); i++) { // Check each rune in username
            boolean isDistinct = true; // Assume the current character is unique
            for (int j = 0; j < i; j++) { // Check if current rune(i) has existed before 
                if (username.charAt(i) == username.charAt(j)) {
                    isDistinct = false;
                    break;
                }
            }
            if (isDistinct) {
                countDistinctRunes++;
            }
        }
        
        // Output based on disctinct runes count
        if(countDistinctRunes % 2 == 0) // Check if distinct runes is even number
        {
            System.out.println("ALLY DETECTED!");
        }else{
           System.out.println("ENEMY ALERT!");
        }

    }
}
