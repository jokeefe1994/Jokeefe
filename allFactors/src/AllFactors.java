public class AllFactors {

    public static void printFactors(int number) {
        if (number<1) {
            System.out.println("Invalid Value");
        }

        int factor = 0;
        while(number > factor) {
            factor++;
            if (number % factor == 0) {
                System.out.println(factor);
            }
        }
    }
}
