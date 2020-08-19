public class TeenCheckNumber {

    public static boolean hasTeen(int firstNumber, int secondNumber, int thirdNumber) {

        return isTeen(firstNumber) || isTeen(secondNumber) || isTeen(thirdNumber);
    }

    public static boolean isTeen(int firstNumber){
        return (firstNumber >= 13 && firstNumber <= 19);
    }
}

   /* Alternate method
   public static boolean hasTeen (int a, int b, int c){
        return ((a>=13 && a<=19) || (b>=13 && b<=19) || (c>=13 && c<=19));
    }

    public static boolean isTeen (int teen){
        return ((teen>=13 && teen<=19));
    }*/
