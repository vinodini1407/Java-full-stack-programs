class Pattern15
{
public static void main(String[] args) {
 int n = 7;
 int mid = n / 2;
 for (int i = 0; i < n; i++) {    
  for (int j = 0; j < n; j++) {       
  if (i == mid || j == mid) {
  System.out.print("*");
  } else {
 System.out.print(" ");
 }
 }
System.out.println();             
 }
}
}