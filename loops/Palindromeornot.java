import java.util.Scanner;
class Palindromeornot
{
    public static void main(String[] args) 
 {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int n = sc.nextInt();
        int Num = n;
        int reverse= 0;
        while (n != 0)
        {
            int digit = n % 10;
            reverse = reverse * 10 + digit;
            n /= 10;
        }
        if (Num == reverse)
         {
            System.out.println(Num + " is a palindrome number");
        }
       else
       {
            System.out.println(Num + " is not a palindrome number");
        }
    }
}

