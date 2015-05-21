

import java.util.*;

public class Main {

    public int a;
    public int  b;
    public String z;

    public static void main(String[] args) {
        Float q = new Float(0f);
        int c;
        Scanner s = new Scanner(System.in);

        System.out.println("Первое число:");
        Integer a = s.nextInt();
        System.out.println("Второе число:");
        Integer b = s.nextInt();
        System.out.println("Знак операции:");
        String z = s.next();


        Calculator f = new Calculator();
        if (z.equals("+")) {
            c = f.add(a, b);
            System.out.println(String.valueOf(c));
        } else if (z.equals("-")) {
            c = f.sub(a, b);
            System.out.println(String.valueOf(c));
        } else if (z.equals("*")) {
            c = f.mul(a, b);
            System.out.println(String.valueOf(c));
        } else if (z.equals("/")) {
            q = f.div(a, b);
        } else System.out.println("Ошибка");
        if (Float.isInfinite(q)) {
            System.out.println("Произошла недопустимая арифметическая операция");
          
        }
        ;
    }

}
