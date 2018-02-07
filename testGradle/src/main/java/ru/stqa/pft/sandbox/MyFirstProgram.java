package ru.stqa.pft.sandbox;

class MyFirstProgram {
    public static void main(String[] args) {
        int b=4;
        hello ("foo");
        System.out.println(testReturn());
    }

    public static void hello (String s)
    {
        System.out.println(s);
    }

    public  static int  testReturn ()
    {
        return 5;
    }
}