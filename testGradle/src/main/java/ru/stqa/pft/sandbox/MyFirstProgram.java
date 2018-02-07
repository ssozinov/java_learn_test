package ru.stqa.pft.sandbox;

class MyFirstProgram {
    public static void main(String[] args) {
        int b=4;
        hello ("foo");
        Square s=new Square(5);
        Rectangle r= new Rectangle(5,4);


        System.out.println(area(s));
        System.out.println(area(r));
    }

    public static void hello (String s)
    {
        System.out.println(s);
    }

    public  static double  area (Square s)
    {
        return  s.l*s.l;
    }

    public  static double  area (Rectangle r)
    {
        return  r.a*r.b;
    }
}