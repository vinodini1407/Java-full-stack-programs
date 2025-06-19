import java.util.Scanner;
class Largestnumber{
  public static void main(String[] args){
    Scanner sc=new Scanner(System.in);
    int a=sc.nextInt();
    int b=sc.nextInt();
    int c=sc.nextInt();
    if(a>b && a>c){
      System.out.println(a+" is largest number");
    }
    else if(b>c && b>a){
      System.out.println(b+" is largest number");
    }
    else if(c>a && c>b){
      System.out.println(+c+" is largest number");
    }
    else if(a==b && a>c){
      System.out.println(a+" is largest number");
    }
    else if(b==c && b>a){
      System.out.println(b+" is largest number");
    }
    else if(a==c && a>b){
      System.out.println(c+" is largest number");
    }
    else{
      System.out.println("All are Equal");
  }
}
}
 