import java.util.Scanner;
class Armstrongornot
 {
    public static void main(String[] args) {
        int sum = 0, rem, temp;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int n = sc.nextInt();              
        int l = String.valueOf(n).length();
        temp = n;
        while (n > 0) {
            rem = n % 10;
            sum += Math.pow(rem, l);
            n =n/10;
        }
        if (temp == sum)
        {
            System.out.println(temp + " is an Armstrong number.");
        }
       else
        {
            System.out.println(temp + " is not an Armstrong number.");
        }
   }

