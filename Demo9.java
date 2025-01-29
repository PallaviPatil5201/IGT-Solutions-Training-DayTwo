final class Car
{
  final int speed=200;
  String model="2020";
  int price = 100000;
  final void gare()
  {
     System.out.println("5 gares");
  }
}
class Benz extends Car
{
  void gare()
   {    
     System.out.println("Non gare");
   }
}
class Bmw extends Car
{
}
public class Demo9 {
   public static void main(String args[]){
        Car c = new Car();
        System.out.println(c.speed);
        System.out.println(c.special);
        Benz b = new Benz();
b.gare();
}
}