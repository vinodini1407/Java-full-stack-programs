class Pattern10
{
public static void main(String[]args)
{
int n=1;
for(int i=1;i<=5;i++)
{
System.out.println();
for(int j=1;j<=5;j++)
{
System.out.print(n +" ");
n++;
if(n==10)
{
n=1;
}
}
System.out.println();
}
}
}