class Ece
{
  void hiMessage()
  {
    System.out.println("Welcome to Ece");
  } 
}
class Java extends Ece
{
   void learn()
   {
     System.out.println("Full stack java class");
   }
}
class College
{
   public  static void main(String[] args)
   {
     Ece obj1=new Ece();
     Java obj2=new Java();
     obj1.hiMessage();
     obj2.learn();

   }
}