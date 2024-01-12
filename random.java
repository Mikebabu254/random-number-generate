import java.util.Random;

public class random {
    public static void main(String[] args) {
        // Create a Random object
        Random random = new Random();

        // Generate an 8-digit random number
        long randomDigitNumber = 10000000 + (long)(random.nextFloat() * 90000000);

        System.out.println("random number : "+ randomDigitNumber);
    }
}
