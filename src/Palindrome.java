import java.util.Scanner;

public class Palindrome {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.next();
        System.out.println(palindrome(input,0,input.length()-1));
    }

    static boolean palindrome(String input, int start, int end) {
        if(start>end){
            return true;
        } else if (input.charAt(start)!=input.charAt(end)) {
            return false;
        }
        else{
            return palindrome(input,start+1,end-1);
        }
    }

}
