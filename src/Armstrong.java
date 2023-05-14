import java.util.Scanner;

public class Armstrong {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int start = sc.nextInt();
        int end  = sc.nextInt();
        for(int i = start;i<=end;i++){
            if(armStr(i)){
                System.out.println(i+" is Armstrong");
            }
        }
    }
    static boolean armStr(int n){
        int temp = n;
        int s = 0;
        while(n>0){
            int rem = n%10;
            int r = rem*rem*rem;
            s = r + s;
            n = n/10;
        }
        if(temp == s){
            return true;
        }
        return false;
    }
}
