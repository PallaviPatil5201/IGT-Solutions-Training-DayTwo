class Parent
{
       Parent()
       {
            System.out.println("Parent class Constructor");
    
       }
       Parent(int x)
      {
            System.out.println("Parent class Constructor(int x)");
    
       }
}
class Child extends Parent
{
      Child()
            {
             System.out.println("Child class Constructor");

            }
             
}
class Demo3
{
         public static void main(String args[])
         {
                 Child c = new Child();
                
         }
}
         