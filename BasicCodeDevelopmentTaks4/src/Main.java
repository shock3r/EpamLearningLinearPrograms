import static java.lang.Math.*;
public class Main {

    public static void main(String[] args) {

        // 4. Дано действительное число R вида nnn.ddd (три цифровых разряда в дробной и целой частях). Поменять местами
        //дробную и целую части числа и вывести полученное значение числа.


        double z = 555.111;
        double drob = round(z%1 * 1000); //из дробной получили целую часть = 111
        int a = (int)z; // целая часть 555 без дробной чисти = 555
        double b = a * 0.001; // 0.555

        double x = drob + b;


        System.out.println("Before: " + z);
        System.out.println("After: " + x);


    }
}
