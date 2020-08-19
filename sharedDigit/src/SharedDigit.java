public class SharedDigit {

    public static boolean hasSharedDigit(int number1, int number2){
        if (number1 >= 10 && number1 <= 99 && number2 >= 10 && number2 <= 99){
            int storeNumber1 = number1;
            while (storeNumber1 > 0){

                int storeNumber2 = number2;
                while (storeNumber2 > 0){
                    if(storeNumber1 % 10 == storeNumber2 % 10){
                        return true;
                    }
                    storeNumber2 /= 10;
                }
                storeNumber1 /= 10;
            }
        }
        return  false;
    }
}

