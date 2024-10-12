package com.driver;

public class Main {
    public static void main(String args[])
    {
        RWOnly obj = new RWOnly();
        obj.seta(2);
        obj.setb(3);

        System.out.println(obj.geta());
        System.out.println(obj.getb());
    }
}