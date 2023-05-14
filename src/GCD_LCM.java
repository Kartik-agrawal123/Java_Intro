import java.util.Scanner;

public class GCD_LCM {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter first no.");
        int a = sc.nextInt();
        System.out.println("enter second no.");
        int b = sc.nextInt();
        int gcd = 0;
        int min = (a>b)?b:a;
        for(int i = 1;i<=min;i++){
            if(a%i == 0 && b%i == 0){
                gcd  = i;
            }
        }

        System.out.println("gcd is "+gcd);
        int lcm = 0;
        lcm = (a*b)/gcd;
        System.out.println("lcm is "+lcm);
    }
}
