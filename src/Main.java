// Formatting output of print()

// Main class
public class Main {

    // Method main to run java program
    public static void main(String[] args) {

        // Integer number
        int x = 800;

        // Printing simple integer
        System.out.printf("Integer x = %d\n", x);

        // Printing decimal with 2 digits after coma
        System.out.printf("Double x = %.2f\n", (double)x);

        // Printing number with 21 characters and 2 of them after coma
        System.out.printf("Double x = %21.2f\n", (double)x);

    }
}