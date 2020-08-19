public class DecimalComparator {

    public static boolean areEqualByThreeDecimalPlaces(double myFirstDouble, double mySecondDouble) {

        int myNumber = (int) (myFirstDouble * 1000);
        int mySecondNumber = (int) (mySecondDouble * 1000);

        if (myNumber - mySecondNumber == 0) {
            return true;
        } else {
            return false;
        }

    }

}
