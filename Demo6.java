//same method but different behaviour : name is one but behaviour is different

class A
{
       A()
       {
             System.out.println("A()");
       }
        A(int a)
       {
             System.out.println("A(int a)");
       }
        A(int a, int b)
       {
             System.out.println("A(int a, int b)");
       }
        A(String a)
       {
             System.out.println("A(String name)");
       }
       void draw(int r)
       {
             System.out.println(r*r*2);
       }
       void draw(int l, int b)
       {
        System.out.println(l * b);
       }

}
//same constructor name + mul times+ different part same class : constructor
//same method name + mul times+ different part same class : method overloading

class Demo6
{
       public static void main(String args[])
       {
             A a = new A();
             a. draw(10);
             a.draw(10,30);
             A a1 = new A(100);
             A a2 = new A(100, 200);
             A a3 = new A("Pallavi");
       }
}
