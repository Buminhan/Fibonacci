import java.util.Scanner;
public class Fibonacci_Serisi {
    public static void main(String[] args) {
        int n, fib1=0,fib2=1, result=0;
        Scanner inp = new Scanner(System.in);
        System.out.print("Fibonacci Serisi Eleman Sayısı:");
        n = inp.nextInt();
        for(int i =1;i<=n;i++){
            System.out.print(fib1+" ");
            result = fib1+fib2;
            fib1 =fib2;
            fib2 = result;
        }
    }
}
