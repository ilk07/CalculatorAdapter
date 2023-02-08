package hw;

public class Main {
    public static void main(String[] args) {

        Ints calc = new IntsCalculator();
        //сложение 2+2=4
        System.out.println(calc.sum(2, 2));
        //умножение 10*22=220
        System.out.println(calc.mult(10, 22));
        //возведение в 10 степень числа 2 = 1024
        System.out.println(calc.pow(2, 10));
        //деление 200:10=20
        System.out.println(calc.div(200, 10));
        //вычитание 100-90=10
        System.out.println(calc.sub(100, 90));

    }
}