class Animal
{
   public void makesount(){
       System.out.println("Animal makes a sound");
   }
}
class Dog extends Animal
{
     public void makesound() {
      System.out.println("Dog Barks....!!");
    }
}
class Cat extends Animal
{
     public void makesound() {
      System.out.println("Cat Meows....!!");
    }
}
public class Demo8{
   public static void main( String args[]){
      Animal dog = new Dog();
      Animal Cat = new Cat();
      Dog d = new Dog();
      d.makesound();
     }
}