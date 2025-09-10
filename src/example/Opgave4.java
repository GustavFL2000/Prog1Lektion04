package example;
import java.util.Scanner;


public class Opgave4 {

    public static int mathPow(int x, int y){
        int result = 1;
        int i =0;
        while(i<y){
            result *= x;
            i++;
        }
        return result;
    }
    public static void main(String[] args) {
        while(true){
        Scanner scanner = new Scanner(System.in);
        System.out.print("Indtast et tal: ");
        int number = scanner.nextInt();
        System.out.print("Indtast endnu et tal: ");
        int power = scanner.nextInt();
        System.out.println(mathPow(number, power));
        }
    }
}
