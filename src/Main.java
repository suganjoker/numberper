class NumberPredictor {
    public static int predictLuckyNumber(int dateOfBirth) {
        int nearestFibonacci = findNearestFibonacci(dateOfBirth);
        return nearestFibonacci;
    }

    private static int findNearestFibonacci(int n) {
        int prevFib = 0;
        int currFib = 1;
        while (currFib <= n) {
            int temp = currFib;
            currFib = prevFib + currFib;
            prevFib = temp;
        }
        if (Math.abs(n - prevFib) <= Math.abs(n - currFib)) {
            return prevFib;
        } else {
            return currFib;
        }
    }

    public static int predictUnluckyNumber(int dateOfBirth) {
        // Formula for predicting unlucky number can be added in the future
        return 0;
    }
}

class LuckyNumberPredictor {
    public static int getLuckyNumber(int dateOfBirth) {
        return NumberPredictor.predictLuckyNumber(dateOfBirth);
    }

    public static int getUnluckyNumber(int dateOfBirth) {
        return NumberPredictor.predictUnluckyNumber(dateOfBirth);
    }

    public static void main(String[] args) {
        int dateOfBirth = 100; // Replace with actual date of birth

        int luckyNumber = getLuckyNumber(dateOfBirth);
        System.out.println("Your lucky number is: " + luckyNumber);

        int unluckyNumber = getUnluckyNumber(dateOfBirth);
        System.out.println("Your unlucky number is: " + unluckyNumber);
    }
}
