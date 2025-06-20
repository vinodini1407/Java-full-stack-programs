class Pattern5{
 public static void main(String args[]){
int i,j,k=1;
for( i=1; i<=5;i++){
for(j=1;j<=5;j++){
 System.out.print(k+"	");
if(k==9){
k=1;
continue;
}
k++;
 } 
 System.out.println();
 }
 }
 }