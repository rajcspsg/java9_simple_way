package pack3;

import pack2.*;

public class C {
    public static  void main(String []args) {
        System.out.println("Accessing public members of pack2\n");
        B b = new B();
        b.m2();
    }
}
