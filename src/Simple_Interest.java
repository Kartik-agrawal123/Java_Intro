import java.util.Scanner;

public class Simple_Interest {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int principal = sc.nextInt();
        float rate = sc.nextFloat();
        int time = sc.nextInt();
        float SI = (principal*rate*time)/10;
        System.out.println(SI);
    }
}
