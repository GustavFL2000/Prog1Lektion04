package example;

public class Opgave3 {

    public static int lilleTabel(int number){
        int i = 1;
        while(i <= 10){
            System.out.printf("%4d", number*i);
            i++;
        }
        System.out.println();
        return number;

    }

    public static void fuldTabel(){
        int i = 1;
        while(i <= 10){
            lilleTabel(i);
            i++;
        }
    }

    public static void main(String[] args) {
        lilleTabel(7);
        System.out.println();
        fuldTabel();
    }
}
