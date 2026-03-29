package study;

interface A {
    default void run() {
        System.out.println("A : run!");
    }
}

interface B {
    default void run() {
        System.out.println("B : run!");
    }
}

class C implements B, A {

    @Override
    public void run() {
        B.super.run();
    }
    
}
public class defaultMethodTest {

	public static void main(String[] args) {
		C c = new C();
		c.run();

	}

}
