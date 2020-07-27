package pack3;

import pack2.*;
import  pack1.*;

public class C {
    public static  void main(String []args) {
        System.out.println("Accessing public members of pack2\n");
        B b = new B();
        b.m2();

        System.out.println("Accessing public memebers of ModuleA/pack1\n");
        A a = new A();
        a.m1();
    }
}
