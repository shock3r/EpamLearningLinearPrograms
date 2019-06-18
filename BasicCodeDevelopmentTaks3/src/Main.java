import static java.lang.Math.*;
public class Main {

    public static void main(String[] args) {

        // Вычислить значение выражения по формуле (все переменные принимают действительные значения)
       
        double x = 45;
        double y = 45;

        double z;

        z = (sin(x) + cos(y)) / cos(x)-sin(y) * tan(x*y);
        System.out.println(z);

    }
}
