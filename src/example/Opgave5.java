package example;
import java.util.Scanner;   

public class Opgave5 {

    public static String starFig(int n){
        String result = "";
        int i = 0;
        while(i<n){
            int j = 0;
            while(j<=i){
                result += "*";
                j++;
            }
            result += "\n";
            i++;
        }
        return result;
    }

     public static String starFig2(int n){
        String result = "";
        int i = 0;
        while(i<n){
            int j = n;
            while(j>i){
                result += "*";
                j--;
            }
            result += "\n";
            i++;
        }
        return result;
    }

    public static String starFig3(int n){
        String result = "";
        int i = 0;
        while(i<n){
            int j = 0;
            while(j<n){
                if(j<((n-1)-i)){
                    result += " ";
                } else {
                    result += "*";
                }
                j++;
            }
            result += "\n";
            i++;
        }
        return result;
    }

    public static String starFig4(int n){
        String result = "";
        int i = 0;
        while(i<n){
            int j = 0;
            while(j<n){
                if(j<i){
                    result += " ";
                } else {
                    result += "*";
                }
                j++;
            }
            result += "\n";
            i++;
        }
        return result;
    }

    public static String chooseFig(int n, int i){

        if(n == 1){
            return starFig(i);
        } else if(n == 2){
            return starFig2(i);
        } else if(n == 3){
            return starFig3(i);
        } else if(n == 4){
            return starFig4(i);
        } else {
            return "Invalid choice";
        }

    }


    public static void main(String[] args) {
        //System.out.println(starFig());
        //System.out.println(starFig2());
        //System.out.println(starFig3());
        //System.out.println(starFig4());

        while (true) {
            
        
        Scanner scanner = new Scanner(System.in);
        System.out.println("Choose a figure (1-4): ");
        int choice = scanner.nextInt();
        System.out.println("Enter the number of lines: ");
        int line = scanner.nextInt();
        System.out.println(chooseFig(choice, line));
        }
    }
}
