package com.sample;

import java.util.ArrayList;
import java.util.List;

public class AK247 {

    public static void main(String[] args) {
        A a = new A();

        List<A> alist = new ArrayList<>();
        alist.add(a);

        B b = new B();

        List<B> blist = new ArrayList<>();
        blist.add(b);

        System.out.println(alist);
        System.out.println(blist);

        a.a = 10;
        b.b=20;

        System.out.println(alist);
        System.out.println(blist);

    }

    static class A{
        int a;

        @Override
        public String toString() {
            return "A{" +
                    "a=" + a +
                    '}';
        }
    }

    static class B{
        int b;

        @Override
        public String toString() {
            return "B{" +
                    "b=" + b +
                    '}';
        }
    }
}
