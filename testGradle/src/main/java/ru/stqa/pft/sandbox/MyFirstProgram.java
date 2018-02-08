package ru.stqa.pft.sandbox;

class MyFirstProgram {
    public static void main(String[] args) {
        int b=4;
        hello ("foo");
        Square s=new Square(5);
        Rectangle r= new Rectangle(5,4);


        System.out.println(s.area());
        System.out.println(r.area());
    }

    public static void hello (String s)
    {
        System.out.println(s);
    }




}