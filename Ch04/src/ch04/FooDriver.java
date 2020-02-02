/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ch04;

/**
 *
 * @author 19502
 */
public class FooDriver {
    public static void main(String[] args) {
        Foo f1 = new Foo(10);
        Foo f2 = new Foo(20);
        
        System.out.println(f1.getNum1());
        
        Foo.doSomething();
        
    }
}
