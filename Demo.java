class A {
    static int x=10000;
    //static A(){}
    static void display()
    {
    	System.out.println("Hiiiii!");
    }
    public static void main(String args)
    {
    	System.out.println("M1 "+args);
    }
}
public class Demo {
	public static void main(String[] args) {
		A.display();
		A.main("Pallavi");
		System.out.println(A.x);
	}
}
