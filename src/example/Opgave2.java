package example;

public class Opgave2 {

    public static int evenNumbers(int limit){
        int i = 2;
        int sum = 0;
        while(i <= limit){
        if (sum % 2 == 0){
            sum += i;
            i += 2;
        }
    }
        return sum;
    }

    public static int squeareNumbers(int limit){
        int i = 1;
        int sum = 0;
        while(i <= limit){
            sum += i*i;
            i++;
        }
        return sum;
        
    }

    public static int evenNubersFor(){
        int sum = 0;
        for(int i = 2; i <= 100; i+=2 ){
            if (sum % 2 == 0){
            sum += i;
        }
        }
        return sum;
    }
    public static void main(String[] args) {
        
        System.out.println(evenNumbers(200));
        System.out.println(evenNubersFor());
        System.out.println(squeareNumbers(10));
    }
}
