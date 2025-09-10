package example;

public class Opgave6 {

    public static int tvearSum(int number){
        int sum = 0;
        while (number > 0){
            sum += number % 10;
            number /= 10;
        }
        return sum;
    }
    public static void main(String[] args) {
        System.out.println(tvearSum(345));  
        System.out.println(tvearSum(3456));
    }
}
