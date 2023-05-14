import java.util.Scanner;

public class Palindrome {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the string");
        String s = sc.next();
        char[] ch = new char[s.length()];
        for(int i = 0;i<=s.length()-1;i++){
            ch[i] = s.charAt(i);
        }
        int start = 0;
        int end = ch.length-1;
        while(start<end){
            char temp = ch[start];
            ch[start] = ch[end];
            ch[end] = temp;
            start++;
            end--;
        }
        String str = new String(ch);
        System.out.println(str);
        if(str.equals(s)){
            System.out.println("palindrome");
        }
        else{
            System.out.println("not palindrome");
        }

    }
}
