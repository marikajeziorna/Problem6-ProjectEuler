public class MethodClass {

    public static int sumOfSquares(int numberLimit) {
        int sum = 0;
        int numberLimit2 = numberLimit + 1;
        for (int i = 1; i < numberLimit2; i++) {
            sum += i * i;
        }
        return sum;
    }

    public static int squareOfSum(int numberLimit) {
        int sum = 0;
        sum = numberLimit * (1 + numberLimit) / 2;
        sum = sum * sum;
        return sum;
    }

    public static int different(int numberLimit) {
        return sumOfSquares(numberLimit) - squareOfSum(numberLimit);
    }
}
