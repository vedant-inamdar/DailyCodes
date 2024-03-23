public class adddigits {
    public int addDigits(int num) {
        if (num < 10) {
            return num;
        } else {
            String str = Integer.toString(num);
            int sum = 0;

            for (char character : str.toCharArray()) {
                sum = sum + Character.getNumericValue(character);
            }

            return addDigits(sum);
        }
    }
}