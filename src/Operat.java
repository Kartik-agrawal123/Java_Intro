import java.util.Scanner;

public class Operat {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a1 = sc.nextInt();
        int a2 = sc.nextInt();
        String s = sc.next();
        char ch = s.trim().charAt(0);
        if(ch == '+'){
            System.out.println(a1+a2);
        }
        else if(ch == '-'){
            System.out.println(a1-a2);
        }
       else  if(ch == '*'){
            System.out.println(a1*a2);
        }
        else if(ch == '/'){
            System.out.println(a1/a2);
        }
        else{
            System.out.println("invalid input");
        }
    }
}
