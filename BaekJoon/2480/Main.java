import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int first = sc.nextInt();
        int second = sc.nextInt();
        int third = sc.nextInt();

        if(first == second && first == third && second == third){
            System.out.println(10000+(first*1000));
        }
        else if (first == second || first == third){
            System.out.println((1000+(first*100)));
        }
        else if (second == third){
            System.out.println((1000+(second*100)));
        }
        else {
            System.out.println(100* Math.max(first,Math.max(second,third)));
        }
    }
}
