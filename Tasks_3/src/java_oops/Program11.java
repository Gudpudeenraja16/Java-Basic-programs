public class Program11 {
    public static void main(String[] args) {
        int[] numbers = {5, 8, 3, 10, 1};
        int greatest = findGreatest(numbers, numbers.length - 1);
        System.out.println("Greatest Number is : " + greatest);
    }

    public static int findGreatest(int[] numbers, int index) {
        
        if (index == 0) {
            return numbers[0];
        }

        int greatestOfRest = findGreatest(numbers, index - 1);
        return Math.max(numbers[index], greatestOfRest);
    }
}
